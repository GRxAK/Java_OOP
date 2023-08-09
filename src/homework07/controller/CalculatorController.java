package homework07.controller;

import homework07.model.*;
import homework07.view.*;

import java.io.FileWriter;
import java.io.IOException;
import java.text.Format;
import java.util.Formatter;

public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;
    private FileWriter logFileWriter;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
        try {
            logFileWriter = new FileWriter("calculator_log.txt", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setOperation(CalculatorOperation operation) {
        model.setOperation(operation);
        view.displayMessage("Будет выполенино: " + operation);
    }

    public void performOperation(double a, double b, CalculatorOperation operation) {
        double result = model.performOperation(a, b);
        view.displayResult(result);
        logOperation(a, b, operation, result);
    }

    private void logOperation(double a, double b, CalculatorOperation operation, double result) {
        Formatter f = new Formatter();
        String o = operation.toString();
        f.format("Вычисление: %f %s %f = %f\n", a, o, b, result);
        String logEntry = String.valueOf(f);
        try {
            logFileWriter.write(logEntry);
            logFileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void closeLogFile() {
        try {
            logFileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
