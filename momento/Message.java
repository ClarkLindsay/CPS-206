public class Message {

	private final String message;
	private final State state;

	public Message(String message, State state){
		this.message = message;
		this.state = state;
	}

	public String toString(){
		return this.state + " :: " + this.message;
	}
}