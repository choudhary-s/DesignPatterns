package typesofpatterns.structural.decorator;

public class DecoratorA extends Decorator {
    public DecoratorA(Component c) {
        super(c);
    }
    @Override
    public void operation(){
        super.operation();
        System.out.println("Operation performed by Decorator A");
    }
}
