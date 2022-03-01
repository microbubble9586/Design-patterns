package src.main.java.com.memoryFade.Factory_MEthod;

import src.main.java.com.memoryFade.Factory_MEthod.framework.Factory;
import src.main.java.com.memoryFade.Factory_MEthod.framework.Product;
import src.main.java.com.memoryFade.Factory_MEthod.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("x1");
        Product card2 = factory.create("x2");
        Product card3 = factory.create("x3");
        card1.use();
        card2.use();
        card3.use();
    }

}
