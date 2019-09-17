package base_01;
/**
 * 为FixedCapacityStackOfStrings 添加一个方法 isFull();
 */
public class E_1_3_1 {
	public static class FixedCapacityStackOfStrings{
		private int N;
		private String[] a;
		public FixedCapacityStackOfStrings(int cap){
			a = new String[cap];
		}
		public boolean isEmpty() { return N==0;}
		public int size()        {return N;}
		public void push(String item) {
			a[N++]=item;}
		public String pop() {
			return a[--N];}
		
		public boolean isFull()  {return N==a.length;}
		
	}

	public static void main(String[] args) {
		FixedCapacityStackOfStrings stack = new FixedCapacityStackOfStrings(6);
		stack.push("hello");
		stack.push("world");
		System.out.println(stack.isFull());
	}
}
