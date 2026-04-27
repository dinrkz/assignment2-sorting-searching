import java.util.Arrays;

public class Experiment {
    private Sorter sorter = new Sorter();
    private Searcher searcher = new Searcher();

    public long measureSortTime(int[] arr, String type) {
        int[] copy = arr.clone();
        long start = System.nanoTime();

        if (type.equals("basic")) {
            sorter.basicSort(copy);
        } else if (type.equals("advanced")) {
            sorter.advancedSort(copy);
        }

        return System.nanoTime() - start;
    }

    public long measureSearchTime(int[] arr, int target) {
        Arrays.sort(arr);
        long start = System.nanoTime();
        searcher.search(arr, target);
        return System.nanoTime() - start;
    }

    public void runAllExperiments() {
        int[] sizes = {10, 100, 1000};

        for (int size : sizes) {
            System.out.println("\n--- Array Size: " + size + " ---");
            int[] randomArray = sorter.generateRandomArray(size);
            int[] sortedArray = randomArray.clone();
            Arrays.sort(sortedArray);

            System.out.println("Basic Sort (Random): " + measureSortTime(randomArray, "basic") + " ns");
            System.out.println("Advanced Sort (Random): " + measureSortTime(randomArray, "advanced") + " ns");

            int target = randomArray[size / 2];
            System.out.println("Binary Search: " + measureSearchTime(sortedArray, target) + " ns");
        }
    }
}