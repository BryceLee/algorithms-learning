public class QuickSort {
    static int changeTime;
    static int timeN;

    public static void main(String[] args) {
        changeTime = 0;
        timeN = 0;
        int[] todosort = new int[] { 1, 5,2,3,4};
        sort(todosort, 0, todosort.length - 1);
        for (int i = 0; i < todosort.length; i++) {
            System.out.println(todosort[i]);
        }
        System.out.println("changetime=" + changeTime + ",timeN=" + timeN);
    }

    public static void sort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int p = getPatition(array, start, end);
        // int p = partition(array, start, end);

        sort(array, start, p - 1);
        sort(array, p + 1, end);
    }

    public static int getPatition(int[] array, int start, int end) {
        int P = array[end];
        int i = start, j = start;
        System.out.println("得到分区点函数，start:"+start+",end:"+end);
        while (j < end) {
            if (array[j] < P) {// if you want to array in order of descdening,you can replayce "<" with ">"
                swap(array, i, j);
                i++;
            } else {
                // 更大的数延迟交换
            }
            j++;
            timeN++;
        }
        // 前面所有的操作就是为了找到P的位置i
        swap(array, i, end);
        System.out.println("p=" + i);
        timeN++;
        return i;
    }

    public static void swap(int[] array, int a, int b) {
        if(a==b){
            System.out.println("跳过交换"+a+"和"+b);
            return;
        }
        System.out.println("交换"+a+"和"+b);
        changeTime++;
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    private static int partition(int[] a, int p, int r) {
        int pivot = a[r];
        int i = p;
        for (int j = p; j < r; ++j) {
            if (a[j] < pivot) {
                if (i == j) {

                } else {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
                i++;
            }
        }

        int tmp = a[i];
        a[i] = a[r];
        a[r] = tmp;

        System.out.println("i=" + i);
        return i;
    }

}