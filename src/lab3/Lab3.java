package lab3;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Lab3 extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		/*
		 * 
		 *  To do: 
		 *      1) User enters  three integer inputs: hour, minute, second from the console, using System.in
		 *      2) program calls dualClock method with hour, minute and second parameters     
		 *      3) In the primary stage, program displays the visualization of a clock stage from the dualClock method call
	     	 *	4) User enters  a list of x and o positions for the TicTacToe board from the console using System.in
	     	 *      5) program calls tictacBoard method with a two-dimensional array of strings
		 *      6) In stage s2, program displays the visualization of a tic-tac-toe board from the ticTacBoard method call
		 
		 */			
	
	}
	
	public Stage dualClock(int hh, int mm, int ss) throws IOException{ 		
		
		Stage s1 = new Stage();
		
		/*
		 *  To do: 
		 * Use JavaFX to implement your clock stage
		 * This method uses the user's input from start method as its parameters 
		 * The method returns a Stage object, s1 which visualizes your clock hands corresponding to user's input
		 */
		
		return s1; 		
}	
	
	public Stage tictacBoard(String[][] board) throws IOException{ 		
		
		Stage s2 = new Stage();
		
		/*
		 *  To do: 
		 * Use JavaFX to implement your tic-tac-toe stage
		 * This method uses the user's input from start method as its parameters 
		 * The method returns a Stage object s2 which visualizes the resulting board from the start method
		 * 
		 * 		 
		 */		
		
		return s2; 		
}	

	public static void main(String[] args) {
		launch(args);
	}



}
