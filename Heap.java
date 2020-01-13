import java.util.PriorityQueue;
/**
 * General Heap Sort
 * 
 * TODO if this is an off-the-shelf implementation, cite where you got it from.
 * 
 * @author TODO put your username here
 * @version TODO put the date here
 * @pso   TODO put your PSO section here
 *
 */
public class Heap extends Sort {
	/**
	 * this class should not be instantiated
	 */
	private Heap() {}

	/**
	 * sort the array
	 * @param a - array
	 */
	public static void sort(Comparable[] a) {
		PriorityQueue heap = new PriorityQueue(a.length);
		for (int i = 0; i < a.length; i++) {
			heap.add(a[i]);
		}
		for (int i = 0; i < a.length; i++) {
			a[i] = (Comparable) heap.poll();
		}

	}

}
