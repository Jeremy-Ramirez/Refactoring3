/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LargeClassGood;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 *
 * @author DOTA
 */
public class MainInterface extends Application {
    private Scene scene;
    private Organizer menu;
    
    private static Stage MainStage;
    private double MainWidth;
    private double MainHeight;
    @Override
    public void start(Stage primaryStage)  {
        
        MainStage= primaryStage;
        setupStage();
        menu= new Organizer(this);
        scene = new Scene(menu.getRoot(), 400, 300);
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
        scene.setRoot(menu.getRoot());
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
    
    
}
