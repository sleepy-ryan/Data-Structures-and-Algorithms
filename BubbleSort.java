import java.util.Scanner;

public class BubbleSort {


    public static void main(String[] args) {

        Scanner fillArray = new Scanner(System.in);

        System.out.println("This is a demonstration of Bubble Sorting");
        System.out.println("How many numbers do you want in your array?");

        int arraySize = fillArray.nextInt();

        int Array[] = new int[arraySize];

        System.out.println("What " + arraySize + " numbers do you want in your array?");
        for (int i = 0; i < Array.length; i++) {
            int fillIndex = fillArray.nextInt();
            Array[i] = fillIndex;
        }

        System.out.println("How do you want to sort your index?");
        System.out.println("From least to greatest, type 1");
        System.out.println("From greatest to least, type 2");

        int sortMethod = fillArray.nextInt();

        switch (sortMethod) {
            case 1:
                for (int lastUnsortedIndex = Array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
                    for (int i = 0; i < lastUnsortedIndex; i++) {
                        if (Array[i] > Array[i + 1]) {
                            swap(Array, i, i + 1);
                        }
                    }
                }
                for (int i = 0; i < Array.length; i++) {
                    System.out.println(Array[i]);
                }
                break;


            case 2:
                for (int lastUnsortedIndex = Array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
                    for (int i = 0; i < lastUnsortedIndex; i++) {
                        if (Array[i] < Array[i + 1]) {
                            swap(Array, i, i + 1);
                        }
                    }
                }
                for (int i = 0; i < Array.length; i++) {
                    System.out.println(Array[i]);
                }
                break;

        }//End Of Cases

    }

    public static void swap(int[] array, int i, int j) {

        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}