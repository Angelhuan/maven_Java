package com.hand;

import java.io.File;
import java.io.IOException;
import java.util.List;

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
			
			
			List<String> lines = FileUtils.readLines(file,"utf-8");
			
			System.out.println("111111111111111111111");
			System.out.println(lines.get(0));
			
			System.out.println(string);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
