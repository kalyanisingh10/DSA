package dsa.scaler.arrays;

import java.util.HashMap;

public class TwoSumOptimized {
	/*Optimized Solution  can be implemented using HashMap 
	 * 
	 * Step 1: create a hashmap 
	 * Step 2: find secondNumber = target- arr[i];
	 * Step 3: If secondNumber is present in Hashmap then return output Array[0] = second Number key and output Array = current element index
	 * Step 4: If step 3 does not satisfies then put current element with index in map.
	 * 
	 * 
	 * **/
	
	public static void main(String[] args) {
		int arr[]= {7,6,3,8,2};
		int target =14;
		int[] opArray = new int[2];
		HashMap<Integer,Integer> numMap = new HashMap<>();
		int secNo= 0;
		
		for(int i=0;i<arr.length;i++) {
			secNo= target-arr[i];
			if(numMap.containsKey(secNo)) {
				opArray[0]=numMap.get(secNo);
				opArray[1]=i;
				
			}else {
				numMap.put(arr[i], i);
			}
			
		}
		
		System.out.println(opArray[0] +" "+ opArray[1]);
	}

}
