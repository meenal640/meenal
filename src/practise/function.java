package practise;

import java.util.Arrays;
import java.util.Scanner;

public class function {
	public static void main(String[] args) {
		String name="Meenal Dhanotiya";
		boolean ans=linearSearch(name,'M');
		if(ans==true) {
			System.out.println("Found");
		}
		else {
			System.out.println("not found");
		}
		
	}
	public static boolean linearSearch(String name,char target) {
		
		if(name.length() ==0) {
			return false;
		}
		else {
			for(int i=0;i<name.length();i++) {
				if(target==name.charAt(i)) {
					return true;
				}
			}
		}
		return false;
	}
	
	
}
