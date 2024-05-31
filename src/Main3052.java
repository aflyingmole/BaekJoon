import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        Set<Integer> remainders = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[i] = n % 42;
            remainders.add(arr[i]);
        }
        System.out.println( remainders.size());
    }
}
