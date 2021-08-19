import java.util.Scanner;

public class Problem_2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 1;
        while(n > 0) {
            System.out.println(count);
            count += 2;
            n--;
        }

    }
}
