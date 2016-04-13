package com.pktippa;

import java.util.*;

public class MyPrime {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(short i=0;i<n;i++){
			arr[i] = in.nextInt();
		}
		for(short j=0;j<n;j++){
			boolean isPrime = true;
			for(short k =0;k<n;k++){
				if(k!=j){
					if(arr[j] > arr[k]){
						if(arr[j]%arr[k] == 0){
							isPrime = false;
							break;
						}else{
							isPrime = true;
						}
					}
				}
			}
			if(isPrime){
				System.out.print(arr[j] + " ");
			}
		}
	}

}
