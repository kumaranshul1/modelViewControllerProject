
import javax.swing.JFrame;
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anshulkumar
 */
public class InitialFrame extends JFrame {
    
    private InitialPanel cp;
    
    InitialFrame () {
        super("Football MVC");
        //LayoutSetupMAC(); Commented out because it causes button borders to not disappear when trying to create empty border.
        cp = new InitialPanel();
        add(cp);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize (800,625);
        setVisible(true);
    }
    
    void LayoutSetupMAC() {
        // On some MACs it might be necessary to have the statement below 
        //for the background color of the button to appear    
        try
        {
            UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        //------------------------------------------------------           
    }

    /**
     * @return the cp
     */
    public InitialPanel getCp() {
        return cp;
    }

    /**
     * @param cp the cp to set
     */
    public void setCp(InitialPanel cp) {
        this.cp = cp;
    }
    
    
}
