package com.java2.object;

public class ABNumber {
	String number;
	public ABNumber (String Number){
		this.number=Number;
		
	}
	public int validate(String secret){
		int result =0;
		int lenght =secret.length();
		for (int i = 0; i < number.length(); i++) {
			char c = number.charAt(i);
		for(int j=0;j<lenght;j++){
			
			if (c == secret.charAt(j)) {
				if (i == j) {
					result =result + 10;
				} else {
					result=result+1;
				}
				break;
		}
		}
		}
	return result;	
	
}}