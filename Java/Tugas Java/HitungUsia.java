import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HitungUsia {
    public static void main(String[] args) {
        // Deklarasi variabel Nama dan Nim
        String nama = "Robert Baz Kiyosaki";
        String nim = "221552018154075";

        // Tampilkan nama dan NIM
        System.out.println("\nNama: " + nama);
        System.out.println("NIM: " + nim + "\n\n");
		
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		
		String Nama = "";
		int TS, TL, U = 0;
		
		try {
			System.out.print("Masukkan Nama: ");
			Nama = input.readLine();
			
			System.out.print("\n\nMasukkan Tahun Sekarang: ");
			TS = Integer.parseInt(input.readLine());
			
			System.out.print("\n\nMasukkan Tahun Lahir: ");
			TL = Integer.parseInt(input.readLine());
			
			U = TS - TL;
		} catch (Exception e) {
			System.out.println("Ada Yang Error!!! Alasan Error: " + e.getMessage());
		}
		System.out.println("\nNama Anda Adalah " + Nama + " dan Usia Anda Adalah " + U);
    }
}
