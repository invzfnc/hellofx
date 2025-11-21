package main.java.com.example.hellofx.stages;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {  // inherit everything from Application class
    public static void main(String[] args) {
        launch(args);  // static method that belongs to the Application class
        // or write Application.launch(args); explicitly
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();  // create a root node
        Scene scene = new Scene(root, Color.BLACK);  // create a new scene. add root node to scene. to set color, use Color class
        Image icon = new Image("icon.png");  // create an Image object

        stage.setTitle("Damn I hate JavaFX (Java as well)");  // set window title
        stage.getIcons().add(icon);  // set app icon

        stage.setFullScreen(true);
        stage.setFullScreenExitHint("you can't escape unless you press q");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        stage.setScene(scene);  // add scene to stage
        stage.show();  // make the window appear
    }
}

/*
* 1. Inherit/extend Application class
* 2. Provide implementation for start method (mandatory)
* 3. Application.launch with args in main
* 4. stage.show() in start. No need to build a scene because we have one already
* 5. Important: Call main from separate class
* 6. Create a scene. A scene needs at least a root node
* 7. Add root to scene, add scene to stage
*
* To set color to the scene, import and use Color class
* To set title for the window, do stage.setTitle("Title");
* To set icon for the application,
*   1. Put icon image in src/ folder. FX will look for images in src/. (Swing will look in project folder)
*   2. Create image object. Image icon = new Image("icon.png");
* To set width of the stage, do stage.setWidth(width: int);
* To set height of the stage, do stage.setHeight(width: int);
* To make the dimensions immutable, do stage.setResizable(false);
* To set stage position, use stage.setX and stage.setY, (0, 0) at top left
* To make the stage full screen, use stage.setFullScreen(true);
* */