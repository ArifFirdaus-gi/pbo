/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_pertemuan1;

import java.util.Scanner;

/**
 *
 * @author ARIF F
 */
public class tugas_2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int jam, menit, detik, totdek;
        
        System.out.println("Masukkan jam:");
        jam = input.nextInt();
        
        System.out.println("Masukkan menit");
        menit = input.nextInt();
        
        System.out.println("Masukkan detik");
        detik = input.nextInt();
        
        totdek = jam*3600 + menit*60 + detik;
        
        System.out.println("Hasil detik: " + totdek);
    }
    
}
