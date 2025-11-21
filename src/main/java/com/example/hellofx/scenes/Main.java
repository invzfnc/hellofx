package main.java.com.example.hellofx.scenes;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);  // static method belonging to Application class
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();  // create a root node
        Scene scene = new Scene(root, 600, 600, Color.LIGHTSKYBLUE);
        // create a new scene, add root node. width and height to 600, add bgcolor

        Text text = new Text();  // create a text component
        text.setText("Henwo");
        text.setX(50);
        text.setY(50);  // put at top left corner
        text.setFont(Font.font("Consolas", 35));  // change font
        text.setFill(Color.DARKGREEN);  // set font color

        Line line = new Line();     // add a line
        line.setStartX(200);
        line.setStartY(200);        // starting coordinates
        line.setEndX(500);
        line.setEndY(200);          // ending coordinates
        line.setStrokeWidth(5);     // set width
        line.setStroke(Color.RED);  // set color
        line.setOpacity(0.5);       // set opacity
        line.setRotate(45);         // rotate by 45 degrees

        Rectangle rectangle = new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setFill(Color.BLUE);
        rectangle.setStroke(Color.BLACK);
        rectangle.setStrokeWidth(5);

        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
                200.0, 200.0,
                300.0, 300.0,
                200.0, 300.0
        );
        triangle.setFill(Color.YELLOW);

        Circle circle = new Circle();
        circle.setCenterX(350);
        circle.setCenterY(350);
        circle.setRadius(50);
        circle.setFill(Color.ORANGE);

        Image image = new Image("icon.png");
        ImageView imageView = new ImageView(image);
        imageView.setX(50);
        imageView.setY(350);
        imageView.setFitHeight(200);
        imageView.setFitWidth(200);

        // add nodes/components under root node
        root.getChildren().add(text);  // add text component to root node
        root.getChildren().add(line);
        root.getChildren().add(rectangle);
        root.getChildren().add(triangle);
        root.getChildren().add(circle);
        root.getChildren().add(imageView);

        stage.setScene(scene);  // add scene to stage
        stage.show();  // make the window appear
    }
}
