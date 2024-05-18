import java.util.Scanner;

public class task32 {
    public static void main(String[] args) {
        int a[] = new int[10];
        Scanner ob = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {

            a[i] = ob.nextInt();
        }
        int b = ob.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i]==b){
                System.out.println("number is already present");

            }
            else {
                System.out.println("number is not present");
            }
        }
    }
}
