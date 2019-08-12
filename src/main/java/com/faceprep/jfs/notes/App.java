package com.faceprep.jfs.notes;
//import org.spring.framework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*
    	List l=new List();
		l.setContent("chu");
		System.out.println(l.getContent());
		
		Image im=new Image();
		im.setContent("mchu");
		System.out.println(im.getContent());
		*/
    	ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	//NoteType i=new Image();
    	//System.out.println(i.printContent());
    	NoteType n=(NoteType) context.getBean("List");//getting bean from ApplicationContext.xml named "note"
    	//i.printContent();
    	n.printContent();
    }
}
