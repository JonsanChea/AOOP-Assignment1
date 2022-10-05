package sait.sos.problemdomain;

public class Cylinder extends Shape3D {
	
	private double height;
	private double radius;

	public Cylinder(double height, double radius) {
		super();
		this.height = height;
		this.radius = radius;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "Cylinder [height=" + height + ", radius=" + radius + "]";
	}
}
