import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            String input = br.readLine();
            String[] numbers = input.split(" ");
            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[1]);
            sum += a*b;
        }
        if(x == sum){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}