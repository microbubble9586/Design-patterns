package src.main.java.com.memoryFade.Adapter.baseOnTheAssigned;

import src.main.java.com.memoryFade.Adapter.basicOnExtends.Print;
import src.main.java.com.memoryFade.Adapter.basicOnExtends.PrintBanner;

public class Main  {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
