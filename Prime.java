import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 2; i <=a; i++) {

            if (a % 2 != 0) {
                if (a %3 != 0) {
                    System.out.println(i);
                } else {
                    System.out.println("not  prime");
                }
            } else {
                System.out.println("not a prime");
            }
        }
    }
}