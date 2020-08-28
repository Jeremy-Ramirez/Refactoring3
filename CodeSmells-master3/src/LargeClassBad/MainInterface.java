/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LargeClassBad;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;


public class MainInterface extends Application {
    private Scene scene;
    private Object menu;
    private static Stage MainStage;
    private double MainWidth;
    private double MainHeight;
	
	
	private VBox root;
    private Button play,exit;
	
    @Override
    public void start(Stage primaryStage)  {
        
        MainStage= primaryStage;
        setupStage();
        menu= new Object();
        scene = new Scene(root, 400, 300);
        MainStage.setTitle("GENIO POLITECNICO");
        MainStage.setScene(scene);
        MainStage.show();
        
    }

    public static void main(String[] args) {
        launch(args);
    }
    
    public void setupStage(){
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
        MainStage.setX(primaryScreenBounds.getMinX());
        MainStage.setY(primaryScreenBounds.getMinY());
        MainWidth=primaryScreenBounds.getWidth()/2.5;
        MainHeight= primaryScreenBounds.getHeight()/2.5;
        MainStage.setWidth(MainWidth);
        MainStage.setHeight(MainHeight);
		MainStage.setResizable(false);
    }
    
    public void Return(){
        scene.setRoot(root);
    }
    
    public double getMainWidth() {
        return MainWidth;
    }

    public void setMainWidth(double MainWidth) {
        this.MainWidth = MainWidth;
    }

    public double getMainHeight() {
        return MainHeight;
    }

    public void setMainHeight(double MainHeight) {
        this.MainHeight = MainHeight;
    }
    
	public VBox getRoot(){
        return root;
    }
    
    private void setButtons(){
        root.setStyle("-fx-background-image: url("+500+");\n"
			+ "    -fx-background-repeat: stretch;\n"
			+ "    -fx-background-size:"+ this.getMainWidth()+" "+this.getMainHeight()+";\n"
			+ "    -fx-background-position: center center;");
        
        play= new Button("Play");
        exit= new Button("Exit");
        play.setPrefSize(100, 40);
		exit.setPrefSize(100, 40);
		
        play.setOnAction(e-> this.setupStage());
		exit.setOnAction(e->Platform.exit());
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(play,exit);
        
       
       play.setStyle("-fx-font-size: "+String.valueOf(this.getMainHeight()/20));
       exit.setStyle("-fx-font-size: "+String.valueOf(this.getMainHeight()/20));
       
       
        
    }
    
}
