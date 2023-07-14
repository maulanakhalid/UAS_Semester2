public class Array {
    public static void main(String[] args) {
        int angkaAwal = 1000;
        int angkaAkhir = 2000;

        int[] angka = new int[angkaAkhir - angkaAwal + 1];

        for (int i = 0; i < angka.length; i++) {
            angka[i] = angkaAwal + i;
        }

        for (int i = 0; i < angka.length; i++) {
            System.out.println(angka[i]);
        }
    }
}