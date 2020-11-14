package level2;

public class ComputerPlayer extends Player {


    //机器人玩家构造函数，传入机器人昵称与初始积分
    ComputerPlayer(String name, int score) {
        super("机器人"+name, score);
        // TODO Auto-generated constructor stub
    }

    /**
     * 实现机器人玩家随机出拳
     */
    void punch() {
        String[] box = {"剪刀","石头","布"};
        int index =(int) (Math.random()*3);

        this.setBox(box[index]);
    }
}
