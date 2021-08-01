class MaxSumSubArrayOfSizeK{

public static int findMaxSumSubArray(int k, int[] arr) {
	int sum =0;
    int totalSum =0;
    int start =0;

    for(int i=0; i<arr.length; i++){
      sum +=arr[i];

      if(i >= k-1){
        // found new bigger sum
        if(sum > totalSum){
          totalSum = sum;
        }

        sum -=arr[start++]; 
      }
    }

    return totalSum;
}

public static void main(String arr[]){
	 System.out.println("Maximum sum of a subarray of size K: "
        + MaxSumSubArrayOfSizeK.findMaxSumSubArray(3, new int[] { 2, 1, 5, 1, 3, 2 }));
    System.out.println("Maximum sum of a subarray of size K: "
        + MaxSumSubArrayOfSizeK.findMaxSumSubArray(2, new int[] { 2, 3, 4, 1, 5 }));
}
	
}