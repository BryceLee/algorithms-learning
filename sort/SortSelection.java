public class SortSelection {
    public static void main(String[] args) {
        int[] todosort = new int[] { 4, 2, 3, 1, 7, 9 };
        int temp;

        for (int i = 0; i < todosort.length; i++) {
            int minindex = i;
            for (int j = i + 1; j < todosort.length; j++) {
                if (todosort[minindex] > todosort[j]) {
                    minindex = j;
                }
            }
            temp = todosort[i];
            todosort[i] = todosort[minindex];
            todosort[minindex] = temp;
        }
        for (int i = 0; i < todosort.length; i++) {
            System.out.println(todosort[i]);
        }
    }
}