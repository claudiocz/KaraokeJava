package com.practica;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                GUIKaraoke windows = new GUIKaraoke();
                windows.setVisible(true);
                Visor v = new Visor(windows);
                v.setVisible(true);
            }
        });


    }
}
