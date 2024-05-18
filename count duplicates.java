public class task39 {
    public static void main(String[] args) {
        int a[]={3,1,2,3,1,3,5};    
        int b=0;
        for(int i=0;i<a.length;i++) {
            for ( int j = 0;j < a.length; j++) {
                if (a[i] == a[j]) {
                    b+=1;
                }

            }
            System.out.println(a[i]+"-"+b);
            b=0;
        }

    }
}


