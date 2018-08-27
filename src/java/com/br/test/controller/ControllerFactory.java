package com.br.test.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ControllerFactory {
    
    public static Controller getControllerByName(String name){
        Controller controller = null;
        
        try {
            controller = (Controller)Class.forName("com.br.test.controller."+name).newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(ControllerFactory.class.getName()).log(Level.SEVERE, null, ex);
        }

        return controller;
    }
}
