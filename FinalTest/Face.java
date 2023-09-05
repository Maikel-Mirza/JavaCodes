import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class Face extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Create a StackPane as the root node
        StackPane root = new StackPane();

        // Create a smiling face using JavaFX shapes
        Circle faceCircle = new Circle(100, Color.YELLOW);
        faceCircle.setRadius(80);

        Circle leftEye = new Circle(30, Color.WHITE);
        Circle rightEye = new Circle(30, Color.WHITE);

        leftEye.setTranslateX(-25);
        leftEye.setTranslateY(-25);
        rightEye.setTranslateX(25);
        rightEye.setTranslateY(-25);

        Circle leftPupil = new Circle(15, Color.BLACK);
        Circle rightPupil = new Circle(15, Color.BLACK);

        leftPupil.setTranslateX(-25);
        leftPupil.setTranslateY(-25);
        rightPupil.setTranslateX(25);
        rightPupil.setTranslateY(-25);

        Polygon nose = new Polygon();
        nose.getPoints().addAll(
                0.0, 0.0,
                -10.0, 40.0,
                10.0, 40.0);
        nose.setFill(Color.ORANGE);

        // Create a smiling mouth (an arc)
        javafx.scene.shape.Arc mouth = new javafx.scene.shape.Arc(
                0, 25, 40, 30, 0, 180);
        mouth.setType(javafx.scene.shape.ArcType.OPEN);
        mouth.setFill(null);
        mouth.setStroke(Color.BLACK);
        mouth.setStrokeWidth(3);

        // Add all shapes to the root node
        root.getChildren().addAll(faceCircle, leftEye, rightEye, leftPupil, rightPupil, nose, mouth);

        // Create a scene and set it on the stage
        Scene scene = new Scene(root, 200, 200);
        primaryStage.setTitle("Smiling Face");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
