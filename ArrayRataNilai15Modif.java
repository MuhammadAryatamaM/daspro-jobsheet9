import java.util.Scanner;
public class ArrayRataNilai15Modif {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
      
        double rata2, total = 0;
        int counter = 0;
        
        System.out.print("Masukkan jumlah mahasiswa : ");                 // program input sepanjang apa array yang dimau
        int jml = sc.nextInt();
        
        int[] nilaiMhs = new int[jml];

        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] > 70) {                                         // program menghitung banyak mahasiswa lulus
                counter++;
            }
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }

        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai = " + rata2);
        System.out.println("Banyak mahasiswa yang lulus sebanyak " + counter);
    }
}