import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int [] arr = new int[N];
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int I = Integer.parseInt(st.nextToken()) - 1;
            int J = Integer.parseInt(st.nextToken()) - 1;

            while (I < J) {
                int temp = arr[I];
                arr[I++] = arr[J];
                arr[J--] = temp;
            }
        }
        br.close();
        for (int baguni:arr)
            System.out.print(baguni + " ");
    }
}



