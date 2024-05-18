import java.util.*;
public class Oddeven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();

        if(a%2!=0)
        {
            System.out.println("odd"+a);
        }
        else {
            System.out.println("even"+a);
        }
    }
}

