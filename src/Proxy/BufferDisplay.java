package Proxy;

import java.util.ArrayList;

public class BufferDisplay implements Display{
    private ArrayList<String> buffer = new ArrayList<String>();
    private ScreenDisplay screenDisplay;
    private int bufferSzie;

    public BufferDisplay(int bufferSzie) {
        this.bufferSzie = bufferSzie;
    }

    @Override
    public void print(String content) {
        buffer.add(content);
        if(buffer.size() == bufferSzie){
            flush();
        }
    }

    public void flush(){
        if(screenDisplay == null) screenDisplay = new ScreenDisplay();
        String lines = String.join("\n", buffer);
        screenDisplay.print(lines);
        buffer.clear();
    }
}
