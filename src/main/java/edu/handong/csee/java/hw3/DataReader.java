package edu.handong.csee.java.hw3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class DataReader {

	static HashMap<String, ArrayList<Message>> messages = new HashMap<String, ArrayList<Message>>();
	

	public HashMap<String, ArrayList<Message>> getData(String strDir){
		File myDir = getDirectory(strDir);
		File[] files = getListOfFilesFromDirectory(myDir);
		readFiles(files);
		return messages;
	}
/*	public ArrayList<String> getData(String strDir){
		
		//(1)get Directory
		File mydir = getDirectory(strDir);
		
		//(2)get list of files from the directory
		File[] files = getListOfFilesFromDirectory(mydir);
		
		//(3)read strings from the file.
		ArrayList<String> messages = readFiles(files);
		
		return messages;
		
	}*/
	
	private static File getDirectory(String strDir) {
		File myDirectory = new File(strDir);
		return myDirectory;
	}
	
	private static File[] getListOfFilesFromDirectory(File dataDir) {
		
		for(File file:dataDir.listFiles()) {
			System.out.println(file.getAbsolutePath());
		}
		
		return dataDir.listFiles();
	}
	/*
	private ArrayList<String> readFiles(File[] dataDir){
		
		ArrayList<String> message = new ArrayList<String>();
		
		for(int i = 0; i<dataDir.length; i++) {
			String fileName = dataDir[i].getAbsolutePath();
			Scanner inputStream = null;
			try {
				inputStream = new Scanner(new File(fileName));
			} catch(FileNotFoundException e) {
				System.out.println(fileName + " opening error");
				System.exit(0);
			}
			
			while(inputStream.hasNextLine()) {
				String line = inputStream.nextLine();
				System.out.println(line);
			}
			inputStream.close();
		}
		return message;
	}
	*/
	public File[] getListOfFiles(File dataDir) {
		return dataDir.listFiles();
	}

	public void readFiles(File[] files) {
		File file = null;
		for(int i=0; i<files.length-1; i++) {
			file = files[i];
			System.out.println("Read a file: " + file.getName());
			if(file.getName().endsWith(".csv"))
				DataReaderForCSV.getMessagesFromCSVFiles(file);
			else if(file.getName().endsWith(".txt"))
				DataReaderForTXT.getMessagesFromTXTFiles(file);
		}
	}

}
