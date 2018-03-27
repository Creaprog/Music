package com.template;

import com.controller.Gestion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends Gestion {
    public JPanel PanelMain;
    private JButton StartButton;
    private JButton StopButton;
    private JLabel Title;
    private JLabel Music;

    public App() {
        StartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                start(App.this);
            }
        });

        StopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Music.setText("STOP");
            }
        });
    }

    public JLabel getMusic() {
        return Music;
    }

    public void setMusic(JLabel music) {
        Music = music;
    }
}