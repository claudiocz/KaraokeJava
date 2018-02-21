package com.practica;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class GUIKaraoke extends JFrame{

    private JPanel panel1;

    private JList list1;

    private JLabel nombreCanciones;



    public GUIKaraoke(){
        super("Principal Karaoke");
        setLayout(null);
        setSize(1000,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        createUIComponents();
    }

    public void createUIComponents(){

        panel1 = new JPanel();

        setContentPane(panel1);
        setLayout(new GridLayout(2,1));


        nombreCanciones = new JLabel("Lista de Canciones");



        list1 = new JList();
        //list1.setBounds(100,300,300,300);

        String listCanciones[]= {"cancion1","cancion2","cancion3","cancion4"};


        list1.setListData(listCanciones);

        panel1.add(nombreCanciones);
        panel1.add(list1);

        list1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                //System.out.println("canciónes");
                setList1();
            }
        });


    }

    public void setList1() {
        list1.getListSelectionListeners();

    }

    public void getLis1(){

    }
}
