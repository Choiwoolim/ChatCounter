package edu.handong.csee.java.hw3;

import java.io.IOException;
import java.util.ArrayList;

public class HW3 {
	
	public static void main(String[] args) throws IOException {
		DataReader dataReader = new DataReader();
		ArrayList<String> result = dataReader.getData(args[0]);
		
		DataWriter dataWriter = new DataWriter();
		dataWriter.fileWrite(result);
	}	
	

}
