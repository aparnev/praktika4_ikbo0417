import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JF extends JFrame {
    public int milScore;
    public int madScore;
    JLabel resLbl = new JLabel("Result: 0 X 0");
    JLabel matchWinnerLbl = new JLabel("Winner: Draw");
    JLabel lastScorerLbl = new JLabel("Last Scorer: N/A");
    JButton milanButton = new JButton("AC Milan");
    JButton madridButton = new JButton("Real Madrid");

    public JF(){
        super("Example");
        milScore = 0;
        madScore = 0;

        setSize(300, 200);
        setLayout(null);
        milanButton.setBounds(20, 10, 110, 30);
        madridButton.setBounds(155, 10, 110, 30);
        resLbl.setBounds(100, 50, 100, 30);
        lastScorerLbl.setBounds(90, 70, 200, 30);
        matchWinnerLbl.setBounds(100, 90, 200, 30);

        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ++milScore;
                resLbl.setText("Result: " + milScore + " X " + madScore);
                lastScorerLbl.setText("Last Scorer: AC Milan");
                if(milScore > madScore)
                    matchWinnerLbl.setText("Winner: AC Milan");
                else if(milScore < madScore)
                    matchWinnerLbl.setText("Winner: Real Madrid");
                else
                    matchWinnerLbl.setText("Winner: Draw");
            }
        });
        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ++madScore;
                resLbl.setText("Result: " + milScore + " X " + madScore);
                lastScorerLbl.setText("Last Scorer: Real Madrid");
                if(milScore > madScore)
                    matchWinnerLbl.setText("Winner: AC Milan");
                else if(milScore < madScore)
                    matchWinnerLbl.setText("Winner: Real Madrid");
                else
                    matchWinnerLbl.setText("Winner: Draw");
            }
        });



        add(milanButton);
        add(madridButton);
        add(resLbl);
        add(lastScorerLbl);
        add(matchWinnerLbl);
    }


    public static void main(String[] args) {
        new JF().setVisible(true);
    }
}
