package com.example.dolce;

import java.io.*;
import java.util.Scanner;




/**
 * 
 * @author Lloyd Slade
 * 
 * data persistence model for Dolce App
 * --might use SQLite once I find some decent documentation for it
 * 
 *
 */
public class DolceBase  
{
	
	File file;
	FileOutputStream output;

	public DolceBase() throws IOException
	{
		
		//file= new Scanner(DolceBase.class.getResourceAsStream("output.txt"));
		file= new File("output.txt");
		String path= file.getAbsolutePath();
		
		
		
	}
	
	
	public void storeExercise(String a) throws IOException
	{
		
		//output.write(a);
		
	}

	
}
	
	
	

