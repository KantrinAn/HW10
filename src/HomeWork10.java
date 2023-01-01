import java.util.Arrays;
import java.util.Random;

public class HomeWork10 {
    public static void main(String[] args) {
        int[] arr1 = new int[7];
        int[] arr2 = new int[7];
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 9);

        }
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = (int) (Math.random() * 9);

        }
        for (int i =0; i< arr1.length; i++) {
            Arrays.sort(arr1);
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int j = 0;j< arr2.length; j++) {
            Arrays.sort(arr2);
            System.out.print(arr2[j]+ " ");
        }

       for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i]) {
                count++;
                System.out.println("Кількість співпадінь " + count + " ");

      }


            }
        }
    }






