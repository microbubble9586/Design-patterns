package src.main.java.com.memoryFade.Factory_Method.idcard;

import src.main.java.com.memoryFade.Factory_Method.framework.Product;

public class IDCard extends Product {
    private String owner;
    @Override
    public void use() {
        System.out.println("使用"+owner+"的id card");
    }

    public IDCard(String owner) {
        System.out.println("制作"+owner+"的id card");
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }
}
