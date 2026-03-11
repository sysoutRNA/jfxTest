package com.paquetePrincipal;

import java.util.Random;

public class Main {
    static Random rand = new Random();
    void main() {
        for (int i = 0; i <= 20; i++) System.out.println(rand.nextInt(0,11));
    }
}
