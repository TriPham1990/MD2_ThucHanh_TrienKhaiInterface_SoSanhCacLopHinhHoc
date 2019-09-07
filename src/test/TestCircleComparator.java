package test;

import chillshape.Circle;
import extendscomparator.CircleComparator;

import java.util.Arrays;
import java.util.Comparator;


public class TestCircleComparator {
    public static void main(String[] args) {
        Circle[] circles = new Circle[4];
        circles[0] = new Circle();
        circles[1] = new Circle(4.5);
        circles[2] = new Circle(3.9,"blue",true);
        circles[3] = new Circle(1.5);

        System.out.println("Pre Sorted");
        for(Circle circle : circles){
            System.out.println(circle);
        }

        CircleComparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After Softed");
        for(Circle circle : circles){
            System.out.println(circle);
        }
    }
}
