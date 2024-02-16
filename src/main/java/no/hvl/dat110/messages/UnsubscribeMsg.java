package no.hvl.dat110.messages;

public class UnsubscribeMsg extends Message {

    private String user;
    private String topic;

	// message sent from client to unsubscribe on a topic 

    public UnsubscribeMsg(String user, String topic) {
        this.user = user;
        this.topic = topic;
    }

	public UnsubscribeMsg() {}

	// Implement object variables - a topic is required

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

    @Override
    public String toString() {
        return "UnsubscribeMsg{" +
                "user='" + user + '\'' +
                ", topic='" + topic + '\'' +
                '}';
    }
}
