package JavaBase;

public class narcissus {
    /*求水仙花数*/
    public static void main(String[] args) {
        int hundred_bit =0;
        int ten_bit =0;
        int bit =0;

        for (int i = 1; i <10; i++) {
            for (int j = 0; j <10; j++) {
                for (int k = 0; k <10; k++) {
                    if (i*100+j*10+k == i*i*i+k*k*k+j*j*j){
                        int sum = i*100+j*10+k;
                        hundred_bit = i*i*i;
                        ten_bit = j*j*j;
                        bit = k*k*k;
                        System.out.println(sum + "= " + i  +":" + j +":" + k + ".");
                    }

                }
            }
        }
    }

}
