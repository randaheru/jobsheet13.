import java.util.Scanner;

public class Percobaan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan saldo awal: ");
        double saldoAwal = sc.nextDouble();

        System.out.print("Masukkan jumlah tahun: ");
        int tahun = sc.nextInt();

        double saldoAkhir = hitungLaba(saldoAwal, tahun);
        System.out.println("Saldo setelah " + tahun + " tahun adalah: " + saldoAkhir);

        sc.close();
    }

    public static double hitungLaba(double saldo, int tahun) {

        double labaPerTahun = 0.11;

        for (int i = 1; i <= tahun; i++) {
            saldo = saldo * (1 + labaPerTahun);
        }

        return saldo;
    }
}
