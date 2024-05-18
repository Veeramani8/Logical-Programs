import java.util.Scanner;
public class task46 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String a=ob.nextLine();
        String d=a.toUpperCase();
        String b="";
        for (int i=d.length()-1;i>=0;i--){
            char c=d.charAt(i);
            b+=c;
        }
        System.out.println(b);

        if(d.equals(b)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}

