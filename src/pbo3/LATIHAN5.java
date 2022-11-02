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

public class LATIHAN5 {
    public static void main(String[] args) {
        int a = (int) (Math.random()*10), b = (int) (Math.random()*10),hasil = a+b;
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("berapakah hasil dari "+a+" dan "+b+"?");
        int jawaban = scan.nextInt();
        if (jawaban==hasil){
            System.out.println("selamat,jawaban anda benar");
        }else{
            System.out.println("maaf,jawaban yang benar adalah "+hasil);
        }
    }
}
