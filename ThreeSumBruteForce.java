package dsa.scaler.arrays;

import java.util.Arrays;

public class ThreeSumBruteForce {

	/**
	 * We are going to solve Three-sum problem using Brute -force approach then will optimize the solution using a different solutions
	 * *
	 * What is three sum problem :
	 * Suppose we have an array of elements and a target number 
	 * Inputs :target - 0 ; arr =[7,-6,3,8,-1,8,-11]
	 * Output: Output will be the elements whose sum is equal to the target.
	 * In brute force approach we can iterate over an array and tries to match with the target.
	 * 
	 * */
	
	public static void main(String[] args) {
		int[] arr = {7,-6,3,8,-1,8,-11};
		int target= 0;
		//to find the sum of elements in an array
		int sum =0;
		//We need to find three elements that's why array size is 3
		int [] otuputArary = new int[3];
		//Iterate over an array elements
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				for(int k=2;k<arr.length;k++) {
					sum= arr[i]+arr[j]+arr[k];
					if(sum==target) {
						otuputArary[0]=arr[i];
						otuputArary[1]=arr[j];
						otuputArary[2]=arr[k];
					}
				}
			}
		}
		//sort the output array elements
		Arrays.sort(otuputArary);
		System.out.println("Output Array will be ::"+ otuputArary[0] +" "+otuputArary[1] +" "+otuputArary[2]);
		
		
	}
	
	
}
