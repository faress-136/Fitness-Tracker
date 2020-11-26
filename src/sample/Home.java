package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Home  extends Application {
    public static void main(String[] args) {
        launch(args);
    }



    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        Stage primaryStage = new Stage();
        primaryStage.setTitle("FITNESS TRACKER");
        primaryStage.setScene(new Scene(root, 300, 275));

        Fitness fitness = new Fitness();
//        FitnessCalculations fitnessCalculations = new FitnessCalculations();
        fitness.prepareScene();
        primaryStage.setScene(fitness.getScene());

        primaryStage.show();

    }

}
