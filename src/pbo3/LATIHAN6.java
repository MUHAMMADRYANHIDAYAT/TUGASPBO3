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

public class LATIHAN6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.print("masukkan angka untuk dikonversikan ke huruf:");
        int angka = scan.nextInt();
        
        if(angka>85){
            System.out.println("angka"+angka+"=A");
        }else if (angka>60){
            System.out.println("angka"+angka+"=B");
        }else if (angka>35){
            System.out.println("angka"+angka+"=C");
        }else if (angka>15){
            System.out.println("angka"+angka+"=D");
        }else{
            System.out.println("angka"+angka+"=E");
        }
    }
}
