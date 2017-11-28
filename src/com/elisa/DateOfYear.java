package com.elisa;

public class DateOfYear {

	public static void main(String[] args) {
		/*算出第100天是幾月幾號*/
		int n = 100;
		int months[]={31,28,31,30,31,30,31,31,30,31,30,31};
	    for(int i = 0; i < months.length;i++){
	    	if(n <months[i]){
	    		System.out.println((i+1) + " 月 " + n +" 日  "+" :)");
	    	 break;
	    	}else{
	    		n = n - months[i];
	    	}
	    }
	}
}