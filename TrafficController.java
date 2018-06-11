import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class TrafficController extends Application {

    public Circle red1;

    public Circle red2;

    public Circle yellow1;

    public Circle yellow2;

    public Circle green1;

    public Circle green2;

    public RadioButton trafficLight1;

    public RadioButton trafficLight2;

    public TextField textTrafficLight1;

    public TextField textTrafficLight2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("TrafficLight.fxml"));

        Scene scene = new Scene(root, 600, 400);

        primaryStage.setMinWidth(600);
        primaryStage.setMinHeight(400);
        primaryStage.setTitle("Traffic Lights");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void changeRed(ActionEvent actionEvent) {
        if(trafficLight1.isSelected()) {
            red1.setOpacity(1);
            yellow1.setOpacity(0.5);
            green1.setOpacity(0.5);
            textTrafficLight1.setText("Red");
        } else if(trafficLight2.isSelected())   {
            red2.setOpacity(1);
            yellow2.setOpacity(0.5);
            green2.setOpacity(0.5);
            textTrafficLight2.setText("Red");
        }
    }

    public void changeYellow(ActionEvent actionEvent) {
        if(trafficLight1.isSelected()) {
            red1.setOpacity(0.5);
            yellow1.setOpacity(1);
            green1.setOpacity(0.5);
            textTrafficLight1.setText("Yellow");
        } else if(trafficLight2.isSelected())   {
            red2.setOpacity(0.5);
            yellow2.setOpacity(1);
            green2.setOpacity(0.5);
            textTrafficLight2.setText("Yellow");
        }
    }

    public void changeGreen(ActionEvent actionEvent) {
        if(trafficLight1.isSelected()) {
            red1.setOpacity(0.5);
            yellow1.setOpacity(0.5);
            green1.setOpacity(1);
            textTrafficLight1.setText("Green");
        } else if(trafficLight2.isSelected())   {
            red2.setOpacity(0.5);
            yellow2.setOpacity(0.5);
            green2.setOpacity(1);
            textTrafficLight2.setText("Green");
        }
    }
}
