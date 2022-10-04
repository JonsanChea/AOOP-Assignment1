package sait.sos.problemdomain;

public class OctagonalPrism extends Shape3D {

	private double height;
	private double edgeLength;
	public OctagonalPrism(double height, double edgeLength) {
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
	public int compareTo(Shape3D o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String toString() {
		return "SquarePrism [height=" + height + ", edgeLength=" + edgeLength + "]";
	}
	
	
	
}
