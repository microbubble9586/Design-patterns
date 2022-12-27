package src.main.java.com.memoryFade.memomto;

import src.main.java.com.memoryFade.memomto.game.Gamer;
import src.main.java.com.memoryFade.memomto.game.Memento;

public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento mememto = gamer.createMemento();
        for (int i = 0; i < 100; i++) {
            System.out.println("======"+i);
            System.out.println("当前状态："+gamer);
            gamer.bet();
            System.out.println("所持金钱为" + gamer.getMoney()+"元");
            if (gamer.getMoney()> mememto.getMoney()){
                System.out.println("     (所持金钱增加了许多，因此保存游戏当前状态)      ");
                mememto = gamer.createMemento();
            } else if (gamer.getMoney()< mememto.getMoney()/2) {
                System.out.println("     (所持金钱减少了许多，因此将游戏恢复只以前的状态)");
                gamer.restoreMemento(mememto);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(" end ");
        }



    }
}
