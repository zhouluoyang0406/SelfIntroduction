package facade;

public class Client {
    public static void main(String[] args) {
        Facade facade=new Facade();
        facade.methodOne();
        facade.methodTwo();
        facade.methodThree();
    }
}
