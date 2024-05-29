import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] numbers = input.split(" ");

        int br1 = Integer.parseInt(numbers[0]);
        int br2 = Integer.parseInt(numbers[1]);
        int br3 = Integer.parseInt(numbers[2]);

        // 세 수가 모두 같을때
        if (br1 == br2 && br1 == br3 && br2 == br3){
            System.out.println(10000 + br1 * 1000);
        }

        // 두 수만 같을때
        if (br1 == br2 && br2 != br3){
            System.out.println(1000 + br1 * 100);
        } else if (br1 == br3 && br1 != br2){
            System.out.println(1000 + br1 * 100);
        } else if (br2 == br3 && br1 != br2){
            System.out.println(1000 + br2 * 100);
        }

        // 다 다를때
        if (br1 != br2 && br2 != br3 && br1 != br3){
            int max = Integer.parseInt(numbers[0]);
            for(int i=0; i< numbers.length; i++){
                if (Integer.parseInt(numbers[i])>max){
                    max = Integer.parseInt(numbers[i]);
                }
            }
                System.out.println(max * 100);
        }
    }
}