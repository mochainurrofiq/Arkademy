package pkg3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
                
    int bil = 1;
    int n;
        while (bil < 20) {            
            if (bil % 3 == 0) {
                System.out.println("Arka");
            } 
            if (bil % 7 == 0) {
                System.out.println("Demy");
            }
            System.out.println(bil);
            bil++;
        }
    }
}

