import javafx.application.Application;
import javafx.stage.Stage;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.paint.Color;


public class MainGUI extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void init() {
        FoodItem test = new FoodItem("name", 5.00, "type", "storeName", "restriction");
        System.out.println(test);
    }

    public void start(Stage primaryStage) throws Exception {

        Stage window = new Stage();
        window.setTitle("Big Chungus");

        // Set Font
        Font f1 = new Font("Arial", 14);
        String fontStyle = "-fx-font: 14 arial";

        // Sizes
        int labelWidth = 100;
        int textBoxWidth = 154;

        // Store Search Field
        TextField storeField = new TextField();
        storeField.setPrefWidth(textBoxWidth);

        Label storeLabel = new Label("Store Name: ");
        storeLabel.setAlignment(Pos.CENTER_RIGHT);
        storeLabel.setMinWidth(labelWidth);
        storeLabel.setFont(f1);
        storeLabel.setTextFill(Color.web("#ffffff"));

        HBox storeBox = new HBox();
        storeBox.getChildren().addAll(storeLabel, storeField);
        storeBox.setAlignment(Pos.CENTER);

        // Price Search Fields
        TextField priceFieldLow = new TextField();
        priceFieldLow.setPrefWidth(textBoxWidth / 2);
        TextField priceFieldHigh = new TextField();
        priceFieldHigh.setPrefWidth(textBoxWidth / 2);

        Label priceLabel = new Label("Price Range: ");
        priceLabel.setAlignment(Pos.CENTER_RIGHT);
        priceLabel.setMinWidth(labelWidth);
        priceLabel.setFont(f1);
        priceLabel.setTextFill(Color.web("#ffffff"));

        HBox priceBox = new HBox();
        priceBox.getChildren().addAll(priceLabel, priceFieldLow, priceFieldHigh);
        priceBox.setAlignment(Pos.CENTER);

        // Food Type Search Field
        TextField foodTypeField = new TextField();
        foodTypeField.setPrefWidth(textBoxWidth);

        Label foodTypeLabel = new Label("Food Type: ");
        foodTypeLabel.setAlignment(Pos.CENTER_RIGHT);
        foodTypeLabel.setMinWidth(labelWidth);
        foodTypeLabel.setFont(f1);
        foodTypeLabel.setTextFill(Color.web("#ffffff"));

        HBox foodTypeBox = new HBox();
        foodTypeBox.getChildren().addAll(foodTypeLabel, foodTypeField);
        foodTypeBox.setAlignment(Pos.CENTER);

        // Name Search Field
        TextField foodNameField = new TextField();
        foodNameField.setPrefWidth(textBoxWidth);

        Label foodNameLabel = new Label("Food Name: ");
        foodNameLabel.setAlignment(Pos.CENTER_RIGHT);
        foodNameLabel.setMinWidth(labelWidth);
        foodNameLabel.setFont(f1);
        foodNameLabel.setTextFill(Color.web("#ffffff"));

        HBox foodNameBox = new HBox();
        foodNameBox.getChildren().addAll(foodNameLabel, foodNameField);
        foodNameBox.setAlignment(Pos.CENTER);

        // Create group of all Search Bars
        VBox searchBars = new VBox();
        searchBars.getChildren().addAll(foodNameBox, storeBox, priceBox, foodTypeBox);
        searchBars.setAlignment(Pos.CENTER);

        Button searchButton = new Button("Search");
        searchButton.setMinWidth(labelWidth + textBoxWidth);
        searchButton.setMinHeight(50);
        searchButton.setStyle(fontStyle);
        searchButton.setOnAction(event -> {
            System.out.println("test");
        });


        // Grouping
        GridPane mainMenuGroup = new GridPane();
        mainMenuGroup.add(searchBars, 0, 0);
        mainMenuGroup.add(searchButton, 0, 1);
        mainMenuGroup.setAlignment(Pos.CENTER); 

        // mainMenuGroup.setTop();
        // root.setBottom(bottom);

        Scene mainMenu = new Scene(mainMenuGroup, 640, 940);
        mainMenu.getStylesheets().addAll(this.getClass().getResource("mainmenu.css").toExternalForm());

        // Add grouping to scene and add it to the stage.
        primaryStage.setScene(mainMenu);
        primaryStage.setTitle("Test");
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}