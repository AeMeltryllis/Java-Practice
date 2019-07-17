package JavaBase;

public class goldDivision {
    /*练习-黄金分割点*/
    public static void main(String[] args) {
        double value = 0;
        double min =100;
        double fenmu =0 ;
        double fenzi = 0;
        for (double i = 1; i <=20 ; i++) {
            for (double j = 1; j <20 ; j++) {
                if((i%2==0&&j%2!=0)||i%2!=0&&j%2==0){
                   double g= i/j;
                   double result = Math.abs(g-0.618f);
                   if (result<min) {
                       min = result;
                       fenmu = j;
                       fenzi = i;
                       value = g;
//                       System.out.println(fenmu+" " +fenzi+ " "+ g);
                       }
                   }
                }

            }
        System.out.println("分子： " + fenzi+" 分母： " +fenmu+ "最接近值： "+ value);
        }

            }




