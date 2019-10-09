/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118016.latihan27.huruf.besar.kecil;
import java.util.Scanner;

/**
 *
 * @author Rezky
 * NAMA      : Rezky Nur Fauzi
 * KELAS     : IF-1
 * NIM       : 10118016
 * Deskripsi Program   : Program ini berisi program Huruf Besar Kecil
 */

public class IF0110118016Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String kalimat;
        String hurufBesar;
        String hurufKecil;
        
        //masukkan
        System.out.print("Masukkan Kalimat  : ");
        Scanner tempKalimat = new Scanner(System.in);
        kalimat = tempKalimat.nextLine();
        System.out.println();
        
        //keluaran
        hurufBesar = kalimat.toUpperCase();
        hurufKecil = kalimat.toLowerCase();
        System.out.println("+++++Hasil Formatting+++++");
        System.out.println("Huruf Besar\t: " + hurufBesar);
        System.out.println("Huruf Kecil   \t: " + hurufKecil);
    }
    
}
