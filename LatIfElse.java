import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp
 */
public class LatIfElse {
    public static void main(String[] args, String nilai1){
    Scanner input = new Scanner(System.in);
    String keterangan, nama;
    int nilai;
    
    System.out.print("Masukkan Nama Siswa : ");
    nama = input.nextLine();
    System.out.print("Masukkan Nilai Akhir : ");
    nilai = input.nextInt();
        if(nilai > 70){
            //Perintah jika kondisi true
            keterangan = "lulus";
        } else{
            //Perintah jika kondisi false
            keterangan = "Gagal";
        }
      System.out.println("Hasil Akhir");
      System.out.println("========================================");
      System.out.println("Nama Siswa                :"+nama);
      System.out.println("Nilai Akhir Yang Di Dapat :"+nilai1);
      System.out.println("Keterangan                :"+keterangan);
      System.out.println("========================================");
    }
}
