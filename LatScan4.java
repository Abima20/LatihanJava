import java.util.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp
 */
public class LatScan4 {
    public static void main(String[]args)
    {
    int kd;
    String nb = "";
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan Kode Barang [1...3]:");
    kd = input.nextInt();
    
    switch(kd)
    {
        case 1 :
            nb = "Alat olah raga";
            break;
        case 2 :
            nb = "Alat elektronik";
            break;
        case 3 :
            nb = "Alat alat Masak";
            break;
        default :
            nb = "Anda salah kode!!!";
            break;
    }
System.out.println("\nNama Barang :" +nb );
    }        
}
