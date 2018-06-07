package imperative;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextEditor extends Application {

    public static void main(String[] args) throws Exception {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        root.setPadding(new Insets(10));
        root.setSpacing(5);

        root.getChildren().add(new Label("Enter message:"));

        TextArea textArea1 = new TextArea();
        root.getChildren().add(textArea1);

        TextArea textArea2 = new TextArea();
        root.getChildren().add(textArea2);

        Button button1 = new Button("Button 1");
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textArea1.copy();
                textArea2.paste();
            }
        });

        Button button2 = new Button("Button 2");
        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textArea2.copy();
                textArea1.paste();
            }
        });

        final ButtonBar buttonBar = new ButtonBar();
        buttonBar.getButtons().addAll(button1, button2);
        root.getChildren().add(buttonBar);
        Scene scene = new Scene(root,450, 300);

        primaryStage.setTitle("JavaFX Text Editor");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
