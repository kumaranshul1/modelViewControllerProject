
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anshulkumar
 */
public class TopPanel extends JPanel {
    
    private JSlider speedSlider, playerSpeed;
    private JLabel label, enemySliderLabel, playerSliderLabel;
    
    public TopPanel() {
        super();
        
        speedSlider = new JSlider(JSlider.HORIZONTAL,1,3,1);
        speedSlider.setMajorTickSpacing(1); 
        speedSlider.setPaintTicks(true); 
        speedSlider.setPaintLabels(true);
        speedSlider.setFocusable(false);
        
        playerSpeed = new JSlider(JSlider.HORIZONTAL,3,5,5);
        playerSpeed.setMajorTickSpacing(1); 
        playerSpeed.setPaintTicks(true); 
        playerSpeed.setPaintLabels(true);
        playerSpeed.setFocusable(false);
        

        
        label = new JLabel("Score: " + 0 + " Tackles: " + 0);
        playerSliderLabel = new JLabel("Player Speed");
        enemySliderLabel = new JLabel("Enemy Speed");
        
        add(playerSliderLabel);
        add(playerSpeed);
        add(label);
        add(speedSlider);
        add(enemySliderLabel);
        
    }

    /**
     * @return the speedSlider
     */
    public JSlider getSpeedSlider() {
        return speedSlider;
    }

    /**
     * @param speedSlider the speedSlider to set
     */
    public void setSpeedSlider(JSlider speedSlider) {
        this.speedSlider = speedSlider;
    }

    /**
     * @return the label
     */
    public JLabel getLabel() {
        return label;
    }

    /**
     * @param label the label to set
     */
    public void setLabel(JLabel label) {
        this.label = label;
    }

    /**
     * @return the playerSpeed
     */
    public JSlider getPlayerSpeed() {
        return playerSpeed;
    }

    /**
     * @param playerSpeed the playerSpeed to set
     */
    public void setPlayerSpeed(JSlider playerSpeed) {
        this.playerSpeed = playerSpeed;
    }

    /**
     * @return the enemySliderLabel
     */
    public JLabel getEnemySliderLabel() {
        return enemySliderLabel;
    }

    /**
     * @param enemySliderLabel the enemySliderLabel to set
     */
    public void setEnemySliderLabel(JLabel enemySliderLabel) {
        this.enemySliderLabel = enemySliderLabel;
    }

    /**
     * @return the playerSliderLabel
     */
    public JLabel getPlayerSliderLabel() {
        return playerSliderLabel;
    }

    /**
     * @param playerSliderLabel the playerSliderLabel to set
     */
    public void setPlayerSliderLabel(JLabel playerSliderLabel) {
        this.playerSliderLabel = playerSliderLabel;
    }
}
