import java.io.*;

public class Main11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        int [] arr = new int[t];

        for(int i =0; i<t; i++){
            String input = br.readLine();
            String [] numbers = input.split(" ");
            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[1]);
            arr[i] += a+b;
        }

        for(int i =0; i<arr.length; i++){
            bw.write("Case #" + (i+1) + ": " + String.valueOf(arr[i]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
