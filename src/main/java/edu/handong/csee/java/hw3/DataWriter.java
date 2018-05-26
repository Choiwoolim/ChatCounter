package edu.handong.csee.java.hw3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class DataWriter {
	public void fileWrite(ArrayList<String> result) throws IOException{
		PrintWriter pw = new PrintWriter("C:/out.txt");
		
		pw.close();
	}

}
