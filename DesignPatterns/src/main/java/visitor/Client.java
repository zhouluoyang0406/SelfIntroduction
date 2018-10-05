package visitor;

/**
 * Created by appleluo on 2018/9/16.
 */
public class Client {
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            Element e=ObjectStruture.createElem();
            e.accept(new Visitor());
        }
    }
}
