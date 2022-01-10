package com.example;

/**
 * Hello world!
 *
 */
public class Calc {
    private int _basic;

    public Calc(int basic) {
        _basic = basic;
    }

    public int add(int i) {
        return _basic + i;
    }

    public int subtract(int i) {
        return _basic - i;
    }
}
