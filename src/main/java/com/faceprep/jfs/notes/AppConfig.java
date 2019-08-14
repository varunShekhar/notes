package com.faceprep.jfs.notes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean("Image")
	public NoteType getMeNote()
	{
		return new Image();
	}
	
	@Bean("List")
	public NoteType getMeList()
	{
		return new List();
	}
}
