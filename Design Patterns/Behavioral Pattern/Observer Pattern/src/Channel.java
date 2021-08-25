import java.util.ArrayList;
import java.util.List;

public class Channel {
	
	List<Subscriber> subs = new ArrayList<Subscriber>();
	private String title;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void subscribe(Subscriber sub) {
		subs.add(sub);
	}
	
	public void unsubscribe(Subscriber sub) {
		subs.remove(sub);
	}
	
	public void notifySubscribers() {
		for (Subscriber subscriber : subs) {
			subscriber.update();
		}
	}
	
	public void upload(String title) {
		this.title = title;
		notifySubscribers();
	}
	
}










