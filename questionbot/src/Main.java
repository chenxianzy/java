import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("    __|-0__|-0__|-0 愿得一学霸，白首不相离，带我上自习，一日刷千题！");
        Thread.sleep(2000);
        System.out.println("~~~~~~~~~~~~~~~前方高能，惊喜就在眼前。Single Enter 就可以开盲盒，不信就试试~~~~~");

        Scanner reader = new Scanner(System.in);
        while(!reader.nextLine().equals("")){

        }

        Random random = new Random();
        int randomInt = random.nextInt();
        int selection = randomInt%3+1;
        System.out .println("恭喜你选中了第"+selection+"题，请用Java语言编程作答。");

        switch (selection){
            case 1:
                System.out.println("校园十大歌手投票结束了，每位选手的得票统计完毕如果得票选手最高的 的选手是A，得票选手最多的票数是B，求A-B有多大？ 说名，选手的编号为1-10");
                System.out.println("输入第一行为得到的选票数。例如：");
                System.out.println("5");
                System.out.println("输入的第二行说明了每张选票选了哪位选手。例如：");
                System.out.println("1 1 1 2 3");
                System.out.println("则应该输出：3");
                break;
            case 2:
                System.out.println("小明为了学习编程买了一台电脑假设他第一天可以得到一元，第二天可以得到二元，第三天三元……依次类推。请问他第几天可以达成心愿");
                System.out.println("输入第一行为点电脑的价格（假设价格小于等于十万。例如：");
                System.out.println("8");
                System.out.println("则应该输出：4");
                break;
            case 3:
                System.out.println("你遇到一头僵尸大王，他的血量为n，你用斧头去砍它，每砍一次僵尸HP-2，但是连续砍动三次，会触发一次暴击，暴击可以额外砍掉10HP。请问砍多少次可以砍死僵尸");
                System.out.println("输入第一行为僵尸的血量（假设血量小于等于一万）。例如：");
                System.out.println("17");
                System.out.println("则应该输出：4");
                break;
            default:
                System.out.println(("面试通过，这不可能，哈哈……———……"));
                break;
        }


    }
}