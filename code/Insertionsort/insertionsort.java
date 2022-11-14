import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class insertionsort {
    public static void main(String[] args) throws IOException {
        long complete = 0;
        for (int i = 1; i <= 10; i++) {
            BufferedReader in = new BufferedReader(new FileReader("./data/10000.txt"));
            int[] array = Arrays.stream(in.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            in.close();
            long time = insertionSortIterativ(array);
            complete += time;
            System.out.println("Sorting: " + i + " executed in: " + time + "ms");
        }
        System.out.println(complete);
    }

    public static long insertionSortIterativ(int[] liste) {
        long start = System.currentTimeMillis();
        for (int i = 1; i < liste.length; i++) {
            int merke = liste[i];
            int j = i;
            while (j > 0 && liste[j - 1] > merke) {
                liste[j] = liste[j - 1];
                j = j - 1;
            }
            liste[j] = merke;
        }
        long end = System.currentTimeMillis();
        return (end - start);
    }
}