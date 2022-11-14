import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        long full = 0; 
        int wh = 10;
        for (int i = 0; i < wh; i++) {
            BufferedReader in = new BufferedReader(new FileReader("./data/100000.txt"));
            int[] array = Arrays.stream(in.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            in.close();
            long startTime = System.currentTimeMillis();
            bubbleSort(array);
            long stopTime = System.currentTimeMillis();
            full += (stopTime - startTime);
            System.out.println("Lauf: " + (i + 1) + " - in " + (stopTime - startTime) + " ms");
        }
        System.out.println(full);
    }
    
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}