import java.util.Arrays;

public class task30 {
    public static void main(String[] args) {
        int a[] = {20, 35, 10, 6, 11};
      // Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                int c = 0;
                if (a[i] <a[j]) {
                    c = a[i];
                    a[i] = a[j];
                    a[j] = c;
                }
            }
            System.out.println(a[i]);
        }

    }
}