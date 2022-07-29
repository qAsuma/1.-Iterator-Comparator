import java.util.ArrayList;
import java.util.Iterator;

//Вывод на экран элементов List: Создать список, заполнить его на 10 элементов и вывести на экран содержимое используя iterator.
public class List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer iter =iterator.next();
            System.out.println(iter);
        }
    }
}
