package task_04;

import java.util.LinkedList;

public class Task_04 {

    public static void main(String[] args) {
        resultListView(addFirstAndLastLine(initLinkedList(new LinkedList<>()), "Akula", "Oscar"));
    }

    public static LinkedList<String> initLinkedList(LinkedList<String> list) {
        list.add("Ohio");
        list.add("Delta");
        list.add("Yasen");
        list.add("Typhoon");
        list.add("Sierra");
        return list;
    }

    public static void resultListView(LinkedList<String> list) {
        System.out.println("\nПеречень товаров после добавления строк\n--------------------");
        int i = 0;
        for (String s : list) {
            System.out.println(++i + ". " + s);
        }
    }

    public static LinkedList<String> addFirstAndLastLine(LinkedList<String> list, String firstStr, String lastStr) {
        list.addFirst(firstStr);
        list.addLast(lastStr);
        return list;
    }
}



