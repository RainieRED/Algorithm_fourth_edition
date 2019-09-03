package base_01;

import java.util.Scanner;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdIn;

/**
  *  编写一个Internal1D的用例，从命令行接受一个整数N。从标准输入中读取N个间隔
  *  （每个间隔由一对double值定义）并打印出所有相交的间隔对。 
 * @author Administrator
 *
 */

public class use_Interval1D {
	public static void main(String[] args) {
//		int n = StdIn.readInt();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Interval1D[] interval = new Interval1D[n];
		for(int i=0;i<n;i++) {
			interval[i] = new Interval1D(in.nextDouble(), in.nextDouble());
		}
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(interval[i].intersects(interval[j])){
					System.out.println(interval[i]+" "+interval[j]);
				}
			}
		}
	}
}
