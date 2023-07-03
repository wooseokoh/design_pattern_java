package ChainOfResponsibility;

public class MainEntry {
    public static void main(String[] args) {
        Handler handler1 = new ProtocolHandler();
        Handler handler2 = new PortHandler();
        Handler handler3 = new DomainHandler();

        handler1.setHandler(handler2).setHandler(handler3);
        String url = "http://www.naver.com:3306";
        System.out.println("INPUT: " + url);

        handler1.run(url);
    }
}
