package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import sun.security.x509.FreshestCRLExtension;

public class Controller {
    public TextField textName;
    public TextField textGrade;
    public TextField textID;
    public ListView<Friend> listFriend = new ListView<>();
    public Label labelName;
    public Label labelGrade;
    public Label labelID;

    public void createFriend(ActionEvent actionEvent) {
        String name = textName.getText();
        int ID = Integer.parseInt(textID.getText());
        String grade = textGrade.getText();
        Friend friend = new Friend(name,grade,ID);
        listFriend.getItems().add(friend);
        textName.clear();
        textGrade.clear();
        textID.clear();
    }

    public void displayFriend(MouseEvent mouseEvent) {
        Friend friend = listFriend.getSelectionModel().getSelectedItem();
        if (friend == null){
            return;
        }
        labelName.setText("Name: " + friend.getName());
        String grade = friend.getGrade();
        labelGrade.setText("Grade: "+ grade);
        String ID = Integer.toString(friend.getID());
        labelID.setText("ID: " + ID);
    }


    public void deleteFriend(ActionEvent actionEvent) {
        Friend friend = listFriend.getSelectionModel().getSelectedItem();
        if (friend == null){
            return;
        }
        listFriend.getItems().remove(friend);
    }
}
