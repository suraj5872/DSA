Class LargestSecondArray
{

	public int print2largest(List<Integer> arr) {
			// Code Here
			if (arr.isEmpty() || arr.size() < 2) {
				return -1;
			}

			// Use a Set to track distinct elements
			Set<Integer> distinctElements = new HashSet<>();
			int first = Integer.MIN_VALUE;
			int second = Integer.MIN_VALUE;

			for (int num : arr) {
				if (num > first) {
					second = first;
					first = num;
				} else if (num > second && num < first) {
					second = num;
				}
			}
			// If we don't have a valid second largest element
			return second == Integer.MIN_VALUE ? -1 : second;
		}
	}
	public static void main(String[] args) {
        List list = Arrays.aslist(10,0,3,0,2,0,7);
		print2largest(list)
        System.out.println();
        
    }
}