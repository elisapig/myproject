package com.elisa;

public class BubleSort {

	public static void main(String[] args) {
		/*由小排到大*/
		int n[] ={51,23,6,65,15};
		for(int i = 0;i <n.length;i++){
			for(int j = 0;j <n.length;j++){
			if(n[i] > n[i+1]){
				int tmp = n[i];
				n[i] = n[j];
				n[j] = tmp;
				System.out.print(n[i]+" ");
			}
			
				
				
				
			}
		}
}
}
