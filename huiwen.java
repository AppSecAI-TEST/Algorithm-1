package text;

import java.util.Scanner;

public class Test {
	public static boolean palindromeNumber(int num) {
        // Write your code here
        StringBuilder s1=new StringBuilder();
		StringBuilder s2=new StringBuilder();
		while(num>=1) {
			s1.append(num%10);
			num/=10;
		}
		s2.append(s1);
		s1.reverse();
		int is=1;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i)!=s2.charAt(i)) {
				is=-1;
				break;
			}
		}
		if (is==-1) {
			return false;
		}
		else
			return true;
    }
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		// TODO Auto-generated method stub
		int s=in.nextInt();
		if (palindromeNumber(s)) {
			System.out.print("是回文");
		}else
			System.out.print("不是回文");
	}

}
