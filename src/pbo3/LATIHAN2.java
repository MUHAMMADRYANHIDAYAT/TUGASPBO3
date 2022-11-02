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
public class LATIHAN2 {
    public static void main(String[] args) {
        int belanja = 0;
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Total Belanjaan:Rp");
        belanja = scan.nextInt();
        if (belanja>100000){
            System.out.println("selamat,anda mendapatkan diskon!");
        }
        System.out.println("Terima Kasih");
        
        }
      }

