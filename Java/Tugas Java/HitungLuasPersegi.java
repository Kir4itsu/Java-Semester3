import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HitungLuasPersegi {

  public static void main(String[] args) throws Exception {

    // Deklarasi variabel Nama dan Nim
    String nama = "Robert Baz Kiyosaki";
    String nim = "221552018154075";

    // Tampilkan nama dan NIM
    System.out.println("\nNama: " + nama);
    System.out.println("NIM: " + nim + "\n\n");

    // Judul Program
    System.out.println("\nMenghitung Luas Persegi");
    System.out.println("=======================");

    // Deklarasi variabel
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    
    // Input panjang
    System.out.print("Masukkan Panjang: ");
    int panjang = Integer.parseInt(input.readLine());

    // Input lebar
    System.out.print("Masukkan Lebar: ");
    int lebar = Integer.parseInt(input.readLine());

    // Hitung luas
    int luas = panjang * lebar;

    // Output panjang, lebar, luas
    System.out.println("Panjang: " + panjang);
    System.out.println("Lebar: " + lebar);
    System.out.println("Luas: " + luas);

    // Input nama
    System.out.print("\nMasukkan Nama: ");  
    String namaPengguna = input.readLine();

    // Tampilkan terima kasih
    System.out.println("Terima Kasih " + namaPengguna + " Telah Mengikuti Ujian");
  
  }

}