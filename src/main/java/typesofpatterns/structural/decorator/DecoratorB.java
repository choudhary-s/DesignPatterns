package typesofpatterns.structural.decorator;

public class DecoratorB extends Decorator {

    public DecoratorB(Component c) {
        super(c);
    }
    @Override
    public void operation(){
        super.operation();
        System.out.println("Operation performed by Decorator B");
    }
}
