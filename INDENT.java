import java.util.Scanner;

public class IndentQuestion1a {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int a, b, c, d;
        a=b=c=d= keyboard.nextInt();
        if (a == b) {
            if (c == d) {
                a = 1;
            } else {
                b = 1;
            }
        else
            {
                c = 1;
            }
        }
    }
}
