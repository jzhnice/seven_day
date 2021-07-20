/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-07-20 15:02
 */
public class BubbleSotrtTest {
    public static void main(String[] args) {
        int[] arr = new int[] {43,23,12,546,68769,-67,564,-45};

        //冒泡排序
        // 外层 决定几次
        for (int i = 0; i < arr.length-1; i++) {
            // .length-1-i 是内层
            for (int j = 0; j < arr.length - 1- i; j++) {

                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }


        }





        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }

    }
}
