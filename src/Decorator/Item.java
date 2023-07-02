package Decorator;

public abstract class Item {
    public abstract int getLinesCount();
    public abstract int getLength(int index);
    public abstract int getMaxLength();
    public abstract String getString(int index);

    public void print(){
        int cntLines = this.getLinesCount();
        for (int index = 0; index < cntLines; index++) {
            String string = getString(index);
            System.out.println(string);
        }
    }
}
