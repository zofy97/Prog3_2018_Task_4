package Test;

import Controller.TrafficController;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import org.junit.Before;
import org.junit.BeforeClass;

import javax.swing.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class TrafficControllerTest {

    TrafficController c = new TrafficController();

    @BeforeClass
    public static void initToolkit() throws InterruptedException
    {
        final CountDownLatch latch = new CountDownLatch(1);
        SwingUtilities.invokeLater(() -> {
            new JFXPanel(); // initializes JavaFX environment
            latch.countDown();
        });

        if (!latch.await(5L, TimeUnit.SECONDS))
            throw new ExceptionInInitializerError();
    }

    @Before
    public void setup() {
        c.red1 = new Circle();
        c.red2 = new Circle();
        c.yellow1 = new Circle();
        c.yellow2 = new Circle();
        c.green1 = new Circle();
        c.green2 = new Circle();
        c.textTrafficLight1 = new TextField();
        c.textTrafficLight2 = new TextField();
        c.trafficLight1 = new RadioButton();
        c.trafficLight2 = new RadioButton();
    }

    @org.junit.Test
    public void changeRed() {
        ActionEvent actionEvent = new ActionEvent();
        c.trafficLight1.setSelected(true);
        c.changeRed(actionEvent);
        assertTrue(c.red1.getOpacity() == 1);
    }

    @org.junit.Test
    public void changeYellow() {
        ActionEvent actionEvent = new ActionEvent();
        c.trafficLight1.setSelected(true);
        c.changeYellow(actionEvent);
        assertTrue(c.yellow1.getOpacity() == 1);
    }

    @org.junit.Test
    public void changeGreen() {
        ActionEvent actionEvent = new ActionEvent();
        c.trafficLight2.setSelected(true);
        c.changeGreen(actionEvent);
        assertTrue(c.green2.getOpacity() == 1);
    }

    @org.junit.Test
    public void reset() {
        ActionEvent actionEvent = new ActionEvent();
        c.reset(actionEvent);
        assertTrue(c.red1.getOpacity() == 0.5 && c.yellow1.getOpacity() == 0.5 && c.textTrafficLight1.getText() == null);
    }
}
