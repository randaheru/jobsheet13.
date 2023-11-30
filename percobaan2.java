public class percobaan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int bilangan = sc.nextInt();

        System.out.print("Masukkan pangkat: ");
        int pangkat = sc.nextInt();

        int hasilPangkat = hitungPangkat(bilangan, pangkat);
        System.out.print("Hasil " + bilangan + " pangkat " + pangkat + " adalah: ");
        printPangkatSeries(bilangan, pangkat);
        System.out.println(" = " + hasilPangkat);

        sc.close();
    }

    public static int hitungPangkat(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * hitungPangkat(base, exponent - 1);
        }
    }

    public static void printPangkatSeries(int base, int exponent) {
        for (int i = 1; i < exponent; i++) {
            System.out.print(base + "x");
        }
        System.out.print(base);
    }
}