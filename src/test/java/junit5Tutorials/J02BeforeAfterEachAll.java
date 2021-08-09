package junit5Tutorials;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class J02BeforeAfterEachAll {
     /* =========================================== @BeforeEach - @AfterEach ============================================

    A-) @BeforeEach anatosyonu kullanılan bir metot, her test metodu çalışmadan önce çalıştırılır.
        Bu özelliği sayesinde test verilerinin ayarlanması (başlatılması) için kullanılabilir.

	B-) @AfterEach anatosyonu kullanılan bir metot, her test metodu bittikten sonra çalıştırılır.
         Bu özelliği sayesinde test verilerinin temizlenmesi için kullanılabilir.

	C-) JUnit4 de bu anatosyonlar yerine @Before ve @After kullanıyordu.*/
    /* ========================================== @BeforeAll - @AfterAll ===============================================
	 A-) @BeforeALl tüm test metotlarından önce çalışan bir metot oluşturmak için kullanılır.
         Dolayısıyla veritabanı içeren bir test işleminde ilk olarak veritabanına bağlanamk gerekeceğinden @BeforeAll
         anatosyonu ile bir metot tanımlanarak ilk olarak veritabanına bağlanam prosedürü işletilebilir.

	 B-) @AfterAll ile tüm test metotlari bittikten sonra çalışan bir metot oluşturulabilri.
         Bu özelliği sayesinde testler bittikten sonra veritabani oturumu kapatılabilir.

	    Not1: @BeforeAll ve @AfterAll anotasyonlarının kullanıldığı metotlar static olmalıdır.
	    Not2: JUnit4 de @BeforeClass ve  @AfterClass metotları kulanılmaktadı.
    */

String str="";

@BeforeAll
static void start(){
    System.out.println(" veri tabanı bağlantısı başladı " );
}

    @AfterAll
   static void stop(){
        System.out.println(" veri tabanı bağlantısı kapandı " );
    }


    @BeforeEach
    void setUp(TestInfo info){
         str = "Junit5 ile Unit test";
        System.out.println(info.getDisplayName()+"Test verileri başlatıldı");
    }
    @AfterEach
    void clean(TestInfo info){
        str="";
        System.out.println(info.getDisplayName()+"Test verileri temizlendi");
    }



    @Test()
    void testStringLenghtTesting(TestInfo info) {
        String str = "Junit5 ile Unit test";
        int actual = str.length();
        int expectede=20;
        System.out.println(actual);
        assertEquals(expectede,actual,"eşit değildir");
        System.out.println(info.getDisplayName()+"Lenght methodu çalıştırıldı");

    }
    @Test
   // @DisplayName("split methodu ile String dizi testi")
    void testWithArrays(TestInfo info){
        String str="Junit5 ile Unit test";
        String actual []=str.split(" ");
        String expected []={"Junit5","ile","Unit","test"};

        //assertArrayEquals() diziler birbirine eşit mi
        assertArrayEquals(expected,actual,"diziler birbirine eşit değiller");
        System.out.println(info.getDisplayName()+"Dizi methodu çalıştırıldı");
    }

    }

