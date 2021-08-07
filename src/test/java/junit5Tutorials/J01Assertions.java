package junit5Tutorials;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class J01Assertions {
    @Test
    @DisplayName("length methot testi")
    void testToAssert() {
        int actual = "ABCDEF".length();
        int expected = 7;

        //1. assertEquals()
//        assertEquals(expected, actual, "Hatasiz kul olmaz,uzunluk hatali");
//        assertEquals(expected, "abcd".length(), "uzunluk esit değil");

        //2. assertNotEquals
        assertNotEquals(expected, actual, "Not: Deeğerler eşit olmamalı");

        //3. assertTrue
        expected = 6;

        assertTrue(expected == actual, "TRUE:değerler birbirine eşit olmalı");
        expected = 7;
        assertFalse(expected == actual, "FALSE:değerler birbirine eşit olmamalı");

    }

    @Test
    void testToConvertUpper() {
        String actual = "abcd".toUpperCase();
        String expected = "ABCD";
        assertEquals(expected, actual, "değerler eşit değil");
        assertTrue(expected.equals(actual), "TRUE eşit değil");
        //assertNull

//        assertNull(actual); //Expected :null beklenirken dolu geldi..

//        assertNull(actual, "içerik Null dönmeli");
    }
    @Test
    void testToContain(){
        boolean actual="abcd".contains("hi");
        boolean expected=false;
        assertEquals(expected,actual,"String hi içeriyor fakat içermemeliydi.");
    }
    @Test
    @DisplayName("split methodu ile String dizi testi")
    void testWithArrays(){
        String str="Java test Junit test";
        String actual []=str.split(" ");
        String expected []={"Java","test","Junit","test"};

        //assertArrayEquals() diziler birbirine eşit mi
        assertArrayEquals(expected,actual,"diziler birbirine eşit değiller");
    }

}
