package com.json;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JSON {
	@Test
	public void fun1(){
		JSONObject jo = new JSONObject();
		jo.put("name", "zhangSan");
		jo.put("age", "18");
		jo.put("sex", "male");
		System.out.println(jo.toString());
	}
	
	
	@Test
	public void fun2(){
		
		FileInputStream fis;
		try {
			fis = new FileInputStream("test.json");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			String line = null;
			StringBuffer sb = new StringBuffer();
			while((line = br.readLine()) != null){
				sb.append(line);
				
			}
			System.out.println(sb.toString());
			
			String json = sb.toString();
			JSONObject jo = JSONObject.fromObject(json);
			System.out.println(jo);
			
			System.out.println(jo.get("name"));
			jo.remove("name");
			System.out.println(jo);
			
			
			br.close();
			isr.close();
			fis.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//JSONObject jo = new JSONObject();
		
	}
	
	
	
	@Test
	public void fun3(){
		FileInputStream fis;
		try {
			fis = new FileInputStream("test2.json");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			String line = null;
			StringBuffer sb = new StringBuffer();
			while((line = br.readLine()) != null){
				sb.append(line);
				
			}
			System.out.println(sb.toString());
			
			String json = sb.toString();
			int i = json.indexOf("[");
			System.out.println(i);
			String json2 = json.substring(14,json.length()-1);
			System.out.println(json2);
			JSONArray array = JSONArray.fromObject(json2);
			System.out.println("111");
			System.out.println(array);
			
			
			br.close();
			isr.close();
			fis.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
}
