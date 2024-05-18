public class task10 {
    public static void main(String[] args) {
        int a=12345;
        String s=String.valueOf(a);
        int b=0;
        for(int i=1;i<=s.length();i++){
            b=a%10;
            System.out.println(b);
            a/=10;
        }
        }
    }