import javax.swing.tree.TreeNode;

public class bubbleSort {
    public static void main(String[] a){
        int[] todosort=new int[]{99,100,4,2,3,1,7,9};
        int time=0;
        int changetime=0;
        boolean flag=false;
        int temp;
        for(int i=todosort.length-1;i>=0;i--){
            flag=false;
            for(int j=0;j<=i-1;j++){
                if(todosort[j]>todosort[j+1]){
                    temp=todosort[j];
                    todosort[j]=todosort[j+1];
                    todosort[j+1]=temp;
                    changetime++;
                    flag=true;
                }
                time++;
            }
            if(!flag){
                break;
            }
        }
        for(int i=0;i<todosort.length;i++){
            System.out.println(todosort[i]);
        }
        System.out.println("time="+time);
        System.out.println("changetime="+changetime);
    }
 
}

