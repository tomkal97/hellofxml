package hellofx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class lineexample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
    Line line = new Line();
    line.setStartX(0);
    line.setStartY(0); 
    line.setEndX(100); 
    line.setEndY(200); 
    Group root = new Group();
    root.getChildren().add(line); 
    Scene scene = new Scene(root,300,300);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Line Example");
    primaryStage.show(); 
}
}