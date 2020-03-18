package application;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//Root Node - Layout der Szene
			HBox root = new HBox();
			
			// Design der Szene anpassen
			// Gr��e
			root.setPrefSize(340.0,  70.0);
			//Abstand
			root.setSpacing(10.0);
			//Ausrichtung
			root.setAlignment(Pos.CENTER); 
			
			
			// Elemente erstellen wie Buttons etc.
			Button button1 = new Button();
			Button button2 = new Button();
			Button button3 = new Button();
			Button button4 = new Button();
			Button button5 = new Button();
			
			// Gr��e der Buttons definieren
			button1.setPrefSize(64.0, 64.0);
			button2.setPrefSize(64.0, 64.0);
			button3.setPrefSize(64.0, 64.0);
			button4.setPrefSize(64.0, 64.0);
			button5.setPrefSize(64.0, 64.0);
			
			
			// Elemente zum rode Node hinzuf�gen
			root.getChildren().add(button1);
			root.getChildren().add(button2);
			root.getChildren().add(button3);
			root.getChildren().add(button4);
			root.getChildren().add(button5);
			
			// Szene erstellen
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
