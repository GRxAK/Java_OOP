package homework07.model;

public class SubtractionOperation implements CalculatorOperation {
    @Override
    public double calculate(double a, double b) {
        return a - b;
    }

    @Override
    public String toString() {
        return "Вычитание";
    }
}
