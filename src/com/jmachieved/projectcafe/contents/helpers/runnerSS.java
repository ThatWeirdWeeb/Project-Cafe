/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmachieved.projectcafe.contents.helpers;

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
        splashscreen scs = new splashscreen();
        scs.setVisible(true);
        try {
            for (int o = 0; o <= 100; o++) {
                Thread.sleep(40);
                if (o == 100) {
                    scs.setVisible(false);
                    new Home().setVisible(true);
                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(splashscreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
