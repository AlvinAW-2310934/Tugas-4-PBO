package com.mycompany.tugas_4_pbo;

/**
 *
 * @author alvin
 */
import java.util.Scanner;
public class Tugas_4_nomor3_PBO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan pertama a: ");
        int a = input.nextInt();
        System.out.print("Masukkan bilangan kedua b: ");
        int b = input.nextInt();
        
        while (b != 0) {
            int temp = b; 
            b = a % b; 
            a = temp; 
        }
        System.out.println("Pembagi bersama terbesar adalah: " + a);
    }
}
