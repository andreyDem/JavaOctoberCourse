package independentWork.generics.exampleGeneric;

/**
 * Created by Andrey on 23.12.2016.
 */
public class Container<T extends Product> {
    private T item;

    Container<Product> p0 = new Container<>();
    Container<Camera> p1 = new Container<>();
    Container<Phone> p2 = new Container<>();

    //Container<String> p5 = new Container<String>();  Compilation Error

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
