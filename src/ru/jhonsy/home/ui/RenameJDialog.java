package ru.jhonsy.home.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Author: Ivan Slastikhin
 */
public class RenameJDialog extends JDialog {

    private JTextField nameOfRenamedFolder = new JTextField(10);
    private JLabel renameCaption = new JLabel("Новое имя папки: ");
    private JButton okButton = new JButton("Ок");
    private JButton cancelButton = new JButton("Отмена");
    private String renamedFolderName;
    private boolean ready = false;

    public boolean isReady() {
        return ready;
    }

    public String getRenamedFolderName() {
        return renamedFolderName;
    }

    public RenameJDialog(JFrame jFrame){
        super(jFrame, "Переименовать папку", true);
        setLayout(new GridLayout(2,2,5,5));
        setSize(400, 100);

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                renamedFolderName = nameOfRenamedFolder.getText();
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

        getContentPane().add(renameCaption);
        getContentPane().add(nameOfRenamedFolder);
        getContentPane().add(okButton);
        getContentPane().add(cancelButton);

        setLocationRelativeTo(null);
        setVisible(true);
    }
}
