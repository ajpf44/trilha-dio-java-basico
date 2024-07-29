package edu.dio.spring.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LogMethods {
	@Autowired
	private Doc doc;
	
	public void logTenTimes()
	{
		for(int i =0; i< 10; ++i) {
			System.out.println( (i) + " msg logged from non a static method");
		}
	}
	
	public void logDoc() {
		System.out.println(this.doc.toString());
	}
}
