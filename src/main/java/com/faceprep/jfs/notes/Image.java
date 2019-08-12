package com.faceprep.jfs.notes;

public class Image implements NoteType{
	String content;

	public Image() {
		super();
		this.content = "This is Image";
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
