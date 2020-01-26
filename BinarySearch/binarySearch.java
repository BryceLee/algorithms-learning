public class binarySearch {
    public static void main(String[] args) {
        int target = 7;
        int[] array = new int[] { 1, 2, 3, 4, 6 };   
        System.out.println("target=" + target);
        int i = binarySearch(array, target, 0, array.length - 1);
        System.out.println("1recursion=" + i);
        int j = binarySearchRecursion(array, target, 0, array.length - 1);
        System.out.println("circulation=" + j); 
    }

    /**
     * circulation
     * 
     * @param array
     * @param target
     * @param start
     * @param end
     * @return
     */
    public static int binarySearch(int[] array, int target, int start, int end) {
        if (start>end) {
            return -1;
        }
        int middle = start + ((end - start)>>2);
        if (target == array[middle]) {
            return middle;
        } else if (target > array[middle]) {
            return binarySearch(array, target, middle + 1, end);
        } else {
            return binarySearch(array, target, start, middle - 1);
        }
    }

    /**
     * recursion
     * 
     * @param array
     * @param target
     * @param start
     * @param end
     * @return
     */
    public static int binarySearchRecursion(int[] array, int target, int start, int end) {
        while (start <= end) {
            int mid = start + ((end - start) >> 2);
            if (array[mid] == target) {
                return mid;
            } else if (target<array[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}