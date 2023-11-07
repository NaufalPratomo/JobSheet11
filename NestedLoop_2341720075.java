import java.util.Scanner;

public class NestedLoop_2341720075 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double [][]temps = new Double[5][7];

        for (int i = 0; i < temps.length; i++) { 
            System.out.println("Kota ke-" + i); 
            for (int j = 0; j < temps[0].length; j++) { 
                System.out.print("Hari ke-" + (j + 1) + ": "); 
                temps[i][j] = scanner.nextDouble(); 
            } 
            System.out.println(); 
        }
        int kota = 1;
        for (Double[] temp : temps) { 
            double sum = 0;
            for (Double t : temp) { 
                sum += t;
            } 
            double average = sum / temp.length;
            System.out.println("Rata-rata suhu untuk Kota ke-" + kota++ + " adalah: " + average); 
        }
    }
}
