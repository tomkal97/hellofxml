package hellofx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class polygon extends Application{

    @Override
    public void start(Stage primaryStage) {
        Polygon polygon = new Polygon();
    polygon.getPoints().addAll(new Double[]{
        300.0, 50.0,
        450.0, 150.0,
        300.0, 250.0,
        150.0, 150.0,
});
    Group root = new Group(polygon);
    Scene scene = new Scene(root, 600, 300);
    stage.setTitle("Drawing a Polygon");
    stage.setScene(scene);
    stage.show(); 
    }
    
}
