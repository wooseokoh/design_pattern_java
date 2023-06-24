package Proxy;

public class MainEntry {
    public static void main(String[] args) {
//        Display display = new ScreenDisplay();
        Display display = new BufferDisplay(5);
        
        display.print("안녕");
        display.print("하세요");
        display.print("디자인패턴");
        display.print("공부중");
        display.print("입니다");
        display.print("ㅋㅋㅋㅋ");

        ((BufferDisplay)display).flush();
    }
}
