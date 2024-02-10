import javax.swing.;
import java.awt.;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BusRouteMonitor extends JFrame {
    
    private static final String[] busStops = {"School", "Stop 1", "Stop 2", "Stop 3", "Home"};



public BusRouteMonitor() {
    setTitle("Bus Route Monitor");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 300);
    setLocationRelativeTo(null);

  
    JLabel label = new JLabel("Select a bus stop:");
    JComboBox<String> busStopsComboBox = new JComboBox<>(busStops);
    JButton showRouteButton = new JButton("Show Route");

   
    setLayout(new BorderLayout());
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(3, 1));
    panel.add(label);
    panel.add(busStopsComboBox);
    panel.add(showRouteButton);
    add(panel, BorderLayout.CENTER);

   
    showRouteButton.addActionListener(new ActionListener() {
        
        public void actionPerformed(ActionEvent e) {
            String selectedStop = (String) busStopsComboBox.getSelectedItem();
            JOptionPane.showMessageDialog(BusRouteMonitor.this,
                    "Displaying route information for: " + selectedStop,
                    "Route Information", JOptionPane.INFORMATION_MESSAGE);
            
        }
    });
}

public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
       
        public void run() {
            new BusRouteMonitor().setVisible(true);
        }
    });
}
}
