import javax.swing.*;

public class LoginFrame extends JFrame {
    JTextField username;
    JPasswordField password;
    JButton loginBtn;

    LoginFrame() {
        setTitle("Login");
        setSize(300,200);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(20,30,80,25);
        add(userLabel);

        username = new JTextField();
        username.setBounds(100,30,150,25);
        add(username);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(20,70,80,25);
        add(passLabel);

        password = new JPasswordField();
        password.setBounds(100,70,150,25);
        add(password);

        loginBtn = new JButton("Login");
        loginBtn.setBounds(100,110,100,30);
        add(loginBtn);

        loginBtn.addActionListener(e -> {
            if(username.getText().equals("admin") &&
               new String(password.getPassword()).equals("1234")) {
                
                new Dashboard();
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Login");
            }
        });

        setVisible(true);
    }
}
