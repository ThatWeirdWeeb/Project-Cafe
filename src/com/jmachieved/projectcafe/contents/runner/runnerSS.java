/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmachieved.projectcafe.contents.runner;

import com.jmachieved.projectcafe.contents.Home;
import com.jmachieved.projectcafe.contents.splashscreen;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author johnp
 */
public class runnerSS {
//running the splash screen

    public static void main(String[] args) {
        /*
            Shows the splashscreen.java 1st and then there's a thread to 
            count down and to show the Home.java
        */
        splashscreen scs = new splashscreen(); 
        scs.setVisible(true);
        
        Thread a = new Thread(){
            @Override
            public void run(){
                try{
                    sleep(3000);
                }catch(InterruptedException ex){
                    Logger.getLogger(splashscreen.class.getName()).log(Level.SEVERE, null, ex);
                }finally{
                    scs.setVisible(false);
                    new Home().setVisible(true);
                }
            }         
        };
        a.start();
    }
}
