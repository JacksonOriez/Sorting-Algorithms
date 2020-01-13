
/**
 * General Quick Sort
 * 
 * TODO if this is an off-the-shelf implementation, cite where you got it from.
 * Taken from GeeksForGeeks
 * 
 * @author TODO put your username here
 * @version TODO put the date here
 * @pso   TODO put your PSO section here
 *
 */
public class Quick extends Sort {
	/**
	 * this class should not be instantiated
	 */
	private Quick() {}

	/**
	 * sort the array
	 * @param a - array
	 */
	public static void sort(Comparable[] a) {
		int left = 0;
		int right = a.length - 1;
		Quicksort(a, left, right);

	}

	public static void Quicksort(Comparable[] a, int left, int right) {
		if (left < right) {
			int pivot = partition(a, left, right);

			Quicksort(a, left, pivot - 1);
			Quicksort(a, pivot + 1, right);
		}
	}

	public static int partition(Comparable[] a, int left, int right) {
		Comparable temp;
		Comparable pivot = a[right];

		int counter = left - 1;
		for (int j = left; j <= right - 1; j++) {
			if (a[j].compareTo(pivot) < 0) {
				counter++;

				temp = a[j];
				a[j] = a[counter];
				a[counter] = temp;
			}
		}

		temp = a[right];
		a[right] = a[counter + 1];
		a[counter + 1] = temp;

		counter++;

		return counter;
	}

}