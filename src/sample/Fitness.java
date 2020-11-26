package sample;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Fitness  {
    public int caloriesBurnt = 0;
    public double heartRate = 80;
    public double totalHeartRate;
    public int totalCaloriesBurnt;
    Scene scene;
//    FitnessCalculations fitnessCalculations;
//    @Override
    public void prepareScene() {

        Label AddActivity = new Label("Add Activity   ");
        Label type = new Label("Type ");
        Label time = new Label("Time taken to practice (min) ");
        TextField timetextfield = new TextField();
        Button add = new Button("Add");
        ComboBox comboBox = new ComboBox<>();
        comboBox.getItems().addAll(
                "Swimming",
                "Running",
                "Kick_Boxing",
                "Strength_Training"
        );
        GridPane grid = new GridPane();
        grid.add(AddActivity, 0, 0);
        grid.add(comboBox, 1, 0);
        grid.add(time, 0, 2);
        grid.add(timetextfield, 1, 2);
        grid.add(add, 1, 3);
//        String sport = String.valueOf(comboBox.getItems());
        if (comboBox.getValue().equals("Swimming"))
            System.out.println("fares");

        else
            System.out.println("wrong sport");

//        Integer times = Integer.valueOf(timetextfield.getText());

        scene = new Scene(grid, 600, 400);

    }

public Scene getScene(){
        return this.scene;
}

//    public void setFitnessCalculations(FitnessCalculations fitnessCalculations) {
//        this.fitnessCalculations = fitnessCalculations;
//    }
}

