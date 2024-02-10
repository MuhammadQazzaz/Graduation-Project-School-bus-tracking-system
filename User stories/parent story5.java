import javax.swing.;
import java.awt.;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BusScheduleMonitor extends JFrame {
  
    private static class RealTimeUpdateService {
        public static String getUpdates() {
        
   example.
            return "No disruptions at the moment.";
        }
    }



public BusScheduleMonitor() {
    setTitle("Bus Schedule Monitor");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 300);
    setLocationRelativeTo(null);

   
    JTextArea updatesTextArea = new JTextArea();
    updatesTextArea.setEditable(false);
    JButton checkUpdatesButton = new JButton("Check for Updates");

    
    setLayout(new BorderLayout());
    add(updatesTextArea, BorderLayout.CENTER);

    JPanel panel = new JPanel();
    panel.setLayout(new FlowLayout());
    panel.add(checkUpdatesButton);
    add(panel, BorderLayout.SOUTH);

   
    checkUpdatesButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            
            String updates = RealTimeUpdateService.getUpdates();
            updatesTextArea.setText(updates);
        }
    });
}

public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            new BusScheduleMonitor().setVisible(true);
        }
    });
}
}
