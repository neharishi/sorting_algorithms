public class Main {

   	public static void main(String[] args) {
		int[] nums = {10, 3, 2, 7, 6, 8, 4, 1, 5, 9};
    //    printArray(nums);
	//	bubbleSort(nums);
    //  selectionSort(nums);
    //  insertionSort(nums);
	//	printArray(nums);

       }

//Write these three methods. 

//hint: use a nested for loop!
     public static void bubbleSort(int[] nums) {

         for (int n = 0; n < nums.length - 1; n++){

             for (int i = 0; i < nums.length - 1; i++){
                 if (nums[i] > nums[i+1]){
                     int old = nums[i];
                     nums[i] = nums[i+1];
                     nums[i+1] = old;
                 }
             }

         }

     }

//hint: use a nested for loop!
    public static void selectionSort(int[] nums) {
        for (int n = 0; n < nums.length; n++){
            int smallest = 100;
            int index = n;
            for (int i = n; i < nums.length; i++){
                if (nums[i] < smallest){
                    smallest = nums[i];
                    index = i;
                }
            }
            int temp = nums[n];
            nums[n] = smallest;
            nums[index] = temp;

        }
    }

//hint: use a for loop and while loop!
    public static void insertionSort(int[] nums) {

    	// int n = nums.length;  
         for (int j = 1; j < nums.length; j++) {  
             int key = nums[j];  
             int i = j;  
             while ( (i > 0) && ( nums [i-1] > key ) ) {  
                 nums [i] = nums [i-1];  
                 i--;  
             }  
             nums[i] = key;  
         }  

    }

    
    // a useful method for printing the contents of an array of ints
    public static void printArray(int[] arr) {
    	for (int i = 0; i < arr.length; i++) {
    		System.out.print(arr[i] + " ");
    	}
    	System.out.println();
    }
}
