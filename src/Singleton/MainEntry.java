package Singleton;

public class MainEntry {
    public static void main(String[] args) {
        King king = King.getInstance();
        king.say();

        King king1 = King.getInstance();
        if(king1==king){
            System.out.println("same");
        }else{
            System.out.println("different");
        }
    }
}
