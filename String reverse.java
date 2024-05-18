public class task42 {
    public static void main(String[] args) {
        String s1="hii how are you?";
        String a[]=s1.split(" ");
        for (int i=3;i>=0;i--){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int i=s1.length()-1;i>=0;i--){
            char b=s1.charAt(i);
            System.out.print(b);
        }

    }

}