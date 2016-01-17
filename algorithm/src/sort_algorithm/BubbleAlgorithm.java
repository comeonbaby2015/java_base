package sort_algorithm;

/**
 * <pre>
 *
 * 冒泡排序，这是面试官爱考的题目，
 * 基本运作是比较相邻的两个元素，小数放前面，大数放后面，将小数放在前面，大数放在后面，
 * 第一趟排序完成后最大的数放到了后面。然后再进行第二趟排序，重复，直到直到没有任何一对数字需要比较。
 *
 * 如初始状态为【10 12  5  7  2】的一组数据进行冒泡排序。
 *
 * 冒泡排序的过程
 * 排序前：		10 12 5 7 2
 *
 * 排序过程：
 * 第1趟排序结果:10 5 7 2 12
 * 第1趟排序结果:5 7 2 10 12
 * 第1趟排序结果:5 2 7 10 12
 * 第1趟排序结果:2 5 7 10 12
 * </pre>
 */
public class BubbleAlgorithm {
	public static void main(String[] args) {
		int[] arr = new int[]{10, 12, 5, 7, 2};
		System.out.print("排序前：");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println();

		sort(arr);

		System.out.println();
		System.out.print("排序后：");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();

	}

	public static void sort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.print("第1趟排序结果:");
			for (int num : arr) {
				System.out.print(num + " ");
			}
			System.out.println();

		}

	}
}
