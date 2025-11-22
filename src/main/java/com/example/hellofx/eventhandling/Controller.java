package main.java.com.example.hellofx.eventhandling;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

// controller - controls all events, all events are placed here.
// Controller class not showing in SceneBuilder controller class dropdown? Restart SceneBuilder.
public class Controller {
    @FXML
    private Circle myCircle;  // from SceneBuilder, select Circle object, go to Code > fx:id, enter myCircle for that field
    private double x;
    private double y;

    public void up(ActionEvent e) {
        //System.out.println("UP");
        myCircle.setCenterY(y -= 10);
    }

    public void left(ActionEvent e) {
        //System.out.println("LEFT");
        myCircle.setCenterX(x -= 10);
    }

    public void right(ActionEvent e) {
        //System.out.println("RIGHT");
        myCircle.setCenterX(x += 10);
    }

    public void down(ActionEvent e) {
        //System.out.println("DOWN");
        myCircle.setCenterY(y += 10);
    }
}
