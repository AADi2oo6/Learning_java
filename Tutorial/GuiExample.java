import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiExample{
    private static String storedName;
    private static int storedAge;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Data");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel nameLabel = new JLabel("Enter Name:");
        nameLabel.setBounds(50, 50, 100, 30); // x, y, width, height

        JTextField nameField = new JTextField();
        nameField.setBounds(150, 50, 150, 30);

        // --- Age Row ---
        JLabel ageLabel = new JLabel("Enter Age:");
        ageLabel.setBounds(50, 100, 100, 30);

        JTextField ageField = new JTextField();
        ageField.setBounds(150, 100, 150, 30);

        // --- Submit Button ---
        JButton submitButton = new JButton("Submit Data");
        submitButton.setBounds(100, 160, 140, 30);

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(ageLabel);
        frame.add(ageField);
        frame.add(submitButton);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // This code runs when button is clicked
                try {
                    // A. GET data from fields
                    storedName = nameField.getText();
                    String ageText = ageField.getText();

                    // B. Parse/Convert data (Validation)
                    storedAge = Integer.parseInt(ageText); // Convert String to Int


                    // C. Logic (Print to console or use the variables)
                    System.out.println("--- Data Saved ---");
                    System.out.println("Name Variable: " + storedName);
                    System.out.println("Age Variable: " + storedAge);

                    // D. Visual Feedback (Popup)
                    JOptionPane.showMessageDialog(frame, "Success! Saved: " + storedName);

                } catch (NumberFormatException ex) {
                    // Handle error if age is not a number
                    JOptionPane.showMessageDialog(frame, "Error: Age must be a number!");
                }
            }
        });
        frame.setVisible(true);
    }
}