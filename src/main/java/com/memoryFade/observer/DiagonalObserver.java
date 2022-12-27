package src.main.java.com.memoryFade.observer;

public class DiagonalObserver implements Observer {
    @Override
    public void update(NumberGenerator numberGenerator) {
        int number = numberGenerator.getNumber();
        System.out.println("SquareObserver:");
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == j) {
                    System.out.print("\\");
                } else if (j == 0 || j == number - 1) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println(" ");
    }
}
