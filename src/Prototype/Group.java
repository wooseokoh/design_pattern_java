package Prototype;

import java.util.ArrayList;
import java.util.Iterator;

public class Group implements Prototype,Shape{
    private ArrayList<Shape> arrayList = new ArrayList<Shape>();

    private String name;

    public Group(String name) {
        this.name = name;
    }

    Group addShape(Shape shape){
        arrayList.add(shape);
        return this;
    }

    @Override
    public Object copy() {
        Group result = new Group(name);
        Iterator<Shape> iter = arrayList.iterator();
        while (iter.hasNext()){
            Prototype prototype = (Prototype) iter.next();
            result.arrayList.add((Shape)prototype.copy());
        }
        return result;
    }

    @Override
    public String draw() {
        StringBuffer result = new StringBuffer(name);
        result.append("(");
        Iterator<Shape> iter = arrayList.iterator();
        while (iter.hasNext()){
            Shape shape = iter.next();
            result.append(shape.draw());
            if(iter.hasNext()){
                result.append(" ");
            }
        }
        result.append(")");
        return result.toString();
    }

    @Override
    public void moveOffset(int dx, int dy) {
        Iterator<Shape> iter = arrayList.iterator();
        while (iter.hasNext()){
            Shape shape = iter.next();
            shape.moveOffset(dx, dy);
        }
    }
}
