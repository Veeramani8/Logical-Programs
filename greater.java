import java.util.Scanner;

public class greater {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        int a = as.nextInt();
        int b = as.nextInt();
        int c = as.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("a is greater");
                if (c > b) {
                    System.out.println("b is smaller");
                } else {
                    System.out.println("c is smaller");
                }

            }
        }
        if (b > a) {
            if (b > c) {
                System.out.println("b is greater");
                if (a< c) {
                    System.out.println("a is smaller");
                }
                else {
                    System.out.println("c is smaller1");
                }

            }
        }
        if (c > a) {
            if (c > b) {
                System.out.println("c is greater");
                if (a<b) {
                    System.out.println("a is smaller");
                }
                else {
                    System.out.println("b is smaller");
                }

            }
        }
    }
}

