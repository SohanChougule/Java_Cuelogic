
public class PhoneBuilder {
	
	private String os;
	private String processor;
	private int camera;
	private int ram;
	private int battery;
	
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setCamera(int camera) {
		this.camera = camera;
		return this;
	}
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	
	@Override
	public String toString() {
		return "PhoneBuilder [os=" + os + ", processor=" + processor + ", camera=" + camera + ", ram=" + ram
				+ ", battery=" + battery + "]";
	}
	
	
	public Phone getPhone() {
		return new Phone(os,processor,camera,ram,battery);
	}
}
