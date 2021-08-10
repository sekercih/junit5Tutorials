package org.junit;

import java.util.Arrays;

public class C03DizilerEsitMi {

    public boolean diziKiyasla(Object[] a , Object[]b){
        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a,b);
    }
}