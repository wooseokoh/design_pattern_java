package Iterator;

public class Array implements Aggregator {
    private Item[] items;

    public Array(Item[] items) {
        this.items = items;
    }

    public int getCount(){
        return items.length;
    }

    public Item getItem(int index) {
        return items[index];
    }

    @Override
    public Iterator iterator() {
        return new ArrayIterator(this);
    }
}
