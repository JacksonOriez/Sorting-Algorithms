
/**
 * General Selection Sort
 * 
 * TODO if this is an off-the-shelf implementation, cite where you got it from.
 * 
 * @author TODO put your username here
 * @version TODO put the date here
 * @pso   TODO put your PSO section here
 *
 */
public class Selection extends Sort {
	/**
	 * this class should not be instantiated
	 */
	private Selection() {}

	/**
	 * sort the array
	 * @param a - array
	 */
	public static void sort(Comparable[] a) {
		Comparable temp;
		Comparable min;
		for (int i = 0; i < a.length; i++) {
			int min_index = i;
			temp  = a[i];
			min = temp;
			for (int j = i; j < a.length; j++) {
				if (min.compareTo(a[j]) > 0) {
					min = a[j];
					min_index = j;
				}
			}
			a[i] = min;
			a[min_index] = temp;
		}
	}
}
