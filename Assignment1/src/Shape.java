
public abstract class Shape implements Comparable<Shape>{
		
	
	private double height;
	private double volume; 
	private double baseArea;
	
	public int compareTo( Shape newHeight) {
		return (int) (this.height - newHeight.height);
	}
	
	public int compareBaseArea(Shape newBaseArea) {
		return (int) (this.baseArea - newBaseArea.baseArea);
	}
	
	public int compareVolume(Shape newVolume) {
		return (int) (this.volume - newVolume.volume);
	}
	
	public Shape(double height, double volume, double baseArea) {
		super();
		this.height = height;
		this.volume = volume;
		this.baseArea = baseArea;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getBaseArea() {
		return baseArea;
	}

	public void setBaseArea(double baseArea) {
		this.baseArea = baseArea;
	}

	

}

