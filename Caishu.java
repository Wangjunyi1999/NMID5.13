import java.util.Random;
import java.util.Scanner;
/**
 * 猜数小游戏 
 *
 */
public class Caishu {
    public static void main(String[] args) {
        int count;
        int number;
        int cont;
        int index = 0;
        int[] rank = new int[10];
        do {
            Scanner input = new Scanner(System.in);
            number = (int) (Math.random() * 100); // 产生随机数
            int guess;// 用户猜的数字
            // 猜测次数
            System.out.println("我心里有一个0到99之间的整数，你猜是什么？");
            // 用户猜测随机数
            count = 0;
            do {
                guess = input.nextInt();
                if (number < guess) {
                    System.out.println("大了点，再猜！");
                    count++;
                } else if (number > guess) {
                    System.out.println("小了点，再猜！");
                    count++;
                } else {
                    count++;
                    break;
                }

            }while (true);
            System.out.println("这个数字是" + number);
            System.out.println("您猜的次数是" + count);
            // 根据猜测次数给出评价
            if (count == 1) {
                System.out.println("你太聪明了！");
            } else if (count >= 2 && count <= 5) {
                System.out.println("不错，再接再厉！");
            } else {
                System.out.println("要努力啊！");
            }
            rank[index] = count;
            for (int i = index; i > 0; i--) {//让比较的范围不停的减掉最后一个单元
                for (int j = 1; j <= i; j++) {
                    if (rank[j - 1] > rank[j]) {//让2个数之间大的数排后面
                        int tmp = rank[j - 1];
                        rank[j - 1] = rank[j];
                        rank[j] = tmp;
                    }
                }
            }
            index++;
            System.out.println("请选择接下来要干的事：继续游戏（1）查看排行榜（2）退出游戏（3）");
            Scanner input1 = new Scanner(System.in);
            cont = input1.nextInt();
        } while (cont == 1);
        if (cont == 2) {
            for(int i =0;i<index;i++)
            {
                System.out.println(rank[i]);
            }
        }
    }
}
