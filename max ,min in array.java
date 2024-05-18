import java.util.Scanner;
public class task29 {
    public static void main(String[] args) {
        int a[] = new int[4];
        Scanner ob=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            a[i]= ob.nextInt();
        }
        int m = a[0] ;
        for (int i = 1; i < a.length; i++) {

            if (m < a[i]) {
                m = a[i];
            }
        }
        System.out.println("greater - " + m);
        int n = a[0];
        for (int i = 1; i < a.length; i++) {
            if (n > a[i]) {
                n = a[i];
            }
            }
        System.out.println("smaller - " + n);
    }
}