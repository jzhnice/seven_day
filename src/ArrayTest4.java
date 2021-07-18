/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-07-18 16:42
 */

/**
 * 数组的复制、反转、查找(线性查找、二分法查找)
 */
public class ArrayTest4 {
    public static void main(String[] args) {
        String[] arr = new String[]{"jj", "dd", "mm", "bb", "gg", "aa"};

        // 数组的复制(区别于数组变量的赋值)
        String[] arr1 = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i] + "\t");
        }


        // 数组的反转一
        for (int i = 0; i < arr.length; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - 1 - i ] = temp;
        }

        // 数组的反转二
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // 查找（或搜索）
        //线性查找
        String dest = "bb";

        boolean isFlag = true;
        for (int i = 0; i < arr.length; i++) {
            if (dest.equals(arr[i])) {
                System.out.println("找到了指定元素，位置为:" + i);
                isFlag = false;
                break;
            }
        }
        if (isFlag) {
            System.out.println("很遗憾，没有找到偶");
        }
        // 遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
    }
}
