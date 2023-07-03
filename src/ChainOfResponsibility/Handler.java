package ChainOfResponsibility;

public abstract class Handler {
    protected Handler handler = null;

    public Handler setHandler(Handler handler) {
        this.handler = handler;
        return handler;
    }

    protected abstract void process(String url);

    public void run(String url){
        process(url);
        if(handler != null) handler.run(url);
    }
}
