package dsa.scaler.arrays;

public class TwoSumBruteForce {
	public static void main(String[] args) {
		int arr[]= {7,6,3,8,2};
		int target =14;
		int sum= 0;
		int [] opArray =new int[2];
		//Brute Force Approach
		for (int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				sum= arr[i]+arr[j];
				if(target==sum) {
					opArray[0]=i;
					opArray[1]=j;
				}
				
			}
		}
		
		System.out.println(opArray[0] +" "+opArray[1]);
		//With this approach complexity will be O(n2) 
		
	}
	

}
