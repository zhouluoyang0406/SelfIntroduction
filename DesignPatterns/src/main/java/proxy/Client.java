package proxy;


import builder.Director;

public class Client {
    public static void main(String[] args) {
        IGamePlayer player=new GamePlayer();
        GamePlayerProxy playProxy=new GamePlayerProxy();
        playProxy.setGamePlayer(player);
        playProxy.killBoss();
        playProxy.upgrate();
    }
}
