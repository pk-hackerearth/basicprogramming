package com.pktippa;

import java.util.Scanner;

public class TrailingZeros {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int count = 0;
        if(input == 5){
        	System.out.println(1);
        }
        else{
        	for(int i=5;input/i >= 1 ; i*=5){
        	  count += input/i;
        	}
        	System.out.println(count);
        }
	}
}
