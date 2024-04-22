/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp
 */
public class Polimorfisme {
public static void main(String[] args){
    Hewan HEWAN = new Hewan ();
    Kuda KUDA = new Kuda ();
    Kucing KUCING = new Kucing ();
    Ayam AYAM = new Ayam ();
    
    HEWAN.suara();
    
    HEWAN = KUDA;
    HEWAN.suara();
    
    HEWAN = KUCING;
    HEWAN.suara();
    
    HEWAN = AYAM;
    HEWAN.suara();
}    
}