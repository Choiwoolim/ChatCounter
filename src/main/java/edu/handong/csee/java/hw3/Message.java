package edu.handong.csee.java.hw3;

public class Message {
	String date, user, strMessage;

	
	public Message(String date, String user, String strMessage) {
		this.date = date;
		this.user = user;
		this.strMessage = strMessage;	
	}

	
	public String getID(){
		return user;
	}
}
