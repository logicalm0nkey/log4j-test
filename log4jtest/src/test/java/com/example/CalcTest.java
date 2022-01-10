package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class CalcTest {
    // テスト開始前に1回だけ実行される
    @BeforeAll
    public static void beforeAll() {
        System.out.println("CalcTest starts!");
    }

    // 全てのテストが終了したら実行される
    @AfterAll
    public static void afterAll() {
        System.out.println("All of CalcTest have done!");
    }

    // 各テストの前に実行される
    @BeforeEach
    public void beforeEach() {
        System.out.println("Before one test.");
    }

    // 各テストの後に実行される
    @AfterEach
    public void afterEach() {
        System.out.println("After one test.");
    }

    // テストメソッド。
    // private はダメ。 static もダメ。 void 以外の戻り値もダメ。
    @Test
    public void addTest() {
        System.out.println("Add test. 2 + 3 = 5");

        Calc calc = new Calc(2);
        assertEquals(5, calc.add(3), "add error");
    }

    @Test
    public void subtractTest() {
        System.out.println("Add test. 2 - 3 = -1");

        Calc calc = new Calc(2);
        assertEquals(-1, calc.subtract(3), "subtract error");
    }
}
