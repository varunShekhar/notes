package com.faceprep.jfs.notes;

public class List implements NoteType{
	String content;

	public List() {
		super();
		this.content = "This is List";
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void printContent() {
		// TODO Auto-generated method stub
		System.out.println(this.content);
	}

}
