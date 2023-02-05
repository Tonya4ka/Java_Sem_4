// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class S4_1 {

    public static LinkedList<Integer> ListArray(LinkedList<Integer> linkList) {

        System.out.println("Initial list: " + linkList);
        Collections.reverse(linkList);
        System.out.println("Reversed list: " + linkList);
        return linkList;
    }
    public static void main(String[] args) {
        LinkedList<Integer> linkList = new LinkedList<>(Arrays.asList(5, 15, 17, 34, 11, 3, 7));
        ListArray(linkList);
    }
}