package JavaBase;

public class reserver {
    /*数组反转*/
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0]  = 1;
        a[1]  = 2;
        a[2]  = 3;
        a[3]  = 4;
        a[4]  = 7;
        int max = 0;
        for (int i = 0; i <(a.length)/2 ; i++) {
            int temp =  a[i];
            a[i] = a[a.length-(i+1)];
            a[a.length-(i+1)] = temp;

        }
//        for (int i = 0; i <a.length ; i++) {
//            System.out.println(a[i]);
//
//        }

        for (int each:a) {
            if (each>max) max = each;
        }
        System.out.println(max);
    }
}
