package level2;

//玩家类
public class Player {
    private String name; //玩家昵称
    private int score; //玩家积分
    private String box; //玩家出的

    //玩家构造函数，传入玩家昵称与玩家初始积分
    Player(String name,int score){
        this.name=name;
        this.score=score;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public String getBox() {
        return box;
    }
    public void setBox(String box) {
        this.box = box;
    }



}
