package com.hand;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		System.out.println( "Hello World! 1 呵呵 " );
	}
	
	
	
	
	
	@Test
	public void fun1(){
		
		try {
			File file = new File("text.txt");
			String string = FileUtils.readFileToString(file,"UTF-8");
			
			System.out.println(string);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
