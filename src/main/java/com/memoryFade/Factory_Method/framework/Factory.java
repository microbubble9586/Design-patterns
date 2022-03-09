package src.main.java.com.memoryFade.Factory_Method.framework;

public abstract class Factory {
    public final Product create(String owner){
        //此处为了解耦，不直接new的方式创建实例
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }

    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
