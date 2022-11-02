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

public class LATIHAN4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("apakah anda mahasiswa ITS Mandiri Atas Nama MUHAMMAD RYAN HIDAYAT");
        String jawaban = scan.next();
        if ("Y".equals(jawaban)){
            System.out.println("selamat berjuang di ITS Mandiri ya MUHAMMAD RYAN HIDAYAT");
        }else{
            System.out.println("selamat datang di ITS Mandiri ya MUHAMMAD RYAN HIDAYAT");
       
        }
    }
}
