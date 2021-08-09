package junit5Tutorials;



/*
    assertThrow() metodu belirtilen işlemin (executable) belirtilen türde bir Exception oluşturup oluşturmadığını
    test eder. Dolayısıyla 2 parametre alır.
        1. parametre Exception türü,
        2. parametre ise çalıştırılacak olan işlemdir.
    Eğer işlem belirtilen türde bir exception oluşturursa test başarılı olur.
    Ama exception oluşmaz ise veya türü yanlış olursa test başarısız olur.
    Exception türünde parent-child ilişkisi var ise yine test başarılı sayılır.
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class J03TestingExceptions {
    @Test
    void testException01() {
        String str = "";
        assertThrows(NullPointerException.class, () -> str.length(), "Null döndürmelidir.");
        // str.length() komutu null döndürdüğü için NUllPointerException oluşur. Bu exception'ı assertThrow() yakalar
        // ve türüne bakar. Eğer türü, 1. parameteredeki exception türü ile aynı ise Test'i başarılı sayar.
    }

    @Test
    void testException2() {
        //        String sayi = "12a4";
//        Integer intSayi = Integer.parseInt(sayi);
//        System.out.println(intSayi*2);
        assertThrows(NumberFormatException.class, () -> Integer.parseInt("1aa2"));

    }

    @Test
    void testException03(){
        assertThrows(IllegalArgumentException.class,()->yasYazdir(-20));
    }

    private void yasYazdir(int yas) {
        if (yas<0){
            throw new IllegalArgumentException();
        }else{
            System.out.println(yas);
        }
    }

    @Test
    void testExceptions4() {
        assertThrows(ArithmeticException.class, () -> bol(6, 0));
    }
    int bol(int a, int b) {
        return a / b;
    }
}
    


