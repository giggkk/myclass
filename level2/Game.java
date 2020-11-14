package level2;

import java.util.Scanner;

public class Game {
    Player p;  //玩家
    ComputerPlayer cp;  //机器人玩家

    //构造函数，得到一个玩家和一个机器人玩家
    Game(Player p, ComputerPlayer cp) {
        this.p = p;
        this.cp = cp;
    }

    //开始游戏
    void start() {
        System.out.println("玩家" + p.getName() +
                "和" + cp.getName() + "开始游戏咯");
        System.out.println("您的初始积分为：" + p.getScore() +
                "\n" + cp.getName() + "的积分是：" + cp.getScore());
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("请出拳（剪刀石头布,exit退出游戏）：");
            String pbox = sc.next();
            if (filter(pbox)) { //过滤器
                if (pbox.equals("exit")) { //退出游戏
                    break;
                } else {
                    p.setBox(pbox);
                    cp.punch();
                    System.out.println("您出了：" + p.getBox());
                    System.out.println(cp.getName() + "出了：" + cp.getBox());
                    int result = ruler(p, cp);
                    if (result > 0) {
                        System.out.println("您赢了，赢得10积分");
                        p.setScore(p.getScore() + 10);
                        cp.setScore(cp.getScore() - 10);
                    } else if (result < 0) {
                        System.out.println("您输了，扣除10积分");
                        p.setScore(p.getScore() - 10);
                        cp.setScore(cp.getScore() + 10);
                    } else {
                        System.out.println("您和机器人平手！");
                    }
                }
            } else {
                System.out.println("输入错误，请重新输入：");
                continue; //退出本次循环，进入下一次循环
            }

        }

        System.out.println("本轮结束，积分情况如下：");
        System.out.println("您的当前积分：" + p.getScore());
        System.out.println(cp.getName() + "的当前积分："
                + cp.getScore());

    }

    /**
     * 游戏规则
     *
     * @param p1  玩家1
     * @param cp2 机器玩家2
     * @return 0为打平，1为玩家赢，-1为机器玩家赢
     */
    int ruler(Player p1, Player cp2) {

        if (p1.getBox().equals("剪刀")) {
            if (cp2.getBox().equals("石头"))
                return -1;
            else if (cp2.getBox().equals("布"))
                return 1;
        } else if (p1.getBox().equals("石头")) {
            if (cp2.getBox().equals("剪刀"))
                return 1;
            else if (cp2.getBox().equals("布"))
                return -1;
        } else if (p1.getBox().equals("布")) {
            if (cp2.getBox().equals("剪刀"))
                return -1;
            else if (cp2.getBox().equals("石头"))
                return 1;
        }
        return 0;
    }

    /**
     * 过滤器
     *
     * @param s 需要过滤的文字
     * @return
     */
    boolean filter(String s) {
        if (s.equals("剪刀") || s.equals("石头") || s.equals("布") || s.equals("exit")) {
            return true;
        } else
            return false;
    }
}