/*
 * 判断函数返回什么
 * 字符串倒置
*/

import java.util.Scanner;
public class Main
{
    public static String mystery(String s){
        int N = s.length();
        if(N<=1) return s;
        String a = s.substring(0,N/2);
        String b = s.substring(N/2,N);
        return mystery(b)+mystery(a);
    }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(mystery(in.next()));
	}
}
