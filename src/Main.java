import java.util.Arrays;

public class Main {
    static int[] list = {12, 2, 36, 95, 62, 10, 25, 31, 15, 48, 30};

    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;
        for (int i = 1; i < list.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;

                    needNextPass = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Original: ");
        System.out.println(Arrays.toString(list));
        bubbleSort(list);
        System.out.println("The list after sorted: ");
        System.out.print(Arrays.toString(list) + " ");

    }
}
