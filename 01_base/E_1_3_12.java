package base_01;

import java.util.Iterator;

import edu.princeton.cs.algs4.StdOut;

/**
 * 编写一个可迭代的Stack用例，它含有一个静态的copy()方法
 * 接受一个字符串的栈作为参数并返回该栈的一个副本
 * 双向链表
 * 参考：https://github.com/YangXiaoHei/Algorithms/blob/master/Ch_1_3_Bags_Queues_And_Stacks/Practise_1_3_12.java
 */
public class E_1_3_12 {
	static class Stack<T> implements Iterable<T>{
		private static int counter =0;
		private final int id=counter++;
		class Node{
			T item;
			Node next;
			Node prev;
			Node(T it,Node ne,Node pr){item=it;next=ne;prev=pr;}
			Node(T it)                {this(it, null, null);}
			Node()                    {this(null,null,null);}
		}
		private Node top=null;
		void push(T item) {
			if(top==null)
				top=new Node(item);
			else {
				Node n = new Node(item);
				n.next=top;
				top.prev=n;
				top=n;
			}
		}
		T pop() {
			if(isEmpty())
				throw new RuntimeException("empty stack!");
			T pop= top.item;
			top=top.next;
			top.prev=null;
			return pop;
		}
		boolean isEmpty() {	
			return top==null;
		}
		@Override
		public Iterator<T> iterator() {
			return new Iterator<T>() {
				private Node n=top;
				@Override
				public boolean hasNext() {
					return n!=null;
				}

				@Override
				public T next() {
					T item=n.item;
					n=n.next;
					return item;
				}
			};
		}
		public Iterable<T> reverse() {
			return new Iterable<T>() {
				public Iterator<T> iterator() {
					return new Iterator<T>() {
						Node n;
						{
							Node cur = top;
							while(cur != null && cur.next != null)
								cur = cur.next;
							n = cur;
						}
						public boolean hasNext() {
							return n != null;
						}
						public T next() {
							T item = n.item;
							n = n.prev;
							return item;
						}
					};
				}
			};
		}
		
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("=== Stack "+id+" ===\n");
			for(T t:this)
				sb.append(t+"\n");
			sb.append("=============\n");
			return sb.toString();
		}
		
		public static  Stack<String> copy(Stack<String> source){
			Stack<String> copy = new Stack<String>();
			for(String s : source.reverse())
				copy.push(s);
			return copy;
		}
	}
	
	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		for(int i = 0; i < 10; i++)
			s.push(i + "");
		StdOut.println("被复制的栈 :");
		StdOut.println(s);
		
		StdOut.println("复制出来的栈 :");
		Stack<String> copy = Stack.copy(s);
		StdOut.println(copy);

	}

}
