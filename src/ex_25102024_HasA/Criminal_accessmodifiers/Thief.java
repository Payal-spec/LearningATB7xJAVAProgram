package ex_25102024_HasA.Criminal_accessmodifiers;

import ex_25102024_HasA.Police_accessmodifiers.Cop;

import java.text.spi.CollatorProvider;

public class Thief {
    public static void main(String[] args) {
        Cop C = new Cop (100);
        System.out.println(C.gun);
        C.shoot();

    }


    }

