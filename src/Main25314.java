import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int x = n / 4;

        for (int i = 1; i<=x; i++){
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
