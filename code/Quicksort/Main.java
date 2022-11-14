import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i <= 10; i++) {
            BufferedReader in = new BufferedReader(new FileReader("./data/100000.txt"));
            int[] list = Arrays.stream(in.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            in.close();

            int n = list.length;
            QuickSort qs = new QuickSort();
            long startTime = System.currentTimeMillis();
            qs.quickSort(list, 0, n - 1);
            long stopTime = System.currentTimeMillis();
            long endTime = stopTime - startTime;
            System.out.println("sorting " + i + " executed in: " + (endTime) + " ms");
        }
    }
}