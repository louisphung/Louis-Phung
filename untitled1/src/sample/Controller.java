package sample;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class Controller {
    public Label labelDisplay;
    public Button equalGetName;
    public Button zeroGetName;
    public Button nighGetName;
    public Button eightGetName;
    public Button sevenGetName;
    public Button sixGetName;
    public Button fiveGetName;
    public Button fourGetName;
    public Button threeGetName;
    public Button twoGetName;
    public Button oneGetName;
    public Button AdditionGetName;
    public Button SubtractionGetName;
    public Button DivisionGetName;
    public Button MultiplicationGetName;
    public Button ClearGetName;

    String operators;
    int sNumber;
    int fNumber;
    int result;


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
        fNumber = Integer.parseInt(labelDisplay.getText());
        labelDisplay.setText("0");
        operators = "+";
    }

    public void Subtraction(ActionEvent actionEvent) {
        fNumber = Integer.parseInt(labelDisplay.getText());
        labelDisplay.setText("0");
        operators = "-";
    }

    public void Division(ActionEvent actionEvent) {
        fNumber = Integer.parseInt(labelDisplay.getText());
        labelDisplay.setText("0");
        operators = "/";
    }
    public void Multiplication(ActionEvent actionEvent) {
        fNumber = Integer.parseInt(labelDisplay.getText());
        labelDisplay.setText("0");
        operators = "*";
    }
    public void Clear(ActionEvent actionEvent) {
        labelDisplay.setText("0");
        this.sNumber = 0;
        this.fNumber = 0;
    }
    public void Equal(ActionEvent actionEvent) {
        String answer;
        sNumber = Integer.parseInt(labelDisplay.getText());
        if (operators == "+") {
            result = fNumber + sNumber;
            answer = Integer.toString(result);
            labelDisplay.setText(answer);
        } else if (operators == "-") {
            result = fNumber - sNumber;
            answer = Integer.toString(result);
            labelDisplay.setText(answer);
        } else if (operators == "*") {
            result = fNumber * sNumber;
            answer = Integer.toString(result);
            labelDisplay.setText(answer);
        } else if (operators == "/") {
            result = fNumber / sNumber;
            answer = Integer.toString(result);
            labelDisplay.setText(answer);
        }

    }


}
