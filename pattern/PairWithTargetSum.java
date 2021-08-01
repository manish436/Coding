package pattern;

class PairWithTargetSum {

  public static int[] search(int[] arr, int targetSum) {
    int start = 0;
		int end = arr.length - 1;

		while(start < end){
			int total =	arr[start] + arr[end];
			if(total == targetSum){
				return new int[] {start, end};
			}

			if(total > targetSum){
				end--;
			}else if(total < targetSum){
				start++;
			}

		}

	return new int[] {-1, -1};
  }

  public static void main(String[] args) {
    int[] result = PairWithTargetSum.search(new int[] { 1, 2, 3, 4, 6 }, 6);
    System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");
    result = PairWithTargetSum.search(new int[] { 2, 5, 9, 11 }, 11);
    System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");
  }
}