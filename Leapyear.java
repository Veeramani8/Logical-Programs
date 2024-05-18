import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int a = sc.nextInt();
        if(a%400==0){
            System.out.println("Leap year");
        } else if (a%100==0) {
            System.out.println("not leap year");
        } else if (a%4==0) {
            System.out.println("leap year");
        }
        else {
            System.out.println("not leap year");
        }
    }
}
