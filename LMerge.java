
/**
 * Locality-Aware Merge Sort
 * 
 * @author TODO put your username here
 * @version TODO put the date here
 * @pso   TODO put your PSO section here
 *
 */
public class LMerge extends Sort {
	/**
	 * this class should not be instantiated
	 */
	private LMerge() {}

	/**
	 * sort the array
	 * @param a - array
	 * @param d - locality
	 */

	public static void sort(Comparable[] a, int d) {
		if (a.length > 1) {
			Comparable[] b;
			Comparable[] c = new Comparable[a.length/2];

			if (a.length % 2 == 1) {
				b = new Comparable[a.length/2 + 1];
				for (int i = 0; i < a.length; i++) {
					if (i > a.length/2) {
						c[i - a.length/2 - 1] = a[i];
					} else {
						b[i] = a[i];
					}
				}
			} else {
				b = new Comparable[a.length/2];
				for (int i = 0; i < a.length; i++) {
					if (i > a.length/2 - 1) {
						c[i - a.length/2] = a[i];
					} else {
						b[i] = a[i];
					}
				}
			}


			sort(b, d);
			sort(c, d);

			if (a.length > (2 * d)) {
				int counter = 0;
				while (counter < b.length - d) {
					a[counter] = b[counter];
					counter++;
				}
				counter = counter + (2 * d);
				int c_counter = d;
				while (counter < a.length) {
					a[counter] = c[c_counter];
					counter++;
					c_counter++;
				}

				int b_min_index = b.length - d;
				int c_min_index = 0;

				for (int i = b_min_index; i < b.length + d; i++) {
					Comparable b_min;
					Comparable c_min;


					if (b_min_index == b.length) {
						c_min = c[c_min_index];
						a[i] = c_min;
						c_min_index++;
					} else if (c_min_index == d) {
						b_min = b[b_min_index];
						a[i] = b_min;
						b_min_index++;
					} else {
						b_min = b[b_min_index];
						c_min = c[c_min_index];
						if (b_min.compareTo(c_min) < 0) {
							a[i] = b_min;
							b_min_index++;
						} else {
							a[i] = c_min;
							c_min_index++;
						}
					}

				}
			} else {
				int b_min_index = 0;
				int c_min_index = 0;

				for (int i = 0; i < a.length; i++) {
					Comparable b_min;
					Comparable c_min;


					if (b_min_index == b.length) {
						c_min = c[c_min_index];
						a[i] = c_min;
						c_min_index++;
					} else if (c_min_index == c.length) {
						b_min = b[b_min_index];
						a[i] = b_min;
						b_min_index++;
					} else {
						b_min = b[b_min_index];
						c_min = c[c_min_index];
						if (b_min.compareTo(c_min) < 0) {
							a[i] = b_min;
							b_min_index++;
						} else {
							a[i] = c_min;
							c_min_index++;
						}
					}

				}
			}

		}
	}
}
