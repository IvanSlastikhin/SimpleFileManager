package ru.jhonsy.home.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Author: Ivan Slastikhin
 */
public class CreateNewFolderJDialog extends JDialog {
    private JTextField nameOfNewFolder = new JTextField(10);
    private JButton okButton = new JButton("ОК");
    private JButton cancelButton = new JButton("Отмена");
    private String newFolderName;
    private JLabel newFolderCaption = new JLabel("Имя новой папки: ");
    private boolean ready = false;

    public boolean isReady() {
        return ready;
    }

    public String getNewFolderName() {
        return newFolderName;
    }

    public CreateNewFolderJDialog(JFrame jFrame) {
        super(jFrame, "Создать новую папку", true);
        setLayout(new GridLayout(2, 2, 5, 5));
        setSize(400, 100);

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newFolderName = nameOfNewFolder.getText();
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

        getContentPane().add(newFolderCaption);
        getContentPane().add(nameOfNewFolder);
        getContentPane().add(okButton);
        getContentPane().add(cancelButton);

        setLocationRelativeTo(null);
        setVisible(true);

    }

}
