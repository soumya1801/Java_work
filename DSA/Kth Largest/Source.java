import java.util.*;

public class Source {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int k = sc.nextInt();

        int stream[] = new int[n];

        for (int i = 0; i < n; i++) {

            stream[i] = sc.nextInt();

        }

    
// Write code here
    List<Integer> topK = new ArrayList<>();

     
    for (int i = 0; i < n; i++) {
                int num = stream[i];

        if (topK.size() < k) {
        topK.add(num);  
        Collections.sort(topK); 
    } else if (num > topK.get(0)) {
        topK.set(0, num);
        Collections.sort(topK);
    }
        if (topK.size() < k) {
            System.out.println("None");
        } else {
             System.out.println(k + " largest number is " + topK.get(0));
        }
        }
    }
}
