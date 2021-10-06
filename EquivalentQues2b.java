import java.util.Scanner;

public class EquivalentQues2b {
        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            int a, b, c, d;
            a=b=c=d= keyboard.nextInt();
            if(a==b){         //a and c are equivalent
                if(c==d) {
                    a = 1;
                }
                else {
                    b = 1;
                }
        }
    }
}
