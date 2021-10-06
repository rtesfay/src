import java.util.Scanner;

public class IndentQuestion1b {
        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            int a, b, c, d;
            a = b = c = d = keyboard.nextInt();
            if (a == b)
            {
                a = 1;
                if (c == d)
                {
                    b = 1;

                } else
                {
                    c = 1;
                }
            }
        }
    }

