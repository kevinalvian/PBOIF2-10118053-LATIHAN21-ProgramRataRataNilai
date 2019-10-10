/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118053.latihan21.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class PBOIF210118053LATIHAN21ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        int n,nilai[];
        float rata,jumlah=0;
        
        System.out.print("Masukan banyaknya mahasiswa : ");
        n = scanner.nextInt();
        
        nilai = new int[n];
        
        for (int a=0; a<=n-1; a++){
            System.out.print("Nilai mahasiswa ke-" + (a+1) + ":");
            nilai[a]=scanner.nextInt();
        }    
        for (int b=0; b<=n-1; b++){
            jumlah = jumlah + nilai[b];
        }    
        rata=jumlah/n;
        
        System.out.println("");
        System.out.println("Maka rata-rata nilainya adalah" + rata);
        System.out.println("Developed by Kevin");
    }
    
}
