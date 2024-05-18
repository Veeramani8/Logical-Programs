import java.util.Scanner;
public class positive {
    public static void main(String[] args) {

    Scanner obj = new Scanner(System.in);
        System.out.print("enter value:");
    int a = obj.nextInt();
        if (a>=0){
        if (a >0) {
            System.out.println("a is positive");
        }

        else {
            System.out.println("value is zero");
        }
    }
        else{
        System.out.println("a is negative");
    }
}
}

