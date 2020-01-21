import sun.security.util.Length;

public class mergesort {
  
  public static void main(String[] args) {
    int[] array = new int[] { 1, 2, 3, 1212, 42, 52, 11, 21 };
    merge(array, 0, array.length - 1);
    for (int i = 0; i < array.length; i++) {
        System.out.println(array[i]);
    }
}

public static void merge(int[] array, int start, int end) {
    if (start >= end) {
        return;
    }
    int middle = start + (end - start) / 2;
    merge(array, start, middle);
    merge(array, middle + 1, end);
    mergeArray(array, start, middle, end);
    //mergeBySentry(array, start, middle, end);
    //mergeBySentryDsort(array, start, middle, end);
    //mergeBySentryDsort2(array, start, middle, end);
}

public static void mergeArray(int[] array, int start, int middle, int end) {
    int i = start, j = middle + 1, k = 0;
    int[] temp = new int[end - start + 1];
    while (i <= middle && j <= end) {
        if (array[i] <= array[j]) {// if you want to sort in order of descending，replace "<=" with ">="
            temp[k++] = array[i++];
        } else {
            temp[k++] = array[j++];
        }
    }
    int tempStart, tempEnd;
    if (i <= middle) {
        tempStart = i;
        tempEnd = middle;
    } else {
        tempStart = j;
        tempEnd = end;
    }
    while (tempStart <= tempEnd) {
        temp[k++] = array[tempStart++];
    }
    // copy to array
    for (int index = 0; index < temp.length; index++) {
        array[start + index] = temp[index];
    }
}

/**
 * sentry mode reduce complexity of mergeArray.
 * 
 * @param array
 * @param start
 * @param middle
 * @param end
 */
public static void mergeBySentry(int[] array, int start, int middle, int end) {
    int[] left = new int[middle - start + 2];
    int[] right = new int[end - (middle + 1) + 2];
    for (int i = 0; i < middle - start + 1; i++) {
        left[i] = array[start + i];
    }
    int thresold = Integer.MAX_VALUE;
    left[middle - start + 1] = thresold;
    for (int j = 0; j < end - (middle + 1) + 1; j++) {
        right[j] = array[middle + 1 + j];
    }
    right[end - middle] = thresold;
    int indexI = 0, indexJ = 0, k = start;
    while (k <= end) {
        if (left[indexI] < right[indexJ]) {
            array[k++] = left[indexI++];
        } else {
            array[k++] = right[indexJ++];
        }
    }
}

/**
 * sentry mode reduce complexity of mergeArray.
 * 
 * @param array
 * @param start
 * @param middle
 * @param end
 */
public static void mergeBySentryDsort(int[] array, int start, int middle, int end) {
    int[] left = new int[middle - start + 2];
    int[] right = new int[end - (middle + 1) + 2];
    for (int i = 0; i < middle - start + 1; i++) {
        left[i] = array[start + i];
    }
    int thresold = Integer.MAX_VALUE;
    left[middle - start + 1] = thresold;
    for (int j = 0; j < end - (middle + 1) + 1; j++) {
        right[j] = array[middle + 1 + j];
    }
    right[end - middle] = thresold;
    int indexI = 0, indexJ = 0, k = start;
    while (k <= end) {
        if (left[indexI] >= right[indexJ]) {
            if (left[indexI] == thresold) {
                array[k++] = right[indexJ++];
            } else {
                array[k++] = left[indexI++];
            }
        } else {
            if (right[indexJ] == thresold) {
                array[k++] = left[indexI++];
            } else {
                array[k++] = right[indexJ++];
            }
        }
    }
}

/**
 * sentry mode reduce complexity of mergeArray.
 * make sentry to be judgement condition.
 * 
 * @param array
 * @param start
 * @param middle
 * @param end
 */
public static void mergeBySentryDsort2(int[] array, int start, int middle, int end) {
    int[] left = new int[middle - start + 2];
    int[] right = new int[end - (middle + 1) + 2];
    for (int i = 0; i < middle - start + 1; i++) {
        left[i] = array[start + i];
    }
    int thresold = Integer.MIN_VALUE;
    left[middle - start + 1] = thresold;
    for (int j = 0; j < end - (middle + 1) + 1; j++) {
        right[j] = array[middle + 1 + j];
    }
    right[end - middle] = thresold;
    int indexI = 0, indexJ = 0, k = start;
    while (k <= end) {
        if (left[indexI] >= right[indexJ]) {
            array[k++] = left[indexI++];
        } else {
            array[k++] = right[indexJ++];
        }
    }
}
}