
import java.awt.BorderLayout;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anshulkumar
 */
public class InitialPanel extends JPanel {
    
    private TopPanel tp;
    private GamePanel gp;
    
    public InitialPanel () {
        super();
        BorderLayout bl = new BorderLayout();
        setLayout(bl);
        tp = new TopPanel();
        gp = new GamePanel();
        add(tp,BorderLayout.NORTH);
        add(gp, BorderLayout.CENTER);
    }

    /**
     * @return the tp
     */
    public TopPanel getTp() {
        return tp;
    }

    /**
     * @param tp the tp to set
     */
    public void setTp(TopPanel tp) {
        this.tp = tp;
    }

    /**
     * @return the gp
     */
    public GamePanel getGp() {
        return gp;
    }

    /**
     * @param gp the gp to set
     */
    public void setGp(GamePanel gp) {
        this.gp = gp;
    }
}
