
import java.util.*;
import java.util.LinkedList;

public class Mainp {

    //1
    private static void printCurrentQueue(Queue queue) {
        System.out.println("Current Queue : " + queue);
    }

    //2
    private static void printNewLine() {
        System.out.println();
    }

    public static void main(String[] args) {
        //3
        Queue sampleQueue = new LinkedList();

        //4
        sampleQueue.add("sun");
        sampleQueue.add("mon");
        sampleQueue.add("tue");
        sampleQueue.add("wed");
        sampleQueue.add("thu");
        sampleQueue.add("fri");
        sampleQueue.add("sat");
        
        //5
        printCurrentQueue(sampleQueue);
        printNewLine();

        //6
        String element = (String) sampleQueue.element();
        System.out.println("First Element : " + element);
        printCurrentQueue(sampleQueue);
        printNewLine();

        //7
        String peekElement = (String) sampleQueue.peek();
        System.out.println("Peek element : " + peekElement);
        printCurrentQueue(sampleQueue);
        printNewLine();

        //8
        String removedElement = (String) sampleQueue.remove();
        System.out.println("Removed element : " + removedElement);
        printCurrentQueue(sampleQueue);
        printNewLine();

        //9
        String pollElement = (String) sampleQueue.poll();
        System.out.println("Poll element : " + pollElement);
        printCurrentQueue(sampleQueue);
        printNewLine();

        //10
        sampleQueue.add("Days");
        System.out.println("After adding a new element :");
        printCurrentQueue(sampleQueue);
        printNewLine();

        //11
        System.out.println("Final count of the queue : " + sampleQueue.size());

    }

}
