
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anshulkumar
 */
public class NavController {
    
    private NavModel model;
    private NavView view;
    private Timer tim;
    
    NavController(NavModel imodel, NavView iview) {
        this.model = imodel;
        this.view = iview;
        
        
        tim = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                //enemy movement
                EnemyMovement();
                
                // Check enemy 1 intersection
                CheckEnemy1Intersection();
                
                // Check enemy 2 intersection
                CheckEnemy2Intersection();
                
                
                // Check endzone intersection
                CheckEndzoneIntersection();
                
                
                //Check and update speed of enemy based on JSlider
                view.getIframe().getCp().getTp().getSpeedSlider().addChangeListener(new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) { 
                        model.setEnemySpeed(view.getIframe().getCp().getTp().getSpeedSlider().getValue());
                    }
                });
                
                //Check and update speed of player based on JSlider
                view.getIframe().getCp().getTp().getPlayerSpeed().addChangeListener(new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) { 
                        model.setPlayerSpeed(view.getIframe().getCp().getTp().getPlayerSpeed().getValue());
                    }
                });
                
                
                //Set status label
                view.SetStatusLabelText("Score: " + model.getScore() + " Tackles: " + model.getTackles());
            }
        });
        
        
        //Action listener for team1 choice button
        view.getIframe().getCp().getGp().getTeam1().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                view.SetButtonsInvisible();
                tim.start();
            }
        });
        
        //Action listener for team2 choice button
        view.getIframe().getCp().getGp().getTeam2().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                view.getIframe().getCp().getGp().getPlayerButton().setIcon(view.getIframe().getCp().getGp().getTeam2Icon());
                view.SetButtonsInvisible();
                tim.start();
            }
        });
        
        //Action listener for team3 choice button
        view.getIframe().getCp().getGp().getTeam3().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                view.getIframe().getCp().getGp().getPlayerButton().setIcon(view.getIframe().getCp().getGp().getTeam3Icon());
                view.SetButtonsInvisible();
                tim.start();
            }
        });
        
        //player movement action listener        
        view.getIframe().getCp().getGp().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent evt) {
                int keyPressed = evt.getKeyCode();
                PlayerMovement(keyPressed);
                tim.start();
            }
        });
        
        
    }
    
    
    //Method to move player based on key pressed
    private void PlayerMovement(int keyPressed) {
        if(keyPressed ==  KeyEvent.VK_LEFT) {model.MoveLeft();}
        if(keyPressed ==  KeyEvent.VK_RIGHT) {model.MoveRight();}
        if(keyPressed ==  KeyEvent.VK_UP) {model.MoveUp();}
        if(keyPressed ==  KeyEvent.VK_DOWN) {model.MoveDown();}
        view.SetPlayerBounds(new Rectangle(model.getPlayer().getxCoor(), model.getPlayer().getyCoor(), model.getPlayer().getBoxLength(), model.getPlayer().getBoxHeight()));
    }
    
    //Method to move enemy
    private void EnemyMovement() {
        model.ModelEnemyMovement();
        view.SetEnemey1Bounds(new Rectangle(model.getEnemy1().getxCoor(), model.getEnemy1().getyCoor(), model.getEnemy1().getBoxLength(), model.getEnemy1().getBoxHeight()));
        view.SetEnemey2Bounds(new Rectangle(model.getEnemy2().getxCoor(), model.getEnemy2().getyCoor(), model.getEnemy2().getBoxLength(), model.getEnemy2().getBoxHeight()));
    }
    
    //Method to check enemy1 and player intersection, count tackle and display it
    private void CheckEnemy1Intersection() {
        if(model.ModelCheckEnemy1Intersection() == true) { 
            model.TacklePlus();
            tim.stop();
            JOptionPane.showMessageDialog(view.getIframe().getCp().getGp().getPopup(),"You were tackled! You've been tackled " + model.getTackles() + " times.");
            ResetGameBoard();
        }
    }
    
    //Method to check enemy2 and player intersection, count tackle and display it
    private void CheckEnemy2Intersection() {
        if(model.ModelCheckEnemy2Intersection() == true) { 
            model.TacklePlus();
            tim.stop();
            JOptionPane.showMessageDialog(view.getIframe().getCp().getGp().getPopup(),"You were tackled! You've been tackled " + model.getTackles() + " times.");
            ResetGameBoard();
        }
    }
    
    //Method to check endzone and player intersection, count score and display it
    private void CheckEndzoneIntersection() {
        if(model.ModelCheckEndzoneIntersection() == true) { 
            model.ScorePlus();
            tim.stop();
            JOptionPane.showMessageDialog(view.getIframe().getCp().getGp().getPopup(),"You scored! You've scored " + model.getScore() + " times.");
            ResetGameBoard();
        }
    }
    
    //Method to reset gameboard
    private void ResetGameBoard() {
        model.ModelSetInitPos();
        view.SetPlayerBounds(new Rectangle(model.getPlayer().getxCoor(), model.getPlayer().getyCoor(), model.getPlayer().getBoxLength(), model.getPlayer().getBoxHeight()));
        view.SetEnemey1Bounds(new Rectangle(model.getEnemy1().getxCoor(), model.getEnemy1().getyCoor(), model.getEnemy1().getBoxLength(), model.getEnemy1().getBoxHeight()));
        view.SetEnemey2Bounds(new Rectangle(model.getEnemy2().getxCoor(), model.getEnemy2().getyCoor(), model.getEnemy2().getBoxLength(), model.getEnemy2().getBoxHeight()));
    }

    /**
     * @return the model
     */
    public NavModel getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(NavModel model) {
        this.model = model;
    }

    /**
     * @return the view
     */
    public NavView getView() {
        return view;
    }

    /**
     * @param view the view to set
     */
    public void setView(NavView view) {
        this.view = view;
    }

    /**
     * @return the tim
     */
    public Timer getTim() {
        return tim;
    }

    /**
     * @param tim the tim to set
     */
    public void setTim(Timer tim) {
        this.tim = tim;
    }

}
