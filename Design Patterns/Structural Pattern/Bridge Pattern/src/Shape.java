
public abstract class Shape {
	
	protected DrawAPIs drawAPI;
	
	protected Shape(DrawAPIs drawAPI){
	   this.drawAPI = drawAPI;
	}
	
	public abstract void draw();	
}
