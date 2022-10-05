package sait.sos.problemdomain;

public abstract class Shape3D implements Comparable<Shape3D> {

    private double height;

    public Shape3D() {
        super();
    }

    public Shape3D(double height) {
        this.height = height;
    }

    @Override
    public int compareTo(Shape3D that) {
        if( this.height > that.height )
        {
            return 1;
        }
        else if( this.height < that.height )
        {
            return -1;
        }
        else // this.height == that.height
        {
            return 0;
        }
    }
}