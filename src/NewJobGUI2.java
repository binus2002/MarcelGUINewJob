package src;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewJobGUI2 {
    private JLabel Header;
    private JLabel CustomerId;
    private JTextField textFieldCustId;
    private JLabel RegisterationNumber;
    private JTextField RegNumber;
    private JPanel Border;
    private JLabel dateBooked;
    private JFormattedTextField DateBooked;
    private JLabel CustomerName;
    private JTextField CustName;
    private JLabel EstimatedPrice;
    private JFormattedTextField Estimatedprice;
    private JLabel JobType;
    private JRadioButton MOTRadioButton;
    private JRadioButton repairRadioButton;
    private JRadioButton annualServiceRadioButton;
    private JRadioButton otherRadioButton;
    private JTextArea Description;
    private JButton createNewJobButton;


    public void CreateNewJob() {
        createNewJobButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //add code to submit the form
                //Send information and save to database
                String Name = CustName.getText();
                String CustId = CustomerId.getText();
                if (CustId != null && CustName != null) {
                    infoBox("Job created" );
                    System.out.println("alr");
                    //new GUI      new JobGui().setVisible(true);
                }
            }

            private void infoBox(String job_created) {
            }
        });
    }
}
