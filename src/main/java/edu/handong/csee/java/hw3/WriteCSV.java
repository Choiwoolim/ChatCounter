package edu.handong.csee.java.hw3;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteCSV {
	public void createCSV(ArrayList<String> result, String output){	
		try{
			FileOutputStream fileOutputStream = new FileOutputStream(output);
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "MS949");
			BufferedWriter fw = new BufferedWriter(outputStreamWriter);
			for(String line : result){
				System.out.println(line);
				fw.write(line+"\n");
			}
			fw.flush();
			fw.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
