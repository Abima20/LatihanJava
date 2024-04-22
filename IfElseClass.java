import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp
 */
public class IfElseClass {
    public String nama, ket;
    public int nilAkhir;
    Scanner input = new Scanner(System.in);
    
    public void setInputData(){
    System.out.print("Masukkan Nama Siswa :");
    nama = input.nextLine();
    System.out.print("Masukkan Nilai Akhir :");
    nilAkhir = input.nextInt();
    }
      public String getKeterangan(){
    if(nilAkhir > 70){
            //Perintah jika kondisi true
            ket = "lulus";
        }else{
            //Perintah jika kondisi false
            ket = "gagal";
         }
    return ket;
    }
}
