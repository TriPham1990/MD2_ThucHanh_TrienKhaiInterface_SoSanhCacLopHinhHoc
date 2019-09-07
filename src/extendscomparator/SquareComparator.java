package extendscomparator;

import chillshape.Square;

import java.util.Comparator;

public class SquareComparator implements Comparator<Square> {
    @Override
    public int compare(Square square1, Square square2){
        if(square1.getArea() > square2.getArea()) return 1;
        else if(square1.getArea() < square2.getArea()) return -1;
        else return 0;
    }
}
