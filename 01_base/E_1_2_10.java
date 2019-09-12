import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;
/**
 * 编写一个VisualCounter类，支持加一减一操作。它的构造函数接受两个参数N和MAX 其中N指定了操作的最大次数。
 * max指定了计数器的最大绝对值。作为副作用，用图像显示每次计数器变化后的值
 */
public class E_1_2_10 {
	public static class VisualCounter{
		private int N;
		private int max;
		private int count = 0;
		private int exec = 0;
	
		public VisualCounter(int n,int max) {
		
			this.max=max;
			this.N=n;
		
			StdDraw.setXscale(0, N);
			StdDraw.setYscale(-max - 10, max + 10);
		
			StdDraw.setPenRadius(0.01);
			StdDraw.setPenColor(StdDraw.RED);
			StdDraw.line(0, max , N + 1, max );
			StdDraw.line(0, -max  , N + 1, -max );
		
			StdDraw.setPenColor(StdDraw.RED);
			StdDraw.setPenRadius(.001);
		}
	
		public void increment() {
			if(exec<N) {
				exec++;
				if(count<max) {
					count++;
				}
			}
			StdDraw.point(exec, count);
		}
	
		public void decrement() {
			if(exec<N) {
				exec++;
				if(Math.abs(count)<max) {
					count--;
				}
			}
			StdDraw.point(exec, count);
		}
	}
	
	public static void main(String[] args) {
		int n=1000;
		int max=50;
		VisualCounter counter = new VisualCounter(n, max);
		double incrementProbability = 0.5;
		for(int i = 0; i < n; i++) 
			if (StdRandom.bernoulli(incrementProbability))
				counter.increment();
			else
				counter.decrement();
	}
}
