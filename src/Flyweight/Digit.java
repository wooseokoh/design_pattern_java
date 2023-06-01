package Flyweight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Digit {
    private ArrayList<String> data = new ArrayList<String>();

    public Digit(String fileName){
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try{
            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);

            for (int i = 0; i < 8; i++) {
                data.add(bufferedReader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if(fileReader != null) fileReader.close();
                if(bufferedReader != null) bufferedReader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public void print(int x, int y){
        for (int i = 0; i < 8; i++) {
            String line = data.get(i);
            System.out.println(String.format("%c[%d;%df",0x1B,y+1,x));
            System.out.println(line);
        }
    }
}
