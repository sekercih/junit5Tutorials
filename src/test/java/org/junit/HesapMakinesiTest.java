package org.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HesapMakinesiTest {

    @Test
    @DisplayName("istedigi kadar sayiyi toplar")
    void topla() {
        assertEquals(10,HesapMakinesi.topla(3.5,3.5,3));
        assertEquals(10,HesapMakinesi.topla(15,-5));
        assertEquals(10,HesapMakinesi.topla(4,6));

    }

    @Test
    @DisplayName("istediği kadar sayiyi çarpar")
    void carp() {
//        assertEquals(27,HesapMakinesi.carp(3,3,3));
//        assertEquals(27,HesapMakinesi.carp(3,9));
//        assertEquals(625,HesapMakinesi.carp(1,1,5,5,5,5,8));
        assertAll(() -> assertEquals(4, HesapMakinesi.carp(2,2)),
                () -> assertEquals(-3, HesapMakinesi.carp(3,-1)),
                () -> assertEquals(-2, HesapMakinesi.carp(-2,1)),
                () -> assertEquals(6, HesapMakinesi.carp(-2,-3)));


    }
}