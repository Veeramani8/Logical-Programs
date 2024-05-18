import java.util.Scanner;

public class task43 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String a = ob.nextLine();
        String arr[] = a.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length-1) {
                System.out.print(arr[i].charAt(0) + ".");
            }
            else if (i == arr.length-1) {
                System.out.println(arr[i]);
            }

        }
    }
}