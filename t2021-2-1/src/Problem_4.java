import java.util.Arrays;
import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args) {

//        For Dynamic Input
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int[] number = new int[n];
//        for(int i = 0; i < n; i++) {
//            number[i] = s.nextInt();
//        }

        int[] number = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        int[] multiple = new int[9];

        for(int i = 1; i <= 9; i++) {
            int count = multiple(number, i);
            multiple[i - 1] = count;

        }

        System.out.println(Arrays.toString(multiple));

    }

    public static int multiple(int[] number, int multiple) {
        int count = 0;
        for(int i: number) {
            if(i % multiple == 0)
                count++;
        }
        return count;
    }
}


