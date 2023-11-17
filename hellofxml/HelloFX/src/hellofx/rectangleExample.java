package hellofx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class rectangleExample extends Application {
    
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
        rect.setWidth(100);
        rect.setHeight(150);
        int red=20;
        int green=125;
        int blue=10;
        rect.setFill(Color.rgb(red, green, blue,0.63));
        root.getChildren().add(rect);
        Scene scene = new Scene(root,200,200);
        primaryStage.setScene(scene);
        primaryStage.show(); 

}
}
