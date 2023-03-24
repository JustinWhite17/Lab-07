import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int a[], int size) {
        int outer, inner, temp;
        for (outer = size - 1; outer > 0; outer--) { // counting down
            for (inner = 0; inner < outer; inner++) { // bubbling up
                //ToDo 3: complete this algorithm, test it, provide its time complexity
            	if (a[inner] > a[inner + 1]) { // use if statement to see if the current element 
                    temp = a[inner];           // is greater than next element
                    a[inner] = a[inner + 1];
                    a[inner + 1] = temp;
            	}
            }
        }
    }
    

	public static void main(String[] args) {
		  	
			int[] Array = {3, 2, 8, 4, 1, 6}; //make an array to test the bubble sort method
		    int size = Array.length;
		    bubbleSort(Array, size);
		    System.out.println(Arrays.toString(Array)); //prints the array from least to greatest 
	}

}


// Time Complexity is O(n^2) performs multiple swaps
// Space Complexity is O(1)
