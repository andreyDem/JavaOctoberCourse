package independentWork.generics.exampleGeneric;

public abstract class Product implements Comparable<Product>{
    private String name;
    private Integer price;

    @Override
    public int compareTo(Product o) {
        return 0;
    }

    abstract boolean subCompare(Product p);   //T
}
