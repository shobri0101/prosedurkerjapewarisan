/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pewarisan;

/**
 *
 * @author Muhammad Shobri
 */
public class Pelajar extends Orang {
    private String nim;
    private String asalSekolah;
    private double nilai; // range: 0-30

    public Pelajar(String nama, double tinggi, double berat, String nim, 
                   String sekolah, double nilai) {
        super(nama, tinggi, berat);
        this.nim = nim;
        this.asalSekolah = sekolah;
        this.nilai = nilai;
    }

    public String toString() {
        return (super.toString() + "\nNIM : " + nim +
                "\nSekolah : " + asalSekolah +
                "\nNilai : " + nilai);
    }
}
