import java.util.Random;

public class HomeWork10 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        int count = 0;
        Random random = new Random();
        String stringArr1 = " ";
        String stringArr2 = " ";

        for (int i = 0; i < 10; i++) {
            stringArr1 += " " + (arr1[i] = random.nextInt(10));
            stringArr2 += " " + (arr2[i] = random.nextInt(10));
        }

        System.out.println(stringArr1);
        System.out.println(stringArr2);
        for (int i = arr2[0]; i < arr1.length - 1; i++) {
            for (int j = arr1[0]; j < arr2.length - 1; j++) {
                if (arr1[i] == arr2[j]) {
                    count ++;
                    System.out.println("Кількість співпадінь " + count +" ");
                }
            }
        }
    }
}
