import java.util.Arrays;
import java.util.Scanner;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdRandom;

/**
 *  修改BinartSearch，使用Counter 统计在有查找中被检查的键的总数并在查找全部接受后打印该值
 * hint ：在main中创建一个Counter对象并将它作为参数传递给rank（）
 */

public class E_1_2_9 {
	

    public static int rank(int key, int[] a,Counter counter) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
        	counter.increment();
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }
	
	public static int[] sourceArr(int n) {
		int[] tmp =new int[n];
		for(int i=0;i<n;i++) {
			tmp[i]=StdRandom.uniform(0, n);
		}
		Arrays.sort(tmp);
		return tmp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter counter = new Counter("cnt");
		Scanner inScanner =new Scanner(System.in);
		int n = inScanner.nextInt();
		int[] num=sourceArr(n);
		int tmp = StdRandom.uniform(0, n);
		int cnt = rank(tmp, num, counter);
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
		System.out.println("It took "+counter+" attempts to find "+tmp+" from an array of length "+n);	
		//It took 1 cnt attempts to find 4 from an array of length 10
	}
}
