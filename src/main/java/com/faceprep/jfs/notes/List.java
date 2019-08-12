package com.faceprep.jfs.notes;

import org.springframework.stereotype.Component;
//defines that this class is a component and we can use it as beans
@Component("List")
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
