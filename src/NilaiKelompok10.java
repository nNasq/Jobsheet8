import java.util.Scanner;

public class NilaiKelompok10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai;
        float totalNilai, rataNilai;

        int i = 1;
        while (i <= 6) {
            System.out.println("Kelompok " + i);

            totalNilai = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print("Nilai dari Kelompok Penilai " + j + " : ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }
            rataNilai = totalNilai / 5;
            i++;
            System.out.println("Kelompok " + (i - 1) + ": nilai rata-rata = " + rataNilai);
            System.out.println();
        }
    }
}
