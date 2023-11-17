package hellofx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class drawCircle extends Application {
    final double WIDTH = 500.0;
    final double HEIGHT = 500.0;
    final double RADIUS = Math.min(WIDTH, HEIGHT) / 10;
    Pane pane = new Pane();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        pane.setOnMouseClicked(e -> handleMouseClicked(e));

        Scene scene = new Scene(pane, WIDTH, HEIGHT);
        primaryStage.setTitle("java2s.com");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


        private void handleMouseClicked(MouseEvent e) {
    switch (e.getButton()) {
        case PRIMARY:
            Circle circle = new Circle(e.getX(), e.getY(), RADIUS);
            circle.setFill(Color.WHITE);
            circle.setStroke(Color.BLACK);
            circle.setOnMouseClicked(f -> {
                pane.getChildren().remove(f.getSource());
        });
        pane.getChildren().add(circle);
        break;
    case BACK:
        break;
        case FORWARD:
            break;
        case MIDDLE:
            break;
        case NONE:
            break;
        case SECONDARY:
            break;
        default:
            break;
}
    primaryStage.setTitle("java2s.com");
}
}

