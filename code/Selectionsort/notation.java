import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class notation {  
    public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  

    public static void main(String[] args) throws IOException {
        for (int i = 1; i <= 10; i++) {
            BufferedReader in = new BufferedReader(new FileReader("./data/100000.txt"));
            int[] list = Arrays.stream(in.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            in.close();
            long startTime = System.currentTimeMillis();
            selectionSort(list);
            long endTime = System.currentTimeMillis();
            System.out.println("sorting " + i + " executed in: " + (endTime - startTime) + " ms");
        }
    }
}
