package bonus;
import bonus.model.Sortable;
import bonus.services.CountingSort;
import java.util.Arrays;


public class Main {
	public static void main(String[] args) {
        int[] data = {10, 2, 5, 2, 8, 0, 1, 5, 2, 9, 4};
        
        Sortable sorter = new CountingSort();
        int[] result = sorter.sort(data);

        System.out.println("Original: " + Arrays.toString(data));
        System.out.println("Sorted:   " + Arrays.toString(result));
    }
}
