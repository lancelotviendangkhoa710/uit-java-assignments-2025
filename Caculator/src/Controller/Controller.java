package Controller;

import Model.Model;
import View.View;
    
public class Controller {

    private Model model;
    private View view;

    // constructor
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

        initController();
    }

    private void initController() {

       
        view.addNumberListener(e -> handleNumber(e.getActionCommand()));

        // operator buttons
        view.addOperatorListener(e -> handleOperator(e.getActionCommand()));

        // equal button
        view.addEqualListener(e -> handleEqual());

        // clear button
        view.addClearListener(e -> handleClear());
    }

    private void handleNumber(String number) {

        String current = view.getDisplayText();
        current = current + number;

        view.setDisplayText(current);
    }

    private void handleOperator(String op) {

        String current = view.getDisplayText();

        if(current.isEmpty()) return;

        double firstNumber = Double.parseDouble(current);

        model.setFirstNumber(firstNumber);
        model.setOperator(op);

        view.setDisplayText("");
    }

    // xử lý khi bấm =
    private void handleEqual() {

        String current = view.getDisplayText();

        if(current.isEmpty()) return;

        double secondNumber = Double.parseDouble(current);

        model.setSecondNumber(secondNumber);

        double result = model.calculate();

        view.setDisplayText(String.valueOf(result));
    }

    // xử lý clear
    private void handleClear() {

        model.clear();

        view.setDisplayText("");
    }
}