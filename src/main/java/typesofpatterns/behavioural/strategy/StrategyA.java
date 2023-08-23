package typesofpatterns.behavioural.strategy;

public class StrategyA implements Strategy {
    @Override
    public void execute() {
        System.out.println("Executing strategy A");
    }
}
