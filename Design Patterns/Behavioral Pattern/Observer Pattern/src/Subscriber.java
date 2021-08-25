
public class Subscriber {
	
	private String name;
	private Channel channel = new Channel();
	
	public Subscriber(String name) {
		this.name = name;
	}

	public void update() {
		System.out.println("hey "+name+", new video : "+ channel.getTitle());
	}
	
	public void SubscribeChannel(Channel ch) {
		channel = ch;
	}
}
