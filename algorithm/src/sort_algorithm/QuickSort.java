package sort_algorithm;

/**
 * <pre>
 * 使用快速排序方法排序
 * </pre>
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] sort = {54, 31, 89, 33, 66, 12, 68, 20};

        System.out.print("排序前：");
        for (int num : sort) {
            System.out.print(num + " ");
        }

        // 使用快速排序方法排序
        quickSort(sort, 0, sort.length - 1);

        System.out.println();
        System.out.print("排序后：");
        for (int num : sort) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    /**
     * <pre>
     * @param sort    要排序的数据
     * @param start    排序的开始下标
     * @param end    排序的结束下标
     * </pre>
     */
    public static void quickSort(int sort[], int start, int end) {

        // 设置关键数据key为要排序数组的第一个元素。第一趟排序后，key右边的数全部比key大，key左边的数全部比key小
        int key = sort[start];
        // 设置数组左边的索引，往右移动判断比key大的数
        int i = start;
        // 设置数组右边的索引，往左移动判断比key小的数
        int j = end;

        // 如果左边索引比右边索引小，则还有数据没有排序
        while (i < j) {
            while ((start < j) && (sort[j] > key)) {
                j--;
            }

            while ((i < end) && sort[i] < key) {
                i++;
            }

            if (i < j) {
                int temp = sort[i];
                sort[i] = sort[j];
                sort[j] = temp;
            }
        }

        // 递归调用。当key左边的数小于key，右边的数大于key后，可以对key的左边和右边进行递归排序了
        if ((start < j) && (j < end)) {
            quickSort(sort, start, j - 1);
            quickSort(sort, j + 1, end);
        }
    }
}
