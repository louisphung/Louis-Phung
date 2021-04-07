package sample;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class Controller {
    public Label labelDisplay;
    private ArrayList

    public void AddZero(ActionEvent actionEvent) {
        addNumber("0");
    }

    public void AddNigh(ActionEvent actionEvent) {
        addNumber("9");
    }

    public void AddEight(ActionEvent actionEvent) {
        addNumber("8");
    }

    public void AddSeven(ActionEvent actionEvent) {
        addNumber("7");
    }

    public void AddSix(ActionEvent actionEvent) {
        addNumber("6");
    }

    public void AddFive(ActionEvent actionEvent) {
        addNumber("5");
    }

    public void AddFour(ActionEvent actionEvent) {
        addNumber("4");
    }

    public void AddThree(ActionEvent actionEvent) {
        addNumber("3");
    }

    public void AddTwo(ActionEvent actionEvent) {
        addNumber("2");
    }

    public void AddOne(ActionEvent actionEvent) {
        addNumber("1");
    }

    public void addNumber(String number){
        if(labelDisplay.getText().equals("0")){
            String display = number;
            labelDisplay.setText(display);
        }
        else{
            String display = labelDisplay.getText() + number;
            labelDisplay.setText(display);
        }
    }

    public void Addition(ActionEvent actionEvent) {
        numbers.add(labelDisplay.getText());
        labelDisplay.setText("0");
        operators.add(Addition);
    }

    public void Subtraction(ActionEvent actionEvent) {
    }

    public void Division(ActionEvent actionEvent) {
    }

    public void Multiplication(ActionEvent actionEvent) {
    }
}
