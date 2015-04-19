package com.example.mislugares;

import java.lang.reflect.Array;

/**
 * Created by Dr4ckO on 17/04/2015.
 */
public class Principal {
    public static void main(String[] main) {
        for (Lugar lugares : Lugares.vectorLugares) {
            System.out.println(lugares);
        }
    }
}
