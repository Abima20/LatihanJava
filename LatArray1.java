import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp
 */
public class LatArray1 {
    public static void main(String[] args)
    {
        int i;
        int [] nil_akhir;
        //Deklarasi variabel array
        nil_akhir = new int[6]; //Membuat objek array
        Scanner input = new Scanner(System.in);
        for (i = 0; i < 6; i++)
        {
            System.out.print("Masukkan Array Ke " + i + " = ");
            nil_akhir[i] = input.nextInt();           
        }
        System.out.println("\n\nData yang diinput ke elemen array \n");
        for (i = 0; i < 6; i++)
        {
            System.out.print("Nilai Akhir Index " +i);
            System.out.println(" = " +nil_akhir[i]);
        }
    }        
}
