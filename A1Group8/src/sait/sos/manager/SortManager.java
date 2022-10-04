package sait.sos.manager;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import sait.sos.problemdomain.Cone;
import sait.sos.problemdomain.Cylinder;
import sait.sos.problemdomain.OctagonalPrism;
import sait.sos.problemdomain.PentagonalPrism;
import sait.sos.problemdomain.Pyramid;
import sait.sos.problemdomain.Shape3D;
import sait.sos.problemdomain.SquarePrism;
import sait.sos.problemdomain.TriangularPrism;

public class SortManager {
	private static final String PATH = "res/polyfor1.txt";
	
	private int total;
	
	Cylinder[] arrCyl;
	Cone[] arrCone;
	Pyramid[] arrPyr;
	SquarePrism[] arrSqPri;
	TriangularPrism[] arrTriPri;
	PentagonalPrism[] arrPenPri;
	OctagonalPrism[] arrOctPri;
	
	public SortManager() throws FileNotFoundException {
		System.out.println("Hello");
		loadfile();
		
	}

	private void loadfile() throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new File(PATH));
		total = in.nextInt();
		
		int counterCylinder = 0;
		int counterCone = 0;
		int counterPyramid = 0;
		int counterSqPrism = 0;
		int counterTriPrism = 0;
		int counterPenPrism = 0;
		int counterOctPrism = 0;
		
		int indexCylinder = 0;
		int indexCone = 0;
		int indexPyramid = 0;
		int indexSqPrism = 0;
		int indexTriPrism = 0;
		int indexPenPrism = 0;
		int indexOctPrism = 0;
		
		while (in.hasNext()) {
			String name = in.next();
			if (name.equalsIgnoreCase("Cylinder")) {
				counterCylinder++;
			} else if (name.equalsIgnoreCase("Cone")) {
				counterCone++;
			} else if (name.equalsIgnoreCase("Pyramid")) {
				counterPyramid++;
			} else if (name.equalsIgnoreCase("SquarePrism")) {
				counterSqPrism++;
			} else if (name.equalsIgnoreCase("TriangularPrism")) {
				counterTriPrism++;
			} else if (name.equalsIgnoreCase("PentagonalPrism")) {
				counterPenPrism++;
			} else if (name.equalsIgnoreCase("OctagonalPrism")) {
				counterOctPrism++;
			}
		}
		in.close();
		
		Scanner in2 = new Scanner(new File(PATH));
		total = in2.nextInt();
		
		arrCyl = new Cylinder[counterCylinder];
		arrCone = new Cone[counterCone];
		arrPyr = new Pyramid[counterPyramid];
		
		arrSqPri = new SquarePrism[counterSqPrism];
		arrTriPri = new TriangularPrism[counterTriPrism];
		arrPenPri = new PentagonalPrism[counterPenPrism];
		arrOctPri = new OctagonalPrism[counterOctPrism];
		
		while (in2.hasNext()) {
			String name = in2.next();
			
			if (name.equalsIgnoreCase("Cylinder")) {
				Cylinder cyl = new Cylinder(Double.parseDouble(in2.next()), Double.parseDouble(in2.next()));
				arrCyl[indexCylinder] = cyl;
				indexCylinder++;
			} else if (name.equalsIgnoreCase("Cone")) {
				Cone con = new Cone(Double.parseDouble(in2.next()), Double.parseDouble(in2.next()));
				arrCone[indexCone] = con;
				indexCone++;
			} else if (name.equalsIgnoreCase("Pyramid")) {
				Pyramid pyr = new Pyramid(Double.parseDouble(in2.next()), Double.parseDouble(in2.next()));
				arrPyr[indexPyramid] = pyr;
				indexPyramid++;
			} else if (name.equalsIgnoreCase("SquarePrism")) {
				SquarePrism sqpri = new SquarePrism(Double.parseDouble(in2.next()), Double.parseDouble(in2.next()));
				arrSqPri[indexSqPrism] = sqpri;
				indexSqPrism++;
			} else if (name.equalsIgnoreCase("TrianglarPrism")) {
				TriangularPrism tripri = new TriangularPrism(Double.parseDouble(in2.next()), Double.parseDouble(in2.next()));
				arrTriPri[indexTriPrism] = tripri;
				indexTriPrism++;
			} else if (name.equalsIgnoreCase("PentagonalPrism")) {
				PentagonalPrism penpri = new PentagonalPrism(Double.parseDouble(in2.next()), Double.parseDouble(in2.next()));
				arrPenPri[indexPenPrism] = penpri;
				indexPenPrism++;
			} else if (name.equalsIgnoreCase("OctagonalPrism")) {
				OctagonalPrism octpri = new OctagonalPrism(Double.parseDouble(in2.next()), Double.parseDouble(in2.next()));
				arrOctPri[indexOctPrism] = octpri;
				indexOctPrism++;
			}
		}
		
		in2.close();
		int test = 0;
		System.out.println(total);
		System.out.println(arrCyl[0]);
		System.out.println(arrCyl.length + arrCone.length + arrPyr.length
				+ arrSqPri.length + arrTriPri.length + arrPenPri.length + arrOctPri.length);
	}
}
