package independentWork.generics.exampleGeneric;

/**
 * Created by Andrey on 23.12.2016.
 */
public class Phone extends Product {
    private String model;

//    @Override
//    boolean subCompare(Phone p) {
//        return false;
//    }

    @Override
    boolean subCompare(Product p) {
        return false;
    }
}
