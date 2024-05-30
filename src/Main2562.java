import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = 9;
        int[] arr = new int[n];
        int max = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] > max) {
                max = arr[i];
                count = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}
