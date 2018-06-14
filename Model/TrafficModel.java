package Model;
import Controller.TrafficController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TrafficModel extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        TrafficController controller = new TrafficController();

        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("View/TrafficLight.fxml"));
        Scene scene = new Scene(root, 600, 400);

        primaryStage.setMaxWidth(800);
        primaryStage.setMaxHeight(500);
        primaryStage.setMinWidth(600);
        primaryStage.setMinHeight(450);
        primaryStage.setTitle("Traffic Lights");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args)  {
        launch(args);
    }
}
