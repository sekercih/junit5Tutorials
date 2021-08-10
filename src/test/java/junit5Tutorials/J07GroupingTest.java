package junit5Tutorials;

// 1-) 0 içermeyen int sayilar için multiplyExact() metodunu test ediniz.
// 2-) 0 içeren int sayilar için multiplyExact() metodunu test ediniz.

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class J07GroupingTest {

    @ParameterizedTest
    @CsvSource(value= {"12, 4, 3","-12, -4, 3","12, -4, -3" ,"-12, 4, -3" })
    void carp(int sonuc, int x, int y){
        assertEquals(sonuc, Math.multiplyExact(x,y));
    }

    @Nested
    class SifirIcerenTestler {

        @ParameterizedTest
        @CsvSource(value= {"0, 0, 4","0, 4, 0","0, -4, 0 " ,"0, 0, -4","0 , 0, 0" })
        void carp(int sonuc, int x, int y){
            assertEquals(sonuc, Math.multiplyExact(x,y));
        }

        @ParameterizedTest
        @CsvSource(value= {"4, 0, 4","4, 4, 0","-4, -4, 0 " ,"-4, 0, -4","0 , 0, 0" })
        void topla(int sonuc, int x, int y){
            assertEquals(sonuc, Math.addExact(x,y));
        }

        @ParameterizedTest
        @CsvSource(value= {"0, 0, 4","0, 4, 0","0, -4, 0 " ,"0, 0, -4","0 , 0, 0" })
        void bol(int sonuc, int x, int y){
            if(y==0){
                assertThrows(ArithmeticException.class, () -> bolme(x,y));
            }else{
                assertEquals(sonuc, bolme(x,y));
            }
        }
        int bolme(int a, int b ){
            return a/b;
        }
    }
}