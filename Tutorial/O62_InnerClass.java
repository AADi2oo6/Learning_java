// creating class inside a class is called inner class
    class Comp{
    public void contain(){
        System.out.println("Hardwhare + Softwhare");
    }
    class Hardwere{
        public void contains(){
            System.out.println("motherboard + graphicard");
        }
    }
    static class Softwere{
        public void Os(){
            System.out.println("Windows");
        }
    }

}

public class O62_InnerClass {
    public static void main(String[] args) {
        //in order to get inner class we need object of outer class
        Comp acer = new Comp();
        acer.contain();
        // let' create an object for inner class
        Comp.Hardwere intel = acer.new Hardwere();// WHEN INNER CLASS IS NOT STATIC
        Comp.Softwere win =new Comp.Softwere();// when inner class is static don't need to create object
        intel.contains();

    }
}
