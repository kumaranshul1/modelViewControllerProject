
import java.awt.Rectangle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anshulkumar
 */
public class NavView {
    
    private InitialFrame iframe;
    private NavModel viewModel;
    
    NavView(NavModel model) {
        this.viewModel = model;
        iframe = new InitialFrame();
    }
    
    //Method to make team choice buttons invisible after user makes team selection
    public void SetButtonsInvisible() {
        getIframe().getCp().getGp().getTeam1().setVisible(false);
        getIframe().getCp().getGp().getTeam2().setVisible(false);
        getIframe().getCp().getGp().getTeam3().setVisible(false);
        getIframe().getCp().getGp().getText().setVisible(false);
    }
    
    //Method to set player button bounds
    public void SetPlayerBounds(Rectangle rect) {
        getIframe().getCp().getGp().getPlayerButton().setBounds(rect);
    }
    
    //Method to set enemey1 button bounds
    public void SetEnemey1Bounds(Rectangle rect) {
        getIframe().getCp().getGp().getEnemyButton1().setBounds(rect);
    }
    
    //Method to set enemey2 button bounds
    public void SetEnemey2Bounds(Rectangle rect) {
        getIframe().getCp().getGp().getEnemyButton2().setBounds(rect);
    }
    
    //Set status label text
    public void SetStatusLabelText(String str) {
        getIframe().getCp().getTp().getLabel().setText(str);
    }
    
    /**
     * @return the iframe
     */
    public InitialFrame getIframe() {
        return iframe;
    }

    /**
     * @param iframe the iframe to set
     */
    public void setIframe(InitialFrame iframe) {
        this.iframe = iframe;
    }

    /**
     * @return the viewModel
     */
    public NavModel getViewModel() {
        return viewModel;
    }

    /**
     * @param viewModel the viewModel to set
     */
    public void setViewModel(NavModel viewModel) {
        this.viewModel = viewModel;
    }
    
    
}
