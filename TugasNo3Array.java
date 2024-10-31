import java.util.Scanner;
public class TugasNo3Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        System.out.print("Masukkan makanan/minuman yang ingin dicari: ");
        String pesanan = sc.nextLine();

        for (int i = 0; i < menu.length; i++) {
            if (i == (menu.length - 1) && menu[i] != pesanan) {
                System.out.println("Makanan/minuman tidak tersedia");
            }
            if (pesanan.equalsIgnoreCase(menu[i])) {
                System.out.println("Makanan/minuman tersedia");
                break;
            }
        }
    }
}