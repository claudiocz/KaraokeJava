package com.practica;

import javax.swing.*;

public class Visor extends JFrame{

    private GUIKaraoke karaoke;
    private JTextArea textArea;

    public Visor(GUIKaraoke karaoke){
        super("VISOR...");
        setSize(200,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        karaoke.getLis1();
    }


}
