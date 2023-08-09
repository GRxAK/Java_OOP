package homework07.model;

public class DivisionOperation implements CalculatorOperation {
    @Override
    public double calculate(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("На ноль делить нельзя!");
        }
    }

    @Override
    public String toString() {
        return "Деление";
    }
}
