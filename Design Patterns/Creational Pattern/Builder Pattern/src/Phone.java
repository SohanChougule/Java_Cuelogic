
public class Phone {
	private String os;
	private String processor;
	private int camera;
	private int ram;
	private int battery;
	
	public Phone(String os, String processor, int camera, int ram, int battery) {
		super();
		this.os = os;
		this.processor = processor;
		this.camera = camera;
		this.ram = ram;
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", processor=" + processor + ", camera=" + camera + ", ram=" + ram + ", battery="
				+ battery + "]";
	}
	
		
	
	
}
