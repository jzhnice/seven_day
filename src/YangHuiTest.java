/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-07-17 10:55
 */
/**
 * 使用二维数组打印一个 10行  杨辉三角。
 * 【提示】
 * 1. 第一行有 1 个元素, 第 n 行有 n 个元素
 * 2. 每一行的第一个元素和最后一个元素都是 1
 * 3. 从第三行开始, 对于非第一个元素和最后一个元
 * 素的元素。即：
 * yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
 *
 * */
public class YangHuiTest {
    public static void main(String[] args) {
        //声明并初始化二维数组
        int[][] yanghui = new int[10][];

        // 给数组的元素赋值
        for (int i = 0; i < yanghui.length; i++) {
            yanghui[i] = new int[i+1];

            // 给首末元素赋值
            yanghui[i][0] = yanghui[i][i]=1;

            // 给每行的非首末元素赋值

            for (int j = 1; j < yanghui[i].length-1; j++) {
                yanghui[i][j] = yanghui[i-1][j-1]+yanghui[i-1][j];
            }
        }
        // 遍历二维数组
        for (int i = 0; i < yanghui.length; i++) {
            for (int j = 0; j < yanghui[i].length ; j++) {
                System.out.print(yanghui[i][j] + " ");
            }
            System.out.println();
        }
    }
}
