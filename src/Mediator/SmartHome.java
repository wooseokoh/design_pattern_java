package Mediator;

public class SmartHome implements Mediator{
    public Door door = new Door(this);
    public Window window = new Window(this);
    public CoolAircon coolAircon = new CoolAircon(this);
    public HeatBoiler heatBoiler = new HeatBoiler(this);

    @Override
    public void participantChanged(Participant participant) {
        if (participant == door && !door.isClosed()) {
            coolAircon.off();
            heatBoiler.off();
        }

        if (participant == window && !window.isClosed()) {
            coolAircon.off();
            heatBoiler.off();
        }

        if (participant == coolAircon && coolAircon.isRunning()) {
            heatBoiler.off();
            window.close();
            door.close();
        }

        if (participant == heatBoiler && heatBoiler.isRunning()) {
            coolAircon.off();
            window.close();
            door.close();
        }
    }

    public void report(){
        System.out.println("집안 상태");
        System.out.println(door);
        System.out.println(window);
        System.out.println(coolAircon);
        System.out.println(heatBoiler);
        System.out.println();
    }
}
