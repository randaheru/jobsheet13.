public class Percobaan1 {
    public static void main(String[] args) {
        
        int angka = 5;
        int hasil = faktorialRekursif(angka);
        System.out.println("Faktorial dari " + angka + " adalah: " + hasil);
    }

    public static int faktorialRekursif(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * faktorialRekursif(n - 1);
        }
    }
}
