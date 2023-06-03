package FactoryMethod;

public class Sword implements Item{
    @Override
    public void use() {
        System.out.println("칼입니다.");
    }
}
