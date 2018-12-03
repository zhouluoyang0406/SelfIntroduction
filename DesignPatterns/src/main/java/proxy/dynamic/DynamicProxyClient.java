package proxy.dynamic;

import proxy.GamePlayer;
import proxy.IGamePlayer;

import java.lang.reflect.Proxy;
public class DynamicProxyClient {
     public static void main(String[] args) {
         IGamePlayer gamePlayer = new GamePlayer();
         IGamePlayer gamePlayerProxy = (IGamePlayer) Proxy.newProxyInstance(IGamePlayer.class.getClassLoader(), new
                 Class[]{IGamePlayer.class}, new DynamicProxyHandler(gamePlayer));
         gamePlayerProxy.killBoss();
         gamePlayerProxy.upgrate();
     }
 }