import java.util.*;

public class Source {

    private static void sortArray(int[] arr, int k) {

        // Write code here
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int index = 0;
        for (int i = 0; i < Math.min(arr.length, k + 1); i++) {
            queue.add(arr[i]);
        }
         for (int i = k + 1; i < arr.length; i++) {
            queue.add(arr[i]);  
            arr[index++] = queue.poll();  
        }
        while (!queue.isEmpty()) {
            arr[index++] = queue.poll();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sortArray(arr, k);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
