/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mallmanagement;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author ari
 */
public class MallManagement extends Application {
    
    @Override
    public void start(Stage primaryStage) {
      LoginPage lp = new LoginPage();
        lp.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
