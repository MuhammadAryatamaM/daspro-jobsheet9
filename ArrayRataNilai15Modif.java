import java.util.Scanner;
public class ArrayRataNilai15Modif {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
      
        double totalLulus = 0, totalTakLulus = 0, total = 0, rata2, rata2Lulus, rata2TakLulus;
        int counterLulus = 0, counterTakLulus = 0;
        
        System.out.print("Masukkan jumlah mahasiswa : ");                 // program input sepanjang apa array yang dimau
        int jml = sc.nextInt();
        
        int[] nilaiMhs = new int[jml];

        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] > 70) {                                         // program menghitung banyak mahasiswa lulus
                counterLulus++;
                totalLulus += nilaiMhs[i];
            } else {                                                        
                counterTakLulus++;
                totalTakLulus += nilaiMhs[i];
            }
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }

        rata2 = total / nilaiMhs.length;
        rata2Lulus = totalLulus / counterLulus;
        rata2TakLulus = totalTakLulus / counterTakLulus;
        System.out.println("Rata-rata nilai = " + rata2);
        System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2TakLulus);
        System.out.println("Banyak mahasiswa yang lulus sebanyak " + counterLulus);
    }
}