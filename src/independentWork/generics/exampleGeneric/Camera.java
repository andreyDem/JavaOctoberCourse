package independentWork.generics.exampleGeneric;

/**
 * Created by Andrey on 23.12.2016.
 */
public class Camera extends Product{
    private Integer pixel;

    @Override
    boolean subCompare(Product p) {
        return false;
    }

//    @Override
//    boolean subCompare(Camera p) {
//        return false;
//    }
}
