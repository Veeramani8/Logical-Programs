public class task34 {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50,60};
        int b=a.length;
        int c=b/2;
        int d[]=new int[c];
        for (int i=0;i<c;i++){
            d[i]=a[i];
            System.out.println("d"+d[i]);
        }
        int e[]=new int[c];
        for(int i = c;i<b; i++){
            e[i-c]=a[i];
            System.out.println("e "+e[i-c]);
        }

    }
}
