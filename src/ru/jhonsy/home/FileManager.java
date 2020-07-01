package ru.jhonsy.home;

import ru.jhonsy.home.ui.UI;

import javax.swing.*;

/**
 * @Author: Ivan Slastikhin
 */
public class FileManager {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UI();
            }
        });
    }

}
