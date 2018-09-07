package cuong.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
			Scanner sca = new Scanner(System.in);
			System.out.println("Nhap n:");
			int n = sca.nextInt();
			sca.close();
	    	int Tong = 0;
	        for (int i = 1; i <= n; i++) {
	            Tong = Tong + i;
	        } 
	        System.out.println("tong = " + Tong);
	    }
	}


