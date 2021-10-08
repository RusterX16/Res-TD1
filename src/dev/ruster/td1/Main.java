package dev.ruster.td1;

import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        while(true) {
            System.out.print("Choisi un exercice (0 pour quitter) : ");
            int n = scan.nextInt();

            switch(n) {
                case 0 -> {
                    System.out.println("Merci ! A bientôt !");
                    System.exit(0);
                }
                case 1 -> exercice1();
                case 2 -> exercice2();
                case 3 -> exercice3();
                case 4 -> exercice4();
                case 5 -> exercice5();
            }
        }
    }

    public static void exercice1() {
        byte a = 1;
        short b = 1;
        int c = 1;
        long d = 1;

        for(int i = 0; i < 35; i++) {
            a *= 2;
            System.out.println("La valeur de a est : " + a);
            // a bloque à zéro à partir de -128
            b *= 2;
            System.out.println("La valeur de b est : " + b);
            // b bloque à zéro a partir de -32768
            c *= 2;
            System.out.println("La valeur de c est : " + c);
            // c bloque à zéro à partir de -2147483648
            d *= 2;
            System.out.println("La valeur de d est : " + d);
            // d continue de s'incrémenter
        }
    }

    public static void exercice2() {
        short a = -20000;
        short b = -20000;
        short c;

        c = (short) (a + b);
        System.out.println("La somme est : " + c);
        // 1. La somme est 2468
        // 2. La somme est -22935
        // 3. La somme est 0
        // 4. La somme est 25536
    }

    public static void exercice3() {
        float a;
        float b;

        a = 1;
        while((((a + 1) - a) - 1) == 0)  {
            a *= 2;
            System.out.println("a = " + a);
        }
        b = 1;
        while((((a + b) - a ) - b) != 0) {
            b++;
            System.out.println("b = " + b);
        }
        // 1.
        // a = 1.6777216E7
        // b = 2.0
        //
        // 2.
        // b s'incrémente sans arrêt
        //
        // 3.
        // La condition du while est toujours vraie et a reste à zéro
    }

    public static void exercice4() {
        float s1, s2;
        int n;

        System.out.print("n : ");
        n = scan.nextInt();
        s1 = 0.0F;

        for(int i = 1; i <= n; i++) {
            s1 += 1 / (double) i;
        }
        s2 = 0.0F;

        for(int i = n; i > 0; i--) {
            s2 += 1 / (double) i;
        }
        System.out.println("Valeurs de s1 et s2 : " + s1 + " et " + s2);
        // Pour n = 10 000 :
        // s1 = 9.787613 et s2 = 9.787604
        // Pour n = 100 000 :
        // s1 = 12.090851 et s2 = 12.090152
        // Pour n = 1 000 000 :
        // s1 = 14.357358 et s2 = 14.392652
        // Pour n = 5 000
        // s1 = 15.403683 et s2 = 16.007854
        // Plus on fait d'itérations, plus le float est imprécis
    }

    public static void exercice5() {
        int a;
        double b;

        a = 1;
        System.out.println("Début de calcul de a : ");

        for(int i = 0; i < 100000; i++) {
            for(int j = 0; j < 50000; j++) {
                a++;
            }
        }
        System.out.println("Fin de calcul de a, sa valeur est " + a);

        b = 1.0;
        System.out.println("Début de calcul de b : ");

        for(int i = 0; i < 100000; i++) {
            for(int j = 0; j < 50000; j++) {
                b++;
            }
        }
        System.out.println("Fin de calcul de b, sa valeur est " + b);
        // Valeur de a = 705032705
        // Valeur de b = 5.000000001E9
        // Non, ils ne sont pas égaux, dû au type de variable
    }
}