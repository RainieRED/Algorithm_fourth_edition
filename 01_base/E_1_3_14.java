package base_01;

import edu.princeton.cs.algs4.StdOut;
import javafx.scene.control.TableView.ResizeFeatures;

/**
 * 编写一个类ResizingArrayQueueOfStrings
 * 只用定长数组实现队列的抽象
 * 使用调整数组的方法突破大小的限制
 */
public class E_1_3_14 {
	static class Queue<T>{
		private T[] items=(T[])new Object[1];
		private int head,tail,size;
		void enqueue(T it) {
			if(size==items.length)
				resize(items.length*2);
			items[tail]=it;
			tail=(tail+1)%items.length; //环绕式添加
			size++;
			StdOut.println(this);
		}
		T dequeue() {
			if(isEmpty())
				throw new RuntimeException("queue is empty");
			size--;
			T deq=items[head];
			items[head]=null;
			head=(head+1)%items.length;
			if(size>0 && size==items.length/4)
				resize(items.length/2);
			StdOut.println(this);
			return deq;
		}
		private void resize(int len) {
			T[] newItem=(T[])new Object[len];
			int cur = head,k=0;
			do {
				newItem[k++]=items[cur];
				cur=(cur+1)%items.length;
			}while(cur!=tail);
			head=0;
			tail=size;
			items=newItem;
		}
		private boolean isEmpty() {
			return size == 0;
		}
		
	}

	public static void main(String[] args) {
		
	}

}
