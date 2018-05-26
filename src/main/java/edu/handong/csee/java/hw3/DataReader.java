package edu.handong.csee.java.hw3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataReader {

	
	public ArrayList<String> getData(String strDir){
		
		//(1)get Directory
		File mydir = getDirectory(strDir);
		
		//(2)get list of files from the directory
		File[] files = getListOfFilesFromDirectory(mydir);
		
		//(3)read strings from the file.
		ArrayList<String> messages = readFiles(files);
		
		return messages;
		
	}
	
	private File getDirectory(String strDir) {
		File myDirectory = new File(strDir);
		return myDirectory;
	}
	
	private File[] getListOfFilesFromDirectory(File dataDir) {
		
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
	public ArrayList<String> readFiles(File[] files){
		ArrayList<String> messages = new ArrayList<String>();
		
		//Same logic that read files must be here
		
		return messages;
	}
		

}
