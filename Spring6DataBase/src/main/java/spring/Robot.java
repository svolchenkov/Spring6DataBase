package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Robot {
	
	private String id = "id";
	private String speech = "speech";
	
	
	public Robot() {
		super();
	}

	public String getId() {
		return id;
	}

	@Autowired
	public void setId(@Value("${jdbc.user}") String id) {
		this.id = id;
	}

	public String getSpeech() {
		return speech;
	}

	@Autowired
	public void setSpeech(@Value("${jdbc.password}") String speech) {
		this.speech = speech;
	}
	
	public void speech() {
		System.out.println( id + " : " + speech);
	}
	
}
