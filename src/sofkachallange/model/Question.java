package sofkachallange.model;

import java.util.ArrayList;

public class Question {
	private String content;
	private ArrayList<Answer> answers;
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public ArrayList<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(ArrayList<Answer> answers) {
		this.answers = answers;
	}
	
}
