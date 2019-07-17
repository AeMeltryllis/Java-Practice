package fanxinbg;
import com.sun.org.apache.bcel.internal.generic.IREM;

import java.util.Iterator;

public class ResizingArrayStack<Item>implements Iterable<Item>
{
    private Item[] a =(Item[])new Object[1];//栈元素

    private int N = 0;

    public boolean isEmpty(){
        return N ==0;
    }

    public int size(){return N; }

    private void resize(int max){
        //将栈移动
        Item[] temp = (Item[])new Object[max];
        for (int i = 0; i <N ; i++) {
            temp[i] = a[i];
//            a = temp; //将a指向temp对象的位置
        }
        /**
         *  a = temp;不能写在上面for循环中，若写在里面会导致第二个元素遍历时为null
         * **/
        a = temp; //将a指向temp对象的位置
    }

    public void push(Item item){
        if (N == a.length) resize(a.length*2);

        a[N++] = item;
    }

    public Item pop(){
        Item item = a[--N];//将弹出后的元素设为item
        a[N] = null;//防止游离
        if (N >0&&N==a.length/4) resize(a.length/2);
        return item;

    }

    public Iterator<Item> iterator(){
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item>{
        private int i = N;
        public boolean hasNext(){
            return  i>0;
        }
        public Item next(){
            return a[--i];
        }

        public void remove(){

        }
}

    public static void main(String[] args) {
        ResizingArrayStack<String> a = new ResizingArrayStack<>();
        a.push("a");
        a.push("b");
        a.push("c");
        a.push("d");
        a.push("e");
        a.isEmpty();
//        a.iterator();
        for (String b:a
             ) {
            System.out.println(b);
        }
    }
}
