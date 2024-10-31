import java.util.Scanner;
public class SearchNilai15Modif {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jml = sc.nextInt();

        int[] arrNilai = new int[jml];

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        for (int i = 0; i < arrNilai.length; i++) {
            if (i == (arrNilai.length - 1)) {
                if (arrNilai[i] != key) {
                    System.out.println("Nilai yang dicari tidak ditemukan");
                }
            }
            if (arrNilai[i] == key) {
                System.out.print("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (i + 1));
            } 
        }
    }
}