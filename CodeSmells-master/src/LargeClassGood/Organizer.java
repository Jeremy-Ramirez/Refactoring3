/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LargeClassGood;

import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

/**
 *
 * @author DOTA
 */
public class Organizer {
    private MainInterface main;
    private VBox root;
    private Button play,exit;
    
    public Organizer(MainInterface main){
        this.main= main;
        this.root= new VBox();
		root.setSpacing(15);
		root.setPadding(new Insets(10,10,10,10));
        setButtons();
    }
    
    public VBox getRoot(){
        return root;
    }
    
    private void setButtons(){
        root.setStyle("-fx-background-image: url("+1000+");\n"
			+ "    -fx-background-repeat: stretch;\n"
			+ "    -fx-background-size:"+ main.getMainWidth()+" "+main.getMainHeight()+";\n"
			+ "    -fx-background-position: center center;");
        
        play= new Button("Play");
        exit= new Button("Exit");
        play.setPrefSize(100, 40);
		exit.setPrefSize(100, 40);
		
 
		exit.setOnAction(e->Platform.exit());
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(play,exit);
        
       
       play.setStyle("-fx-font-size: "+String.valueOf(main.getMainHeight()/20));
       exit.setStyle("-fx-font-size: "+String.valueOf(main.getMainHeight()/20));
       
       
        
    }
    
    
    
    
    
    
    
}
