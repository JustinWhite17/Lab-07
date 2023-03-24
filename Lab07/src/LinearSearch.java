public class LinearSearch {
	
	public static int search(int arr[], int x) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
        if (arr[i] == x) {
            return i; // return if element found
        }
    }
    return -1; // return if element not found 
}


	public static void main(String[] args) {
		int[] arr = {2,8,9,4,5,2,7};
	    int x = 9;
	    int index = search(arr, x);
	    if (index == -1) {
	        System.out.println("not found: ");
	    } else {
	        System.out.println("found at index: " + index);
	    }
	} 

} // int x found at index 2, linear search works

// Time complexity is O(n) because it searches and if the element is not in the array it will check all elements
// Space complexity is O(1) 