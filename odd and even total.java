import java.util.Scanner;

public class task21 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int a= ob.nextInt();
        int b=0;
        int c=0;
        for (int i=1;i<=a;i++){
            if (i%2==0){
                System.out.println(i+"-even");
                b+=i;
            }
            else{
                System.out.println(c+"-odd");
                c+=i;

            }
        }
        System.out.println("odd total "+b);
        System.out.println("even total "+c);
    }
}
