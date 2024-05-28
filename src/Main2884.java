import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] numbers = input.split(" ");

        int h = Integer.parseInt(numbers[0]);
        int m = Integer.parseInt(numbers[1]);

        if (h > 0 && h <= 23) {
            if (m >= 0 && m <= 59 && m >= 45) {
                System.out.print(h);
                System.out.print(" ");
                System.out.print(m - 45);
            } else if (m >= 0 && m <= 59 && m < 45) {
                System.out.print(h - 1);
                System.out.print(" ");
                System.out.print(m + 15);
            }
        }
        if (h == 0) {
            if (m >= 0 && m <= 59 && m >= 45) {
                System.out.print(h);
                System.out.print(" ");
                System.out.print(m - 45);
            } else if (m >= 0 && m <= 59 && m < 45) {
                System.out.print(h + 23);
                System.out.print(" ");
                System.out.print(m + 15);
            }
        }
    }
}
