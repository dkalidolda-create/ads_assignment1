import java.util.Scanner;

public class task2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int count = sc.nextInt();
            int[] arr = new int[count];
            for (int i = 0; i < count; i++) {
                arr[i] = sc.nextInt();
            }
            double average = (double) sum(arr, count - 1) / count;
            System.out.println(average);
            sc.close();
        }

        static int sum(int[] arr, int index) {
            if (index == 0) return arr[0];
            return arr[index] + sum(arr, index - 1);
        }
    }

