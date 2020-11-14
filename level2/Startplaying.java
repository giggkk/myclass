package level2;

public class Startplaying {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Player p =new Player("卢本伟",100);
        ComputerPlayer cp=new ComputerPlayer("蔡徐坤",100);
        Game game=new Game(p,cp);
        game.start();

    }

}
