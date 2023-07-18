package homework01;

public interface VendingMachine {
    Product getProduct(String name) throws IllegalStateException;
}
