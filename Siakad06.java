import java.util.Scanner;
public class Siakad06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama,nim;
        String prodi;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan prodi: ");
        prodi = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukka nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextDouble();
        nilaiAkhir = (nilaiKuis * 0.2 + nilaiTugas * 0.15 + nilaiUTS * 0.3 + nilaiUAS * 0.35);
        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Prodi: " + prodi);
        System.out.println("Kelas: " + kelas + " Absen: " +absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);


    }
}