// Kelas utama
public class PengurutanAngka {

    public static void main(String[] args) {
        // Scanner untuk input pengguna
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Membuat objek dari kelas Sorter
        Sorter sorter = new Sorter();

        // Input jumlah elemen
        System.out.print("Masukkan jumlah angka yang ingin diurutkan: ");
        int n = scanner.nextInt();

        // Input elemen array
        int[] numbers = new int[n];
        System.out.println("Masukkan angka-angka:");
        for (int i = 0; i < n; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Mengurutkan angka menggunakan metode bubbleSort
        sorter.bubbleSort(numbers);

        // Menampilkan hasil setelah diurutkan
        System.out.println("Angka yang telah diurutkan secara ascending:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        // Menutup scanner
        scanner.close();
    }
}
