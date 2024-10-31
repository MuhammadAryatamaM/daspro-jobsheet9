import java.util.Scanner;
public class TugasNo2Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;

        System.out.print("Masukkan jumlah pesanan: ");
        int jml = sc.nextInt();
        sc.nextLine();

        int[] hargaPesanan = new int[jml];
        String[] namaPesanan = new String[jml];

        for (int i = 0; i < hargaPesanan.length; i++) {
            System.out.print("Masukkan nama makanan/minuman: ");
            namaPesanan[i] = sc.nextLine();
            System.out.print("Masukkan harganya: ");
            hargaPesanan[i] = sc.nextInt();
            sc.nextLine();
            total += hargaPesanan[i];
        }

        System.out.println("Daftar pesanan Anda: ");
        for (String pesanan : namaPesanan) {
            System.out.println(" - " + pesanan);
        }

        System.out.println("Total biaya Anda: " + total);
    }
}