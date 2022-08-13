package noob_00;

/**
 * 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {

    }

    public static void bubbleSort(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            int maxValueIndex = i;
            for (int j = 0; j <= i; j++) {
                maxValueIndex = nums[j] > nums[maxValueIndex] ? j : maxValueIndex;
            }
            swap(nums, i, maxValueIndex);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
