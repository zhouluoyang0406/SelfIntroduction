package memo;

/**
 * Created by appleluo on 2018/9/15.
 */
public class Client {
    public static void main(String[] args) {
        Boy boy=new Boy();
        Caretaker caretaker=new Caretaker();
        boy.setState("开心");
        System.out.println(boy.getState());
        caretaker.setMemento(boy.createMento());
        boy.setState("失败了,难过");
        System.out.println(boy.getState());
        boy.restoreMento(caretaker.getMemento());
        System.out.println(boy.getState());
    }
}
