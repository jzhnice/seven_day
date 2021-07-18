/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-07-18 16:28
 */

/**
 拓展：修改题目，实现array2对array1数组的复制
 */
public class ArrayTest3 {
    public static void main(String[] args) {
        int[] array1, array2;
        array1 = new int[]{
                2, 3, 5, 7, 11, 13, 17, 19
        };

        // 显示array1的内容
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
        // 赋值array2变量等于array1
        // 不能称作数组的复制
        array2 = new int[array1.length];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array1[i];
        }
        // 修改array2中的偶索引元素，时期等于索引值（如array[0] = 0，array[2] = 2）
        for (int i = 0; i < array2.length; i++) {
            if (i % 2 == 0) {
                array2[i] = i;
            }
        }
        System.out.println(
        );

        // 打印出array1
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
    }
}


