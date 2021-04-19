package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import sun.security.x509.FreshestCRLExtension;

public class Controller {
    public TextField textName;
    public TextField textGrade;
    public TextField textID;
    public ListView<Friend> listView = new ListView<>();
    public Label labelName;
    public Label labelGrade;
    public Label labelID;

    public void createFriend(ActionEvent actionEvent) {
        String name = textName.getText();
        int ID = Integer.parseInt(textID.getText());
        String grade = textGrade.getText();
        Friend friend = new Friend(name,grade,ID);
        //10:45

    }
}
