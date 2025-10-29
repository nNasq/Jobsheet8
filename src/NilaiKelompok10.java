import java.util.Scanner;

public class NilaiKelompok10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai;
        float totalNilai, rataNilai;

        float rataTertinggi = 0;
        int kelompokTertinggi = 0;

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
            System.out.println("Kelompok " + i + ": nilai rata-rata = " + rataNilai);
            System.out.println();

            if (rataNilai > rataTertinggi) {
                rataTertinggi = rataNilai;
                kelompokTertinggi = i;
            }

            i++;
        }

        System.out.println("Kelompok dengan rata-rata tertinggi adalah Kelompok " 
                            + kelompokTertinggi + " dengan rata-rata " + rataTertinggi);
    }
}
