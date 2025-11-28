// function interface is an interface with only one abstract methods;
@FunctionalInterface
interface FunInterface{
    void show();
}
public class O73_Functional_Ingerface_InrfaceObject {
    public static void main(String[] args) {
        FunInterface obj = new FunInterface() {
            @Override
            public void show() {
                System.out.println("this is the Annonymous class of interface");
            }
        };

    }
}
