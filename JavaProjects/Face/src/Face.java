import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Face extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Create a Circle for the face
        Circle face = new Circle(100, 100, 60);
        face.setFill(Color.YELLOW);
        face.setStroke(Color.BLACK);

        // Create Circles for the eyes
        Circle leftEye = new Circle(80, 80, 10);
        Circle rightEye = new Circle(120, 80, 10);
        leftEye.setFill(Color.WHITE);
        rightEye.setFill(Color.WHITE);

        // Create an Arc for the mouth (smile)
        Arc mouth = new Arc(100, 120, 30, 20, 0, 180);
        mouth.setType(ArcType.OPEN);
        mouth.setFill(null);
        mouth.setStroke(Color.BLACK);

        // Create a Pane and add shapes to it
        Pane pane = new Pane();
        pane.getChildren().addAll(face, leftEye, rightEye, mouth);

        // Create a Scene
        Scene scene = new Scene(pane, 200, 200);

        // Set the Scene and show the Stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Smiley Face");
        primaryStage.show();
    }
}
