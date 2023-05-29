package Iterator;

public class MainEntry {
    public static void main(String[] args) {
        Item[] items
                = {
                new Item("cpu",1000),
                new Item("gpu",2000),
                new Item("mouse",2400),
                new Item("hdd",4000),
        };

        Array array = new Array(items);
        Iterator iterator = array.iterator();

        while (iterator.next())
        {
            Item item = (Item) iterator.current();
            System.out.println(item);
        }
    }
}
