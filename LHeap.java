import java.util.PriorityQueue;
/**
 * Locality-Aware Heap Sort
 * 
 * @author TODO put your username here
 * @version TODO put the date here
 * @pso   TODO put your PSO section here
 *
 */
public class LHeap extends Sort {
	/**
	 * this class should not be instantiated
	 */
	private LHeap() {}

	/**
	 * sort the array
	 * @param a - array
	 * @param d - locality
	 */
	public static void sort(Comparable[] a, int d) {
		PriorityQueue heap = new PriorityQueue(a.length);
		int counter = 0;
		for (int i = 0; i < d + 1; i++) {
			heap.add(a[i]);
		}
		while (counter < a.length) {
			a[counter] = (Comparable) heap.poll();
			if (counter + d + 1 < a.length) {
				heap.add(a[counter + d + 1]);
			}
			counter++;
		}
	}
}
