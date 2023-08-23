package typesofpatterns.behavioural.strategy;

public class Context {
    Strategy s;
    public Context(){
        this.s = null;
    }
    public void setStrategy(Strategy s){
        this.s = s;
    }
    public void execute(){
        s.execute();
    }
}
