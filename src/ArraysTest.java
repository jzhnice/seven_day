import java.util.Arrays;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-07-20 15:31
 */
public class ArraysTest {
    public static void main(String[] args) {

        //boolean equals(int [] a,int [] b);判断两个数组是否相同
        int [] arr1 = new int[]{1,2,3,4};
        int [] arr2 = new int[]{1,3,2,4};

        boolean isflag = Arrays.equals(arr1, arr2);
        System.out.println(isflag);

        // String toString(int [] a):输出数组信息
        System.out.println(Arrays.toString(arr1));

        // void fill(int [] a,int val):将指定值填充数组之后；
        Arrays.fill(arr1,10);
        System.out.println(Arrays.toString(arr1));

        // void sort(int [] a):对数组进行排序
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        // int binarySearch(int[] a,int key)
        int[] arr3 = new int[] {-98,-34,2,45,67,97,564,3432,43};
        int index = Arrays.binarySearch(arr3, 45);
        System.out.println(index);
    }
}
