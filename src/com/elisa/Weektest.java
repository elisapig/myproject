package com.elisa;

public class Weektest {

	public static void main(String[] args) {
		int n = 4;
		switch (n) {
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期日");
			break;
			/*沒有以上敘述的，歸納為同一類，使用"default:"*/
		default:
			System.out.println("你住火星?");

		}
	}

}
