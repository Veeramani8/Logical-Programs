public class
fibonacci {
    public static void main(String[] args) {
        int a=-1;
        int b=1;
        for(int i=0;i<100;i++){
            int c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
    }
}
