import java.util.ArrayList;

public class DifferenceArraysArrayLists {
    public static void main(String[] args) {
        // Array example - fixed size
        int[] numArray = new int[3];
        numArray[0] = 10;
        numArray[1] = 20;
        numArray[2] = 30;

        System.out.println("Array values:");
        for (int i = 0; i < numArray.length; i++) {
            System.out.println(numArray[i]);
        }

        // ArrayList example - dynamic size
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(10);
        numList.add(20);
        numList.add(30);

        System.out.println("\nArrayList values:");
        for (int value : numList) {
            System.out.println(value);
        }

        // Showing how ArrayList can grow
        numList.add(40);
        System.out.println("\nArrayList after adding 40:");
        System.out.println(numList);
    }
}
