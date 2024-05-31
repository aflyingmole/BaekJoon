import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        for (int k = 0; k < M; k++) {
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int tmp = arr[i - 1];
            arr[i - 1] = arr[j - 1];
            arr[j - 1] = tmp;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
