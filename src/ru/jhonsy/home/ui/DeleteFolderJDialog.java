package ru.jhonsy.home.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Author: Ivan Slastikhin
 */
public class DeleteFolderJDialog extends JDialog {
    private JPanel deletePanel = new JPanel();
    private JLabel deleteCaption = new JLabel("Удалить текущую папку?");
    private JPanel buttonsPanel = new JPanel();
    private JButton okButton = new JButton("Ок");
    private JButton cancelButton = new JButton("Отмена");
    private boolean ready = false;

    public boolean isReady() {
        return ready;
    }

    public DeleteFolderJDialog(JFrame jFrame){
        super(jFrame, "Удалить папку", true);
        deletePanel.setLayout(new BorderLayout(5,5));
        deletePanel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        buttonsPanel.setLayout(new GridLayout(1,2,5,5));

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                ready = true;
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                ready = false;
            }
        });

        buttonsPanel.add(okButton);
        buttonsPanel.add(cancelButton);

        deletePanel.add(deleteCaption, BorderLayout.PAGE_START);
        deletePanel.add(buttonsPanel, BorderLayout.SOUTH);

        getContentPane().add(deletePanel);
        setSize(200, 100);

        setLocationRelativeTo(null);
        setVisible(true);
    }
}
