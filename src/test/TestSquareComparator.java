package test;

import chillshape.Square;
import extendscomparator.SquareComparator;

import java.util.Arrays;

public class TestSquareComparator {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0] = new Square();
        squares[1] = new Square(8);
        squares[2] = new Square(2,"black",true);

        System.out.println("Pre Sorted");
        for(Square square : squares){
            System.out.println(square);
        }

        SquareComparator squareComparator = new SquareComparator();
        Arrays.sort(squares,squareComparator);

        System.out.println("After Sorted");
        for(Square square : squares){
            System.out.println(square);
        }
    }
}
