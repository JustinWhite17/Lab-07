

/**
 *
 * @author MoaathAlrajab
 */
public class BinarySearch {

    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
    //ToDo 2: Call the above method and test the algorithm  
    // provide time and space analysis 


public static void main(String[] args) {
	int[] Array = {1, 2, 3, 4, 5, 6};
	int key = 4; //target value 
	int low = 0; // index of the first element
	int high = Array.length - 1; // index of the last element

	int index = BinarySearch.runBinarySearchIteratively(Array, key, low, high);
	if (index == Integer.MAX_VALUE) {
	    System.out.println(key + " not found");
	} else {
	    System.out.println(key + " found at index: " + index);
	} //uses a binary search to find the number if not found it returns Integer.MAX_VALUE
}

}

// Time complexity is O(Log n) because it is being halved
// Space complexity is O(1)

