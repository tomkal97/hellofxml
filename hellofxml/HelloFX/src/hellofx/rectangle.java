package hellofx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.effect.DropShadow;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class rectangle extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

    Group root = new Group();
    primaryStage.setTitle("Color Example");
    Rectangle rect = new Rectangle();
    rect.setX(50);
    rect.setY(20);
    rect.setWidth(200);
    rect.setHeight(250);
    rect.setEffect(new DropShadow());
    root.getChildren().add(rect);
    }
}
