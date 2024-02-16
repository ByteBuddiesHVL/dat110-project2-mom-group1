package no.hvl.dat110.messages;

import no.hvl.dat110.common.TODO;

public class PublishMsg extends Message {

	private String user;
	private String topic;
	private String message;
	
	// message sent from client to create publish a message on a topic 

	public PublishMsg(String user, String topic, String message) {
		this.user = user;
		this.topic = topic;
		this.message = message;
	}

	public PublishMsg() {}

	// Implement object variables - a topic and a message is required

	// Complete the constructor, get/set-methods, and toString method
	// as described in the project text

	@Override
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "PublishMsg{" +
				"user='" + user + '\'' +
				", topic='" + topic + '\'' +
				'}';
	}
}
