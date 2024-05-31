import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        int i = Integer.parseInt(br.readLine());
        String [] arr = S.split("");

        System.out.println(arr[i-1]);
    }
}
