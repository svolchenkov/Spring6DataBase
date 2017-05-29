package sprint;

import org.springframework.stereotype.Component;

@Component
public class Robot {
	private String id = "id";
	private String speech = "speech";
	
	public Robot() {
		super();
		System.out.println( id + " : " + speech);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSpeech() {
		return speech;
	}

	public void setSpeech(String speech) {
		this.speech = speech;
	}
	
}
