package PCquestion;
import fanxinbg.ResizingArrayStack;

import java.util.Locale;
import java.util.Stack;
import java.util.concurrent.*;
import java.util.Iterator;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadStack <Item>implements Iterable<Item>{
    private Item[] a=(Item[])new Object[1];//初始元素数目
    private int N =0;

    Lock lock =new ReentrantLock();
    Condition condition =lock.newCondition();

    public synchronized  boolean isEmpty(){
        return N ==0;
    }

    public synchronized int size(){return N; }

    private  synchronized void resize(int max){
        //将栈移动
        Item[] temp = (Item[])new Object[max];
        for (int i = 0; i <N ; i++) {
            a = temp; //将a指向temp对象的位置
        }
        /**
         *  a = temp;不能写在上面for循环中，若写在里面会导致第二个元素遍历时为null
         * **/
         a = temp; //将a指向temp对象的位置
    }
    public  void  push(Item item){
        /**
         * 若此时栈元素为10，等待线程
         */
        try {
            lock.lock();

            while (N>=10){
                condition.await();

            }

            if (N == a.length) resize(a.length*2);

            a[N++] = item;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            condition.signal();
            lock.unlock();
        }

    }
    public   Item pop(){
        /**
         * 若此时栈元素为零，等待线程
         */
        try {
            lock.lock();
            while (N==0){
                condition.await();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
            Item item = a[--N];//将弹出后的元素设为item
            a[N] = null;//防止游离
            if (N >0&&N==a.length/4) resize(a.length/2);
            return item;


        }

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


}
