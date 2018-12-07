package chain;

public class Client {
    public static void main(String[] args) {
        FirstHandler firstHandler=new FirstHandler();
        SecondHandler secondHandler=new SecondHandler();
        firstHandler.setNextHandler(secondHandler);
        Request request=new Request();
        request.setLevel(1);
        request.setMessage("让 1 来处理我 HaHaHa");
        Request request2=new Request();
        request2.setLevel(2);
        request2.setMessage("让 2 来处理我 hehehe");
        Request request3=new Request();
        request3.setLevel(3);
        request3.setMessage("没有人 来处理我 wuwuwu");
        firstHandler.exec(request);
        firstHandler.exec(request2);
        firstHandler.exec(request3);
    }
}
