package com.formation;

import java.awt.*;

public class Application {

    public Application(){

    }

    public static void main(String[] args) {
        Frame frame = new Frame("Application");
        frame.setPreferredSize(new Dimension(600,400));

        MenuBar menuBar = new MenuBar();
        frame.setMenuBar(menuBar);
        Menu menu = new Menu("Fichier");

        MenuItem menuItem = new MenuItem("Ouvrir");
        MenuItem menuQuitter = new MenuItem("Quitter");

        menu.add(menuItem);
        menu.add(menuQuitter);
        menuBar.add(menu);


        Panel p = new Panel();

        Panel pButtom = new Panel();
        frame.setLayout(new BorderLayout());
        Button button1 = new Button("OK");
        Button button2 = new Button("Annuler");
        Button button3 = new Button("Confirmer");
        Checkbox cx = new Checkbox();
        button1.addActionListener(new MonActionListner());


        pButtom.add(cx);
        pButtom.add(button1);
        pButtom.add(button2);
        pButtom.add(button3);



        GridLayout gl = new GridLayout(3,2);
        p.setLayout(gl);




        for(int i=0;i<=5;i++){
            p.add(new Button("button "+i));
        }

Label lb = new Label("Nom");
        TextField tx = new TextField();
        p.add(lb);
        p.add(tx);


        frame.add(p,BorderLayout.NORTH);
        frame.add(pButtom,BorderLayout.SOUTH);


        frame.pack();
        frame.show();
    }
}
