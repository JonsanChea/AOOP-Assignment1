package sait.sos.compare;

import sait.sos.problemdomain.Shape3D;

import java.util.Comparator;

public class Volume implements Comparator<Shape3D> {

    @Override
        public int compare(Shape3D shape1, Shape3D shape2) {
            // TODO Auto-generated method stub
            if(shape1.getVolume()>shape2.getVolume()){
                return 1;
            } else if (shape1.getVolume()<shape2.getVolume()){
                return -1;
            } else{
                return 0;
            }
        }
}
