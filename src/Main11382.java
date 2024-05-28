import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11382 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] numbers = input.split(" ");

        Long br1 = Long.parseLong(numbers[0]);
        Long br2 = Long.parseLong(numbers[1]);
        Long br3 = Long.parseLong(numbers[2]);

        Long result = br1 + br2 + br3;
        System.out.println(result);
    }
}