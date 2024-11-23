import java.util.Scanner;
/*Class Average mewariskan class Display */
public class Average extends Display{     
    /*Method Rata yang akan menghitung rata-rata*/
    public double[] Rata(int m,int n){
        /*pendeklarasian array */
        double nilai[] = new double[m];
        double tot;
        System.out.println("==============================================");
        for(int i=1; i<=m; i++){
            tot = 0;
            System.out.println("INPUT NILAI MAHASISWA #"+i+":");
            for(int j = 1;j<=n;j++){
                double inputnilai;
                Scanner s = new Scanner(System.in);
                System.out.print("Masukkan nilai ke-"+j+": ");
                inputnilai = s.nextDouble();
                tot += inputnilai;
            }
            double avg = tot/n;
            nilai[i-1] = avg;
            System.out.println("==============================================");
        }
        return nilai;
    }

    /*Override dari method DisplayNilai pada class Display */
    @Override
    public void DisplayNilai(int m, double[] n){
        System.out.println("HASIL RATA RATA:");
        for(int i=1;i<=m;i++){
            System.out.printf("Nilai Mahasiswa "+i+": "+"%.2f",n[i-1]);
            System.out.print("\n");
        }
        System.out.print("==============================================");
    }
        
        
    }
/*Attanabil Rabbani
 * 50421230
 * 2IA14
 */



