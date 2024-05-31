import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i =0; i<t; i++){
            String s = br.readLine();
            System.out.print(s.charAt(0));
            System.out.println(s.charAt(s.length() - 1));
        }
        br.close();
    }
}
