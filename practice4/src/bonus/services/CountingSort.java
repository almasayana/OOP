package bonus.services;
import bonus.model.Sortable;

public class CountingSort implements Sortable {
    @Override
    public int[] sort(int[] array) {
        if (array.length == 0) return array;

        int[] count = new int[11]; 
        int[] sortedArray = new int[array.length];

        for (int value : array) {
            count[value]++;
        }

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                sortedArray[index++] = i;
                count[i]--;
            }
        }
        return sortedArray;
    }
}