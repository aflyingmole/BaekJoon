import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int br1 = Integer.parseInt(br.readLine()); // 472
        String br2 = br.readLine(); // 385

        String [] brbr = br2.split("");


        int a = Integer.parseInt(brbr[2]);
        int b = Integer.parseInt(brbr[1]);
        int c = Integer.parseInt(brbr[0]);
        int aa = br1 * a;
        int bb = br1 * b;
        int cc = br1 * c;

        System.out.println(aa);
        System.out.println(bb);
        System.out.println(cc);
        System.out.println(aa + bb*10 + cc*100);
    }
}