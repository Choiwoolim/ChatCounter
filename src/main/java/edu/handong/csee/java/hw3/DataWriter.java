package edu.handong.csee.java.hw3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.io.BufferedWriter;
import java.io.FileWriter;



public class DataWriter {
	public void fileWrite(HashMap<String, Integer> result) throws IOException{
		try{
			FileWriter fw = new FileWriter("C:/out.csv");
			//BufferedWriter bw = new BufferedWriter(fw);
			for(String user : result.keySet()){
				String line  = user + "," + result.get(user)+"\n";
			}
			fw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
