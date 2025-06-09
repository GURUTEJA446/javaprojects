package java_with_dsa;
import java.util.*;
public class HeapExample {

	public static void main(String[] args) {
		PriorityQueue<Integer> minHeap=new PriorityQueue<Integer>();
		minHeap.add(10);
		minHeap.add(20);
		minHeap.add(30);
		System.out.println("Min Heap output");
		while(!minHeap.isEmpty()) {
			System.out.println(minHeap.poll());
		}
		PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
		maxHeap.add(10);
		maxHeap.add(20);
		maxHeap.add(30);
		System.out.println("Max Heap output");
		while(!maxHeap.isEmpty()) {
			System.out.println(maxHeap.poll());
		}
	}
}
