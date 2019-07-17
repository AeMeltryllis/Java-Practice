package fanxinbg;
import java.util.ArrayList;

public class genericity {
    public static void main(String[] args) {
        ArrayList<Number> arrayList = new ArrayList<>();
        int a = 5;
        long b = 50;
        float c = 3.14f;
        arrayList.add(a);
        arrayList.add(b);
        arrayList.add(c);
        for (int i = 0; i <arrayList.size() ; i++) {
            Number d =  arrayList.get(i);
            System.out.println(d);
        }
    }
}
