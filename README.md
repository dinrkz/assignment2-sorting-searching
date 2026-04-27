# Sorting and Searching Algorithm Analysis

## Project Overview
This project compares fundamental algorithms to understand their performance in practical scenarios.

## Algorithms Analyzed
1. **Selection Sort (Basic):** Searches for the minimum element and moves it to the front. 
   - **Time Complexity:** $O(n^2)$
2. **Quick Sort (Advanced):** Uses a pivot to partition the array into smaller sub-arrays.
   - **Time Complexity:** $O(n \log n)$
3. **Binary Search (Searching):** Repeatedly divides the search interval in half.
   - **Time Complexity:** $O(\log n)$

## Experimental Results
| Array Size | Selection Sort (ns) | Quick Sort (ns) | Binary Search (ns) |
| :--- | :--- | :--- | :--- |
| 10 | 10500 | 15000 | 3200 |
| 100 | 154000 | 42000 | 1700 |
| 1000 | 13565100 | 584000 | 2300 |

## Performance Analysis
* **Which was faster?** Quick Sort outperformed Selection Sort significantly as the array size grew.
* **Input Size:** As size increased 10x, Selection Sort time grew ~100x, confirming $O(n^2)$.
* **Binary Search:** It is the most efficient but requires the array to be sorted to function correctly.

* **How does sorted vs unsorted data affect performance?** Selection Sort takes the same time regardless of data order. Quick Sort is fastest on random data but can slow down if the pivot is poorly chosen on already sorted data.
* **Do the results match the expected Big-O complexity?** Yes, the results match. Selection Sort's time grows quadratically ($O(n^2)$), while Quick Sort's time grows much slower, closer to $O(n \log n)$.
* **Why does Binary Search require a sorted array?** Binary Search relies on the property that elements are ordered to decide whether to search in the left or right half. Without sorting, the 'divide and conquer' logic fails.

* ![Execution Results](docs/screenshots/experiment_result.png)
