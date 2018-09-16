package collection;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @ClassName ListIteratorTest
 * @Description TODO
 * @Author jingpeipei
 * @Date 2018/8/21 17:23
 */
public class ListIteratorTest {
    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>();
        list.add('a');
        list.add('b');
        list.add('c');
        System.out.println("before iterator: " + list);
        ListIterator<Character> listIterator = list.listIterator();
        System.out.println("next iterator: ");
        while (listIterator.hasNext()) {
            Character t = listIterator.next();
            System.out.println(t);
            /*if ('a' == t)
                listIterator.add('d');
            else if ('b' == t)
                listIterator.add('e');
            else{
                listIterator.add('f');
                listIterator.add('g');
            }*/
        }
        System.out.println("after next iterator: " + list);

        System.out.println("previous iterator: ");
        while (listIterator.hasPrevious()) {
            Character t = listIterator.previous();
            System.out.println(t);
            if ('a' == t)
                listIterator.add('d');
            else if ('b' == t)
                listIterator.add('e');
            else if ('c' == t){
                listIterator.add('f');
                listIterator.add('g');
            }
        }
        System.out.println("after previous iterator: " + list);
    }
}
