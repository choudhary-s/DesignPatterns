package typesofpatterns.structural.decorator;

public class ComponentA implements Component {

    @Override
    public void operation() {
        System.out.println("Performing operation from Component A");
    }
}