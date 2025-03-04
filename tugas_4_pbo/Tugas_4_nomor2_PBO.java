package com.mycompany.tugas_4_pbo;

/**
 *
 * @author alvin
 */
import java.util.Scanner;
public class Tugas_4_nomor2_PBO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas awal: ");
        int batasAwal = input.nextInt();
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = input.nextInt();
        
        int jumlah = 0;
        System.out.print("Bilangan genap: ");
        
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                jumlah += i;
            }
        }     
        System.out.println("\nJumlah deret bilangan genap: " + jumlah);
    }
}
