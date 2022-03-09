package src.main.java.com.memoryFade.Factory_Method.idcard;

import src.main.java.com.memoryFade.Factory_Method.framework.Factory;
import src.main.java.com.memoryFade.Factory_Method.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {
    private List<String> owners = new ArrayList<>();
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    public List<String> getOwners() {
        return owners;
    }

    @Override
    protected void registerProduct(Product product) {

        owners.add(((IDCard)product).getOwner());
    }
}
