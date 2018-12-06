import java.util.Random;
import java.util.Scanner;
public class Java1Lesson2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] array4 = {1,2,3,3,2,1};
        int[] array3 = new int[10];
        int[][] array2 = new int[5][5];
        System.out.println("Zadanie-1");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] array = {0, 0, 0, 0, 0, 0, 0, 0};
        int[] array1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        printArray(arr);
        changeArray(arr);
        printArray(arr);
        typeArray(array);
        printArray1(array1);
        multiplyArray(array1);
        printArray1(array1);
        findMinMax(array3);
        createArray2(array2);
        checkBalance(array4);
    }

    static void changeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;

        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    static void typeArray(int[] array) {
        System.out.println("Zadanie-2");
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 3;
            System.out.print(array[i] + " ");

        }
        System.out.println();
    }

    static void multiplyArray(int[] array1) {
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < 6) array1[i] = array1[i] * 2;

        }
    }

    static void printArray1(int[] array1) {
        System.out.println("zadanie-3");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
    }

    static void findMinMax(int[] array3) {
        System.out.println("zadanie-5");
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            array3[i] = rnd.nextInt(12);
            System.out.print(array3[i] + " ");
        }
        int min = array3[0];
        int max = array3[0];
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < min) min = array3[i];
            if (array3[i] > max) max = array3[i];
        }
        System.out.println();
        System.out.println(max + " " + min);
        System.out.println();

    }

    static void createArray2(int[][] array2) {
        System.out.println("zadanie-4");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if ((i == j) || (i == array2.length - 1 - j))
                    array2[i][j] = 1;
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
        }
    static boolean checkBalance(int[] array4) {
        System.out.println("zadanie-6");
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < array4.length + 1; i++) {

            for (int j = 0; j < i; j++) {
                leftSum += array4[j];
            }

            for (int j = i; j < array4.length; j++) {
                rightSum += array4[j];
            }

            if (leftSum == rightSum) return true;
        }
        return false;
    }
    }
