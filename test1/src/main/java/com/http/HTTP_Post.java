package com.http;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class HTTP_Post {
	public static void main(String[] args) {
		new Post().start();
	}
}

class Post extends Thread{
	
	HttpClient client = HttpClients.createDefault();
	
	@Override
	public void run() {
		HttpPost post = new HttpPost("http://fanyi.youdao.com/openapi.do");
		try {
			//http://fanyi.youdao.com/openapi.do?keyfrom=tianshizhiyi&key=1253312903&type=data&doctype=<doctype>&version=1.1&q=要翻译的文本
			//keyfrom=tianshizhiyi&key=1253312903&type=data&doctype=<doctype>&version=1.1&q=要翻译的文本
			List<BasicNameValuePair> parameters = new ArrayList<>();
			parameters.add(new BasicNameValuePair("keyfrom", "tianshizhiyi"));
			parameters.add(new BasicNameValuePair("key", "1253312903"));
			parameters.add(new BasicNameValuePair("type", "data"));
			parameters.add(new BasicNameValuePair("doctype", "json"));
			parameters.add(new BasicNameValuePair("version", "1.1"));
			parameters.add(new BasicNameValuePair("q", "welcome"));
			
			post.setEntity(new UrlEncodedFormEntity(parameters, "utf-8"));
			
			HttpResponse response = client.execute(post);
			HttpEntity entity = response.getEntity();
			String res = EntityUtils.toString(entity, "utf-8");
			System.out.println(res);
		
		
		
		
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
