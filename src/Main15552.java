import java.io.*;

public class Main15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        int[] array = new int[t];

        for (int i = 0; i < t; i++) {
            String input = br.readLine();
            String[] numbers = input.split(" ");
            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[1]);
            array[i] += a+b;
        }
        for(int i = 0; i< array.length; i++){
            bw.write(String.valueOf(array[i]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
