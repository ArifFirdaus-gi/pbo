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
public class tugas_2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        float jari, keliling, luas;
        float pi = 3.14f;
        
        System.out.println("Masukkan jari-jari lingkaran: ");
        jari = input.nextFloat();
        
        luas = pi*jari*jari;
        keliling = 2*pi*jari;
        
        System.out.println("Luas: " + luas);
        System.out.println("Keliling: " + keliling);
    }
}
