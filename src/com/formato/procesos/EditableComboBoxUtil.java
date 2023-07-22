package com.formato.procesos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditableComboBoxUtil {

    public static void makeEditableComboBox(JComboBox<String> comboBox, boolean editable) {
        if (editable) {
            if (!(comboBox.getEditor() instanceof JTextField)) {
                comboBox.setEditable(true);
                comboBox.setEditor(new EditableComboBoxEditor(comboBox));
            }
        } else {
            comboBox.setEditable(false);
        }
    }

    private static class EditableComboBoxEditor implements ComboBoxEditor {
        private final JComboBox<String> comboBox;
        private final JTextField editorTextField;

        public EditableComboBoxEditor(JComboBox<String> comboBox) {
            this.comboBox = comboBox;
            this.editorTextField = new JTextField();
            editorTextField.setBorder(BorderFactory.createEmptyBorder());
            editorTextField.addActionListener(new AddItemActionListener());
        }

        @Override
        public Component getEditorComponent() {
            return editorTextField;
        }

        @Override
        public void setItem(Object item) {
            String text = (item != null) ? item.toString() : "";
            editorTextField.setText(text);
        }

        @Override
        public Object getItem() {
            return editorTextField.getText();
        }

        @Override
        public void selectAll() {
            editorTextField.selectAll();
        }

        @Override
        public void addActionListener(ActionListener listener) {
            editorTextField.addActionListener(listener);
        }

        @Override
        public void removeActionListener(ActionListener listener) {
            editorTextField.removeActionListener(listener);
        }

        private class AddItemActionListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                String newItem = editorTextField.getText().trim();
                if (!newItem.isEmpty()) {
                    DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) comboBox.getModel();
                    if (!containsItemIgnoreCase(model, newItem)) {
                        model.addElement(newItem);
                    }
                }
            }
        }

        private boolean containsItemIgnoreCase(DefaultComboBoxModel<String> model, String item) {
            for (int i = 0; i < model.getSize(); i++) {
                if (model.getElementAt(i).equalsIgnoreCase(item)) {
                    return true;
                }
            }
            return false;
        }
    }

    // Example of usage:
    public static void main(String[] args) {
        JFrame frame = new JFrame("Editable JComboBox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JComboBox<String> comboBox = new JComboBox<>(new String[]{"Apple", "Banana", "Orange"});

        // Activa o desactiva la edición del JComboBox
        boolean isEditable = false; // Cambia a "false" para desactivar la edición
        makeEditableComboBox(comboBox, isEditable);

        frame.add(comboBox);
        frame.pack();
        frame.setVisible(true);
    }
}
