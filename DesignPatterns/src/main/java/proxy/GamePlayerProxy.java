package proxy;


public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer iGamePlayer;
    public void setGamePlayer(IGamePlayer gamePlayer) {
        this.iGamePlayer = gamePlayer;
    }
    public void killBoss() {
        iGamePlayer.killBoss();
    }
    public void upgrate() {
        iGamePlayer.upgrate();
    }
}
