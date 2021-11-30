package com.ltts;

public class car {
	 public static int productDigits(int number){
	        if(number<0 || number>32767){
	            return -1;
	        }
	        else{
	            int temp=1;
	            while(number!=0){
	                temp*=number%10;
	                number/=10;
	            }
	            return temp;
	        }
	    }
	    public static void main(String[] args) {
	        int st=productDigits(new Scanner(System.in).nextInt());
	        if (st != -1) {
	            System.out.println(st);
	        } else {
	            System.out.println("Invalid Input");
	        }
	}
}
