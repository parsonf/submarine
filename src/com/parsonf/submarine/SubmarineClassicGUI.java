package com.parsonf.submarine;

import javax.swing.*;

/**
 * Created by brian on 5/31/2015.
 */
public class SubmarineClassicGUI extends JFrame {

    private Submarine gameInstance;

    public SubmarineClassicGUI(Submarine gameInstance) {
        this.gameInstance = gameInstance;

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setExtendedState(this.getExtendedState()|JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
    }
}
