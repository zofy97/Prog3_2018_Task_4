package declarative;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class TextEditorGUI extends Application {
    public TextArea textArea1;
    public TextArea textArea2;

    public void buttonClick1(ActionEvent actionEvent) {
        textArea1.copy();
        textArea2.paste();
    }


    public void buttonClick2(ActionEvent actionEvent) {
        textArea2.copy();
        textArea1.paste();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("TextEditorGUI.fxml"));

        Scene scene = new Scene(root, 300, 275);

        primaryStage.setTitle("FXML Welcome");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
