package typesofpatterns.behavioural.strategy;

public class StrategyB implements Strategy {
    @Override
    public void execute() {
        System.out.println("Executing strategy B");
    }
}
