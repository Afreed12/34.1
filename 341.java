import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class StaffManagement extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        Label idLabel = new Label("ID:");
        GridPane.setConstraints(idLabel, 0, 0);
        TextField idInput = new TextField();
        GridPane.setConstraints(idInput, 1, 0);

        Label lastNameLabel = new Label("Last Name:");
        GridPane.setConstraints(lastNameLabel, 0, 1);
        TextField lastNameInput = new TextField();
        GridPane.setConstraints(lastNameInput, 1, 1);

        Label firstNameLabel = new Label("First Name:");
        GridPane.setConstraints(firstNameLabel, 0, 2);
        TextField firstNameInput = new TextField();
        GridPane.setConstraints(firstNameInput, 1, 2);

        Label miLabel = new Label("MI:");
        GridPane.setConstraints(miLabel, 0, 3);
        TextField miInput = new TextField();
        GridPane.setConstraints(miInput, 1, 3);

        Label addressLabel = new Label("Address:");
        GridPane.setConstraints(addressLabel, 0, 4);
        TextField addressInput = new TextField();
        GridPane.setConstraints(addressInput, 1, 4);

        Button viewButton = new Button("View");
        GridPane.setConstraints(viewButton, 0, 5);
        viewButton.setOnAction(e -> {
            String id = idInput.getText();
            viewStaff(id);
        });

        Button insertButton = new Button("Insert");
        GridPane.setConstraints(insertButton, 1, 5);
        insertButton.setOnAction(e -> {
            String id = idInput.getText();
            String lastName = lastNameInput.getText();
            String firstName = firstNameInput.getText();
            String mi = miInput.getText();
            String address = addressInput.getText();
            insertStaff(id, lastName, firstName, mi, address);
        });

        grid.getChildren().addAll(idLabel, idInput, lastNameLabel, lastNameInput, firstNameLabel, firstNameInput,
                miLabel, miInput, addressLabel, addressInput, viewButton, insertButton);

        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Staff Management");
        primaryStage.show();
    }

    private void viewStaff(String id) {
    }

    private void insertStaff(String id, String lastName, String firstName, String mi, String address) {
    }

    public static void main(String[] args) {
        launch(args);
    }
}

