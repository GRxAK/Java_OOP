package homework07;

import homework07.controller.*;
import homework07.model.*;
import homework07.view.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(model, view);

        while (true) {
            view.displayMessage("Выберите действие:");
            view.displayMessage("   1. Сложение");
            view.displayMessage("   2. Вычитание");
            view.displayMessage("   3. Умножение");
            view.displayMessage("   4. Деление");
            view.displayMessage("   5. Выйти из программы");

            int choice = scanner.nextInt();
            if (choice == 5) {
                controller.closeLogFile();
                break;
            }

            CalculatorOperation operation;
            switch (choice) {
                case 1:
                    operation = new AdditionOperation();
                    break;
                case 2:
                    operation = new SubtractionOperation();
                    break;
                case 3:
                    operation = new MultiplicationOperation();
                    break;
                case 4:
                    operation = new DivisionOperation();
                    break;
                default:
                    view.displayMessage("Такого действия нет!");
                    continue;
            }

            controller.setOperation(operation);

            view.displayMessage("Введите первое число:");
            double a = scanner.nextDouble();
            view.displayMessage("Введите второе число:");
            double b = scanner.nextDouble();

            controller.performOperation(a, b, operation);
        }

        scanner.close();
    }
}
