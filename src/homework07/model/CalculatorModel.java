package homework07.model;

public class CalculatorModel {
    private CalculatorOperation operation;
    public void setOperation(CalculatorOperation operation) {
        this.operation = operation;
    }

    public double performOperation(double a, double b) {
        if (operation != null) {
            return operation.calculate(a, b);
        }
        return 0;
    }
}
