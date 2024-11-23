import java.util.Scanner;
public class Homepage{

    public void out(){
        /*deklarasi variable mhs, nilai lalu menampilkan tampilan awal untuk
        meminta input jumlah mahasiswa dan jumlah nilai yang akan di input per mahasiswa*/
        int mhs, nilai;
        System.out.println("===========PROGRAM HITUNG RATA-RATA NILAI MAHASISWA===========\n");
        Scanner a = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mahasiswa: ");
        mhs = a.nextInt();
        System.out.print("Masukkan nilai yang akan di input per mahasiswa: ");
        nilai = a.nextInt();
        System.out.print("\n");
        /*Deklarasi Objek dari class average dan memberi parameter mhs dan nilai */
        Average hitung = new Average();
        hitung.DisplayNilai(mhs,hitung.Rata(mhs, nilai));
        
        
    }


}
/*Attanabil Rabbani
 * 50421230
 * 2IA14
 */
