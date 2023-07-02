package Decorator;

public class MainEntry {
    public static void main(String[] args) {
        Strings strings = new Strings();
        strings.add("hello");
        strings.add("good");

        Item decorator = new SideDecorator(strings, '\"');
        decorator = new LineNumberDecorator(decorator);
        decorator = new BoxDecorator(decorator);

        decorator.print();
    }
}
