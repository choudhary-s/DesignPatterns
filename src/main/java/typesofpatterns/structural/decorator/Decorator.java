package typesofpatterns.structural.decorator;

public abstract class Decorator implements Component {
    protected Component c;
    public Decorator(Component c){
        this.c = c;
    }
    @Override
    public void operation(){
        c.operation();
    }
}
