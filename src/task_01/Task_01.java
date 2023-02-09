package task_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task_01 {

    public static void main(String[] args) {
        List<String> list = initArrayList(new ArrayList<>());
        initialArrayListView(list);
        sortedArrayListView(list);
    }

    public static List<String> initArrayList(List<String> list) {
        list.add("Алина");
        list.add("Виктор");
        list.add("Яна");
        list.add("Дмитрий");
        list.add("Владимир");
        return list;
    }

    public static void initialArrayListView(List<String> list) {
        System.out.println("\nНачальный список\n--------------------");
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static void sortedArrayListView(List<String> list) {
        Collections.sort(list);
        System.out.println("\nСортированный список\n--------------------");
        for (String s : list)
            System.out.println(s);
    }
}



