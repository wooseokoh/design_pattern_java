package FactoryMethod;

import java.util.HashMap;

public class ItemFactory extends Factory{
    private class ItemData{
        int maxCount;
        int currentCount;
        public ItemData(int maxCount) {
            this.maxCount = maxCount;
        }
    }

    private HashMap<String, ItemData> repository;

    public ItemFactory() {
        repository = new HashMap<String, ItemData>();
        repository.put("sword", new ItemData(1));
        repository.put("shield", new ItemData(2));
        repository.put("bow", new ItemData(3));
    }

    @Override
    public boolean isCreatable(String name) {
        ItemData itemData = repository.get(name);
        if(itemData == null){
            System.out.println(name + "알수없는 아이템입니다.");
            return false;
        }
        return true;
    }

    @Override
    public Item createItem(String name) {
        Item item = null;

        if(name == "sword") item = new Sword();
        if(name == "shield") item = new Shield();
        if(name == "bow") item = new Bow();

        return item;
    }

    @Override
    public void postprocessItem(String name) {
        ItemData itemData = repository.get(name);
        if(itemData != null) itemData.currentCount++;
    }
}
