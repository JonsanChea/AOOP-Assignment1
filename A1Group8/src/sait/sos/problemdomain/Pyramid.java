package sait.sos.problemdomain;

public class Pyramid extends Shape3D{
	
	private double height;
	private double edgeLength;
	
	
	
	public Pyramid(double height, double edgeLength) {
		super();
		this.height = height;
		this.edgeLength = edgeLength;
	}

	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
	}



	public double getEdgeLength() {
		return edgeLength;
	}



	public void setEdgeLength(double edgeLength) {
		this.edgeLength = edgeLength;
	}

	@Override
	public String toString() {
		return "Pyramid [height=" + height + ", edgeLength=" + edgeLength + "]";
	}

	@Override
	public int compareTo(Shape3D o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
