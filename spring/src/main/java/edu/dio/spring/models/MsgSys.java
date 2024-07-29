package edu.dio.spring.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MsgSys {
	@Value("${secretMsg}")
	private String secretMsg;
	public void sentMsg(String msg) {
		System.out.println("Mensagem mandada: " + msg);
	}
	
	public void sentGreetingMsg() {
		System.out.println("Hello, greeting to you brother!");
	}
	
	public void sentConfirmationMsg() {
		System.out.println("Are you sure about that?");
	}
	
	public void revelTheSecretMsg() {
		System.out.println(this.secretMsg);
	}
}
