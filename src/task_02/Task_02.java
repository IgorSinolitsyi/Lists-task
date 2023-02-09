package task_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task_02 {

    public static void main(String[] args) {
        List<String> list = initArrayList(new ArrayList<>());
        initialArrayListView(list);
        sortedArrayListView(list);
    }

    public static List<String> initArrayList(List<String> list) {
        list.add("Citroen DS");
        list.add("Jaguar E-Type");
        list.add("Lancia Stratos");
        list.add("Land Rover Defender");
        list.add("Lamborghini Miura");
        list.add("Lotus Esprit");
        list.add("Porsche 911");
        list.add("Mini");
        return list;
    }

    public static void initialArrayListView(List<String> list) {
        System.out.println("\nПеречень товаров\n--------------------");
        int i = 0;
        for (String s : list) {
            System.out.println(++i + ". " + s);
        }
    }

    public static void sortedArrayListView(List<String> list) {
        int i = 0;
        System.out.println("\nЧасть перечня товаров со 2-й по 5-ю\n--------------------");
        System.out.println(list.subList(1, 5));
        for (String s : list.subList(1, 5))
            System.out.println(++i + ". " + s);
    }
}



