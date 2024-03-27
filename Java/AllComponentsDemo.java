import java.awt.*;
import java.awt.event.*;
import java.applet.*;

// Define the main class
public class AllComponentsDemo extends Applet {
    Frame frame; // Declare a Frame object
    Panel panel; // Declare a Panel object
    Dialog dialog; // Declare a Dialog object

    // Initialization method for the applet
    public void init() {
        // Create a window (Frame)
        frame = new Frame("Window");
        frame.setSize(300, 200); // Set the size of the window
        frame.setLayout(new FlowLayout()); // Set the layout of the window
        Label label1 = new Label("This is a window (Frame)"); // Create a label
        frame.add(label1); // Add the label to the window
        frame.setVisible(true); // Make the window visible

        // Create a panel
        panel = new Panel();
        panel.setSize(200, 100); // Set the size of the panel
        panel.setBackground(Color.lightGray); // Set the background color of the panel
        Label label2 = new Label("This is a panel"); // Create a label
        panel.add(label2); // Add the label to the panel
        add(panel); // Add the panel to the applet

        // Create a frame
        Frame frame2 = new Frame("Frame");
        frame2.setSize(250, 150); // Set the size of the frame
        Label label3 = new Label("This is a frame"); // Create a label
        frame2.add(label3); // Add the label to the frame
        frame2.setVisible(true); // Make the frame visible

        // Create a dialog
        dialog = new Dialog(frame, "Dialog", true); // Create a modal dialog associated with the frame
        dialog.setSize(200, 100); // Set the size of the dialog
        dialog.setLayout(new FlowLayout()); // Set the layout of the dialog
        Label label4 = new Label("This is a dialog"); // Create a label
        dialog.add(label4); // Add the label to the dialog
        Button closeButton = new Button("Close"); // Create a button
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(false); // Close the dialog when the button is clicked
            }
        });
        dialog.add(closeButton); // Add the button to the dialog
        dialog.setVisible(true); // Make the dialog visible
    }

    // Paint method for the applet
    public void paint(Graphics g) {
        g.drawString("This is an applet", 10, 20); // Draw text on the applet
    }
}
