package Algorithm;

public class juzhen {
    /*实现矩阵的倒置*/

    public static void main(String[] args) {
         double[][] p = new double[4][4];

        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                p[i][j] = i*(j+1);
            }}

            for (int i = 0; i <4 ; i++) {
                //遍历矩阵
                for (int j = 0; j <4 ; j++) {
                    System.out.print((int)p[i][j]);
                    if (j==3) System.out.println();
                }}

        System.out.println("--------------------------------------------------------");

        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                if (i>j )continue;
                double temp  =p[i][j];
                p[i][j] = p[j][i];
                p[j][i] = temp;

            } }
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                System.out.print((int)p[i][j]);
                if (j==3) System.out.println();

            }}
        }
    }



