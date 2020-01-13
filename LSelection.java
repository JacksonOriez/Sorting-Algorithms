
/**
 * Locality-Aware Selection Sort
 * 
 * @author TODO put your username here
 * @version TODO put the date here
 * @pso   TODO put your PSO section here
 */
public class LSelection extends Sort {
	/**
	 * this class should not be instantiated
	 */
	private LSelection() {}

	/**
	 * sort the array
	 * @param a - array
	 * @param d - locality
	 */
	public static void sort(Comparable[] a, int d) {
		Comparable temp;
		Comparable min;
		for (int i = 0; i < a.length - d; i++) {
			int min_index = i;
			temp  = a[i];
			min = temp;
			for (int j = i; j < i + d + 1; j++) {
				if (min.compareTo(a[j]) > 0) {
					min = a[j];
					min_index = j;
				}
			}
			a[i] = min;
			a[min_index] = temp;
		}

		for (int i = a.length - d; i < a.length; i++) {
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
