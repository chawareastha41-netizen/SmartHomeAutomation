import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {

    Device light = new Device("Light");
    Device fan = new Device("Fan");
    Device ac = new Device("AC");

    JLabel statusLabel;
    JTextField commandField;
    JButton commandBtn;

    Dashboard() {
        setTitle("Smart Home Dashboard");
        setSize(400,300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton lightBtn = new JButton("Toggle Light");
        JButton fanBtn = new JButton("Toggle Fan");
        JButton acBtn = new JButton("Toggle AC");

        statusLabel = new JLabel("Status: ");

        commandField = new JTextField(15);
        commandBtn = new JButton("Run Command");

        // Button actions
        lightBtn.addActionListener(e -> {
            light.toggle();
            updateStatus();
        });

        fanBtn.addActionListener(e -> {
            fan.toggle();
            updateStatus();
        });

        acBtn.addActionListener(e -> {
            ac.toggle();
            updateStatus();
        });

        // Command logic
        commandBtn.addActionListener(e -> {
            String command = commandField.getText().toLowerCase();

            if(command.equals("turn on light")) {
                light.toggle();
            } 
            else if(command.equals("turn on fan")) {
                fan.toggle();
            } 
            else if(command.equals("turn on ac")) {
                ac.toggle();
            } 
            else {
                JOptionPane.showMessageDialog(this, "Unknown Command");
            }

            updateStatus();
        });

        // Add components
        add(lightBtn);
        add(fanBtn);
        add(acBtn);
        add(commandField);
        add(commandBtn);
        add(statusLabel);

        setVisible(true);
    }

    void updateStatus() {
        statusLabel.setText(
            "Light: " + light.getStatus() +
            " | Fan: " + fan.getStatus() +
            " | AC: " + ac.getStatus()
        );
    }
}
