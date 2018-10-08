/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117109_latihan35_objectorientedprogramtunjangan;

import java.util.Scanner;

/**
* Nama  : Stefanus Saputra
* NIM   : 10117109
* Kelas : IF 3
* Deskripsi : Menampilkan tunjangan dari gaji dengan menggunakan oop
 */
public class PBO3_10117109_Latihan35_ObjectOrientedProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        GajiKaryawan gk = new GajiKaryawan();

        System.out.println("===========Program Tunjangan===========");
        System.out.print("Berapa Gaji Pokok Anda Perbulan ? : Rp. ");
        gk.gajiPokok = scn.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum) : ");
        gk.status = scn.next();

        gk.HasilHitung(gk.status,gk.gajiPokok);
    }
    
}
