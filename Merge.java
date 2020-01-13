
/**
 * General Merge Sort
 * 
 * TODO if this is an off-the-shelf implementation, cite where you got it from.
 * 
 * @author TODO put your username here
 * @version TODO put the date here
 * @pso   TODO put your PSO section here
 *
 */
public class Merge extends Sort {
	/**
	 * this class should not be instantiated
	 */
	private Merge() {}

	/**
	 * sort the array
	 * @param a - array
	 */
	public static void sort(Comparable[] a) {
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


			sort(b);
			sort(c);

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
