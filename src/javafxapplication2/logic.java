/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;


public class logic {
    JavaFXApplication2 view = new JavaFXApplication2();
    String[][] matrix = {{"","",""},{"","",""},{"","",""}};
    Alert  alert   = new Alert(Alert.AlertType.CONFIRMATION);
    boolean XWin = false;
    boolean OWin = false;
    boolean draw = false;
    
    public void game(){
        do{
            
            checkGame();
        }while(XWin == true || OWin == true || draw == true);
    }
    
    public void checkGame(){
        
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
            check();
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
    
    public  boolean check(){// function of checking if either of players have won
        if(
            (compare(matrix[0][0],matrix[0][1]) && compare(matrix[0][0],matrix[0][2])) && compare(matrix[0][0],"X") ||
            (compare(matrix[1][0],matrix[1][1]) && compare(matrix[1][0],matrix[1][2])) && compare(matrix[1][0],"X") ||
            (compare(matrix[2][0],matrix[2][1]) && compare(matrix[2][0],matrix[2][2])) && compare(matrix[2][0],"X") ||
                
            (compare(matrix[0][1],matrix[1][1]) && compare(matrix[0][1],matrix[2][1])) && compare(matrix[0][1],"X") ||
            (compare(matrix[0][2],matrix[1][2]) && compare(matrix[0][2],matrix[2][2])) && compare(matrix[0][2],"X") ||
            (compare(matrix[0][0],matrix[1][0]) && compare(matrix[0][0],matrix[2][0])) && compare(matrix[0][0],"X") ||
                
            (compare(matrix[1][1],matrix[0][0]) && compare(matrix[1][1],matrix[2][2])) && compare(matrix[1][1],"X") ||
            (compare(matrix[1][1],matrix[2][0]) && compare(matrix[1][1],matrix[0][2])) && compare(matrix[1][1],"X") ) {
            
            XWins();
            return XWin = true;
            
        }
        
        else if(
            (compare(matrix[0][0],matrix[0][1]) && compare(matrix[0][0],matrix[0][2])) && compare(matrix[0][0],"O") ||
            (compare(matrix[1][0],matrix[1][1]) && compare(matrix[1][0],matrix[1][2])) && compare(matrix[1][0],"O") ||
            (compare(matrix[2][0],matrix[2][1]) && compare(matrix[2][0],matrix[2][2])) && compare(matrix[2][0],"O") ||
                
            (compare(matrix[0][1],matrix[1][1]) && compare(matrix[0][1],matrix[2][1])) && compare(matrix[0][1],"O") ||
            (compare(matrix[0][2],matrix[1][2]) && compare(matrix[0][2],matrix[2][2])) && compare(matrix[0][2],"O") ||
            (compare(matrix[0][0],matrix[1][0]) && compare(matrix[0][0],matrix[2][0])) && compare(matrix[0][0],"O") ||
                
            (compare(matrix[1][1],matrix[0][0]) && compare(matrix[1][1],matrix[2][2])) && compare(matrix[1][1],"O") ||
            (compare(matrix[1][1],matrix[2][0]) && compare(matrix[1][1],matrix[0][2])) && compare(matrix[1][1],"O") ){
            
            OWins();
            return OWin = true;
            
        }
            
                 
        else
            if(view.counter == 9){
                draw();
                return draw = true;
            }
        return false;
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
}
