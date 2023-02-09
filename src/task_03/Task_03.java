package task_03;

import java.util.LinkedList;

public class Task_03 {

    public static void main(String[] args) {
        resultListView(mergerLists(initLinkedList_1(new LinkedList<>()), initLinkedList_2(new LinkedList<>())));
    }

    public static LinkedList<String> initLinkedList_1(LinkedList<String> list) {
        list.add("SR-71 Blackbird");
        list.add("Harrier");
        list.add("P-51 Mustang");
        list.add("B-52 Stratofortress");
        list.add("F-117A Nighthawk");
        return list;
    }

    public static LinkedList<String> initLinkedList_2(LinkedList<String> list) {

        list.add("MiG-31 Foxhound");
        list.add("TU-95 Bear");
        list.add("B-2 Spirit Stealth Bomber");

        return list;
    }

    public static void resultListView(LinkedList<String> list) {
        System.out.println("\nПеречень товаров после объединения\n--------------------");
        int i = 0;
        for (String s : list) {
            System.out.println(++i + ". " + s);
        }
    }

    public static LinkedList<String> mergerLists(LinkedList<String> list_1, LinkedList<String> list_2) {
        list_1.addAll(1, list_2);
        return list_1;
    }
}



