package base_01;

import java.util.Random;
import java.util.Scanner;

import edu.princeton.cs.algs4.*;


/**
 * 编写一个Point2D的用例，从命令行接受一个整数N。
 * 在单位正方形中生成N个随机点，然后计算两点之间的最短距离。
 */
public class use_Point2D {
	public static void main(String[] args) {
//		int n = StdIn.readInt();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Point2D[] spots = new Point2D[n];
		for(int i=0;i<n;i++) {
			spots[i] = new Point2D(Math.random(),Math.random());
		}
		double minDis=2;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				double dis = spots[i].distanceTo(spots[j]);
				if(minDis> dis)
					minDis=dis;	
			}
		}
		
//		StdOut.println("The shortest distance is :"+minDis);
		System.out.println("The shortest distance is :"+minDis);
	}
}
