package sait.sos.problemdomain;

public class Cone extends Shape3D {

	private double height;
	private double radus;
	
	public Cone(double height, double radus) {
		super();
		this.height = height;
		this.radus = radus;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getRadus() {
		return radus;
	}


	public void setRadus(double radus) {
		this.radus = radus;
	}


	@Override
	public String toString() {
		return "Cone [height=" + height + ", radus=" + radus + "]";
	}


	@Override
	public int compareTo(Shape3D o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
