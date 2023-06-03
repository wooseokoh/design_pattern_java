package FactoryMethod;

public class Shield implements Item{
    @Override
    public void use() {
        System.out.println("방패입니다.");
    }
}
