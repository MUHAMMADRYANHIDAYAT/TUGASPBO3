/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo3;

/**
 *
 * @author bmb
 */
import java.util.Scanner;

public class LATIHAN3 {
    public static void main(String[] args) {
        String jawaban,jawaban1;
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.print("apakah anda mahasiswa ? (iya)");
        jawaban = scan.next();
        if(("iya".equals(jawaban))|| ("IYA".equals(jawaban)) ){
            System.out.print("apakah anda selalu terlambat masuk kelas?");
            jawaban1 = scan.next();
            if(("iya".equals(jawaban1))||("TIDAK".equals(jawaban1))){
                System.out.println("bagus,pertahankan RYAN KAMU KEREN!!!");
                
            }
        }
    }
}
