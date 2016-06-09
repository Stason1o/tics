/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import static java.awt.SystemColor.menu;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Stas
 */
public class JavaFXApplication2 extends Application {
    int counter;
    Button button1 = new Button();
    Button button2 = new Button();
    Button button3 = new Button();
    Button button4 = new Button();
    Button button5 = new Button();
    Button button6 = new Button();
    Button button7 = new Button();
    Button button8 = new Button();
    Button button9 = new Button();
    
    
    @Override
    public void start(Stage primaryStage) {
        
        
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        
        counter = 0;
        
        actionButtons();
        
        StackPane root = new StackPane();
        
        
        MenuBar menuBar = new MenuBar();
        Menu menu = new Menu("Choose type");
        MenuItem onePlayer = new MenuItem("Play vs Computer");
        MenuItem twoPlayers = new MenuItem("Play vs Player");
        
        menu.getItems().addAll(onePlayer,twoPlayers);
        menuBar.getMenus().add(menu);
        root.getChildren().addAll(button1,button2,button3,button4,button5,button6,button7,button8,button9);
        root.getChildren().add(menuBar);
        //setting alignments to all buttons
        root.setAlignment(menuBar,Pos.TOP_CENTER);
        root.setAlignment(button1,Pos.TOP_LEFT);
        root.setAlignment(button2,Pos.TOP_CENTER);
        root.setAlignment(button3,Pos.TOP_RIGHT);
        root.setAlignment(button4,Pos.CENTER_LEFT);
        root.setAlignment(button5,Pos.CENTER);
        root.setAlignment(button6,Pos.CENTER_RIGHT);
        root.setAlignment(button7,Pos.BOTTOM_LEFT);
        root.setAlignment(button8,Pos.BOTTOM_CENTER);
        root.setAlignment(button9,Pos.BOTTOM_RIGHT);
        
        //setting size to all buttons   
        button1.setMinSize(100, 100);
        button2.setMinSize(100, 100);
        button3.setMinSize(100, 100);
        button4.setMinSize(100, 100);
        button5.setMinSize(100, 100);
        button6.setMinSize(100, 100);
        button7.setMinSize(100, 100);
        button8.setMinSize(100, 100);
        button9.setMinSize(100, 100);
        menuBar.setMinSize(300, 20);
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public void actionButtons(){
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(button1.getText().equals(""))
                    if(counter % 2 == 0){
                        button1.setText("X");
                        counter++;
                    }else if(counter % 2 != 0){
                        button1.setText("O");
                        counter++;
                    }
            }
        });
        
        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(button2.getText().equals(""))
                    if(counter % 2 == 0){
                        button2.setText("X");
                        counter++;
                    }else if(counter % 2 != 0){
                        button2.setText("O");
                        counter++;
                    }
            }
        });
        
        button3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(button3.getText().equals(""))
                    if(counter % 2 == 0){
                        button3.setText("X");
                        counter++;
                    }else if(counter % 2 != 0){
                        button3.setText("O");
                        counter++;
                    }
            }
        });
        button4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(button4.getText().equals(""))
                    if(counter % 2 == 0){
                        button4.setText("X");
                        counter++;
                    }else if(counter % 2 != 0){
                        button4.setText("O");
                        counter++;
                    }
            }
        });
        button5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(button5.getText().equals(""))
                    if(counter % 2 == 0){
                        button5.setText("X");
                        counter++;
                    }else if(counter % 2 != 0){
                        button5.setText("O");
                        counter++;
                    }
            }
        });
        button6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(button6.getText().equals(""))
                    if(counter % 2 == 0){
                        button6.setText("X");
                        counter++;
                    }else if(counter % 2 != 0){
                        button6.setText("O");
                        counter++;
                    }
            }
        });
        button7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(button7.getText().equals(""))
                    if(counter % 2 == 0){
                        button7.setText("X");
                        counter++;
                    }else if(counter % 2 != 0){
                        button7.setText("O");
                        counter++;
                    }
            }
        });
        button8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(button8.getText().equals(""))
                    if(counter % 2 == 0){
                        button8.setText("X");
                        counter++;
                    }else if(counter % 2 != 0){
                        button8.setText("O");
                        counter++;
                    }
            }
        });
        
        button9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(button9.getText().equals(""))
                    if(counter % 2 == 0){
                        button9.setText("X");
                        counter++;
                    }else if(counter % 2 != 0){
                        button9.setText("O");
                        counter++;
                    }
            }
        });
    }
}
