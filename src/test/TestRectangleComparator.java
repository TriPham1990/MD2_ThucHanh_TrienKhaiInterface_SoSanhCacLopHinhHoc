package test;

import chillshape.Rectangle;
import extendscomparator.RectangleComparator;

import java.util.Arrays;

public class TestRectangleComparator {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[5];
        rectangles[0] = new Rectangle();
        rectangles[1] = new Rectangle(12,31);
        rectangles[2] = new Rectangle(25,10);
        rectangles[3] = new Rectangle(7,6,"yeloow",false);
        rectangles[4] = new Rectangle(2,3,"pink",true);

        System.out.println("Pre Sorted");
        for(Rectangle rectangle : rectangles){
            System.out.println(rectangle);
        }

        RectangleComparator rectangleComparator = new RectangleComparator();
        Arrays.sort(rectangles,rectangleComparator);

        System.out.println("After Sorted");
        for(Rectangle rectangle : rectangles){
            System.out.println(rectangle);
        }
    }
}
