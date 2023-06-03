package FactoryMethod;

public class Bow implements Item{
    @Override
    public void use() {
        System.out.println("활입니다.");
    }
}
