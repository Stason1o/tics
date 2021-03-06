
package javafxapplication2;

import java.util.Optional;
import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class Logic extends Application {
    ViewController view = new ViewController();
    String[][] matrix = new String[3][3];
    Alert  alert   = new Alert(Alert.AlertType.CONFIRMATION);
    boolean XWin = false;
    boolean OWin = false;
    boolean draw = false;
    
    @Override
    public void start(Stage primaryStage){
        
        do{
            alert.showAndWait();
            view.init();
            fillMatrix();
        }while(XWin == true || OWin == true || draw == true);
    }
    
    public void fillMatrix(){
        if(view.button1.getText().equals("X")){
            matrix[0][0] = "X";
            check();
        }
        else if(view.button1.getText().equals("O")){
            matrix[0][0] = "O";
            check();
        }

        if(view.button2.getText().equals("X")){
            matrix[0][1] = "X";
            check();
        }
        else if(view.button2.getText().equals("O")){
            matrix[0][1] = "O";
            check();
        }
        
        if(view.button3.getText().equals("X")){
            matrix[0][2] = "X";
            check();
        }
        else if(view.button3.getText().equals("O")){
            matrix[0][2] = "O";
            check();
        }
        
        if(view.button4.getText().equals("X")){
            matrix[1][0] = "X";
            check();
        }
        else if(view.button4.getText().equals("O")){
            matrix[1][0] = "O";
            check();;
        }
        
        if(view.button5.getText().equals("X")){
            matrix[1][1] = "X";
            check();
        }
        else if(view.button5.getText().equals("O")){
            matrix[1][1] = "O";
            check();
        }
        if(view.button6.getText().equals("X")){
            matrix[1][2] = "X";
            check();
        }
        else if(view.button6.getText().equals("O")){
            matrix[1][2] = "O";
            check();
        }
        
        if(view.button7.getText().equals("X")){
            matrix[2][0] = "X";
            check();
        }
        else if(view.button7.getText().equals("O")){
            matrix[2][0] = "O";
            check();
        }
        
        if(view.button8.getText().equals("X")){
            matrix[2][1] = "X";
            check();
        }
        else if(view.button8.getText().equals("O")){
            matrix[2][1] = "O";
            check();
        }
        
        if(view.button9.getText().equals("X")){
            matrix[2][2] = "X";
            check();
        }
        else if(view.button9.getText().equals("O")){
            matrix[2][2] = "O";
            check();
        }
    }
    public boolean compare(String el1,String el2){
        return el1.equals(el2);
    }
    public void check(){
        analize();
    }
    public boolean check(String str){// function of checking if either of players has won
        return
            (compare(matrix[0][0],matrix[0][1]) && compare(matrix[0][0],matrix[0][2])) && compare(matrix[0][0],str) ||
            (compare(matrix[1][0],matrix[1][1]) && compare(matrix[1][0],matrix[1][2])) && compare(matrix[1][0],str) ||
            (compare(matrix[2][0],matrix[2][1]) && compare(matrix[2][0],matrix[2][2])) && compare(matrix[2][0],str) ||
                
            (compare(matrix[0][1],matrix[1][1]) && compare(matrix[0][1],matrix[2][1])) && compare(matrix[0][1],str) ||
            (compare(matrix[0][2],matrix[1][2]) && compare(matrix[0][2],matrix[2][2])) && compare(matrix[0][2],str) ||
            (compare(matrix[0][0],matrix[1][0]) && compare(matrix[0][0],matrix[2][0])) && compare(matrix[0][0],str) ||
                
            (compare(matrix[1][1],matrix[0][0]) && compare(matrix[1][1],matrix[2][2])) && compare(matrix[1][1],str) ||
            (compare(matrix[1][1],matrix[2][0]) && compare(matrix[1][1],matrix[0][2])) && compare(matrix[1][1],str) ; 
    }
    public void analize(){
        if(check("X") == true){
            XWins();
            XWin = true;
        }else if(check("O") == true){
            OWins();
            OWin = true;
        }else {
            draw();
            draw = true;
        }
    }
    public void XWins(){
        alert.setContentText("X -winners. Do you  want to play again?");
        Optional<ButtonType> result = alert.showAndWait();
        if(result.get() == ButtonType.OK){
            for (int i = 0; i < 3; ++i)
                for (int j = 0; j < 3; ++j)
                    matrix[i][j] = "";
            view.counter = 0;
            view.button1.setText("");
            view.button2.setText("");
            view.button3.setText("");
            view.button4.setText("");
            view.button5.setText("");
            view.button6.setText("");
            view.button7.setText("");
            view.button8.setText("");
            view.button9.setText("");
        }else
            System.exit(0);
    }
    public void OWins(){
        alert.setContentText("O -winners. Do you  want to play again?");
        Optional<ButtonType> result = alert.showAndWait();
        if(result.get() == ButtonType.OK){
            for (int i = 0; i < 3; ++i)
                for (int j = 0; j < 3; ++j)
                    matrix[i][j] = "";
            view.counter = 0;
            view.button1.setText("");
            view.button2.setText("");
            view.button3.setText("");
            view.button4.setText("");
            view.button5.setText("");
            view.button6.setText("");
            view.button7.setText("");
            view.button8.setText("");
            view.button9.setText("");
        }else
            System.exit(0); 
    }
    public void draw(){
        alert.setContentText("Draw. Do you  want to play again?");
            Optional<ButtonType> result = alert.showAndWait();
            if(result.get() == ButtonType.OK){
                for (int i = 0; i < 3; ++i)
                    for (int j = 0; j < 3; ++j)
                        matrix[i][j] = "";
                view.counter = 0;
                view.button1.setText("");
                view.button2.setText("");
                view.button3.setText("");
                view.button4.setText("");
                view.button5.setText("");
                view.button6.setText("");
                view.button7.setText("");
                view.button8.setText("");
                view.button9.setText("");
            }else
                System.exit(0); 
    }
    public static void main(String[] args) {
        launch(args);
    }
}
