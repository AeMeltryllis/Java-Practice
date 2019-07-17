package RadomString;

public class RadomString {
    public static void main(String[] args) {
        char[] c =new char[5];

        for (int i = 0; i <c.length ; i++) {
            double d = Math.random()*100;
            c[i] = (char)d;
            }
       String s = new String(c);
        System.out.println(s);
        }
    }

