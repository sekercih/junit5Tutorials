package org.junit;

//Verilen bir kelimedeki ilk 2 harf içerisinde A var ise bu A'lar silinmeli.
//AABC==>BC, ABC==>BC, BCDE==>BCDE, BCAA==>BCAA, AA ="" A==>"", B==>B

public class C02StringDegistirici {
    public String ilkIkiASil(String str){
        if(str.length() <= 2){
            return str.replaceAll("A" ,"");
        }
        String ilkIkiKarakter = str.substring(0,2);
        String ikiKarekterSonrasi = str.substring(2);
        return ilkIkiKarakter.replaceAll("A","") + ikiKarekterSonrasi;
    }
}