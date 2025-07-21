//Juedeja Richard_Module11_7-20-25
//Showing an example for a Borderpane layout

import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;


public class BorderLayout extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage){
        BorderPane borderPane = new BorderPane();
//creating labels for each part of the borderpane
        Label label1 = new Label("Top Region");
        borderPane.setTop(label1);

        Label label2 = new Label("Bottom Region");
        borderPane.setBottom(label2);

        Label label3 = new Label("Left Region");
        borderPane.setLeft(label3);

        Label label4 = new Label("Right Region");
        borderPane.setRight(label4);

        Label label5 = new Label("Center Region");
        borderPane.setCenter(label5);


// Creates a Scene, Sets scene and Stage
        Scene scene = new Scene(borderPane, 300, 200);
        stage.setScene(scene);
// Sets the title of the Stage
        stage.setTitle("This is what Borderpane looks like");
// Displays the Stage (the GUI)
        stage.show();
        }
}
