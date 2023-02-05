// Реализуйте очередь с помощью LinkedList со следующими методами: 
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class S4_2 {
    public static LinkedList<Integer> enqueue(LinkedList<Integer> linkList) {
        System.out.println("Initial list: " + linkList);
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Enter a symbol: ");
        int number = iScanner.nextInt();
        linkList.add(number);
        System.out.println("New list with new symbol at the end: " + linkList);
        return linkList;
    }

    public static int dequeue(LinkedList<Integer> linkList) {
        System.out.println("Initial list: " + linkList);
        System.out.println("Symbol to delete: " + first(linkList));
        int linkList1 = linkList.getFirst();
        linkList.pollFirst();
        System.out.println("List without deleted symbol: " + linkList);

        return linkList1;
    }


    private static Integer first(LinkedList<Integer> linkList) {
        return linkList.getFirst();
    }


    public static void main(String[] args) {
        LinkedList<Integer> linkList = new LinkedList<>(Arrays.asList(5, 10, 12, 17, 1, 3, 2));
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Choose method 1 or 2: (1) - add the symbol at the end of the list,(2) - delete the first symbol: ");
        int num = iScanner.nextInt();
        switch (num) {
            case 1:
                enqueue(linkList);
                break;
            case 2:
                dequeue(linkList);
                break;
            default:
                System.out.print("Wrong command");
        }
    }
}
