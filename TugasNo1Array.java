import java.util.Scanner;
public class TugasNo1Array {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int terendah = 100, tertinggi = 0;
        double rerata = 0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jml = sc.nextInt();

        int[] nilaiMhs = new int[jml];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            rerata += nilaiMhs[i];

            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }

        rerata /= nilaiMhs.length;
        System.out.println("Rata-rata nilai mahasiswa: " + rerata);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.print("Seluruh nilai mahasiswa yang telah dimasukkan: ");
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (i == (nilaiMhs.length - 1)) {
                System.out.print(nilaiMhs[i]);
                break;
            }
            System.out.print(nilaiMhs[i] + ", ");
        }
    }
}