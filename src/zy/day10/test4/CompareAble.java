package zy.day10.test4;

public interface CompareAble {
    public default Apple compare(Apple a1, Apple a2) {
        return null;
    }
}
