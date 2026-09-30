import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuickSortLists {

    public static void sort(List<Integer> list) {
        sort(list, 0, list.size() - 1);
    }

    private static void sort(List<Integer> list, int start, int end) {
        // Base case: sub-list has 0 or 1 element
        if (end <= start) return;
        // Partition the list around a pivot element
        int pivot = partition(list, start, end);
        // Recursively sort elements before and after the pivot
        sort(list, start, pivot - 1);
        sort(list, pivot + 1, end);
    }

    private static int partition(List<Integer> list, int start, int end) {
        int pivot = list.get(end);
        int i = start - 1;

        for (int j = start; j <= end - 1; j++) {
            if (list.get(j) < pivot) {
                i++;
                Collections.swap(list, i, j);
            }
        }
        i++;
        Collections.swap(list, i, end);
        return i;
    }

    // Small test
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(2);
        numbers.add(9);
        numbers.add(1);
        numbers.add(5);

        System.out.println("Before: " + numbers);
        sort(numbers);
        System.out.println("After: " + numbers);
    }
}