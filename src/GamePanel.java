
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
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
public class GamePanel extends JPanel {
    
    private JButton playerButton;
    private JButton enemyButton1;
    private JButton enemyButton2;
    private JButton team1, team2, team3, text;
    private JFrame popup;
    private Image fieldImage;
    private ImageIcon enemy, team1Icon, team2Icon, team3Icon;
    
    public GamePanel() {
        super();
        
        try {
            fieldImage = ImageIO.read(new File("images/field.jpeg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        team1Icon = new ImageIcon("images/team1Icon.png");
        team2Icon = new ImageIcon("images/team2Icon.png");
        team3Icon = new ImageIcon("images/team3Icon.png");
        enemy = new ImageIcon("images/enemy.png");

        
        popup = new JFrame();
        
        playerButton = new JButton(team1Icon);
        enemyButton1 = new JButton(enemy);
        enemyButton2 = new JButton(enemy);
        text = new JButton("Choose a speed and team to start. Use arrow keys to control the running back.");
        team1 = new JButton("Penn State");
        team2 = new JButton("Louisville");
        team3 = new JButton("Virginia Tech");
        
        playerButton.setBorder(BorderFactory.createEmptyBorder());
        enemyButton1.setBorder(BorderFactory.createEmptyBorder());
        enemyButton2.setBorder(BorderFactory.createEmptyBorder());
        
        playerButton.setBounds(new Rectangle(50, 230, 60, 50));
        enemyButton1.setBounds(new Rectangle(500, 50, 60, 50));
        enemyButton2.setBounds(new Rectangle(500, 425, 60, 50));
        text.setBounds(new Rectangle(100,200,600,50));
        team1.setBounds(new Rectangle(75, 300,100,64));
        team2.setBounds(new Rectangle(341, 300,100,64));
        team3.setBounds(new Rectangle(605, 300,100,64));
        
        
        
        setLayout(null);
        add(playerButton);
        add(enemyButton1);
        add(enemyButton2);
        add(text);
        add(team1);
        add(team2);
        add(team3);
        setFocusable(true);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(fieldImage, 0, 0, null);
        requestFocusInWindow(); 
    }

    /**
     * @return the playerButton
     */
    public JButton getPlayerButton() {
        return playerButton;
    }

    /**
     * @param playerButton the playerButton to set
     */
    public void setPlayerButton(JButton playerButton) {
        this.playerButton = playerButton;
    }

    /**
     * @return the enemyButton1
     */
    public JButton getEnemyButton1() {
        return enemyButton1;
    }

    /**
     * @param enemyButton1 the enemyButton1 to set
     */
    public void setEnemyButton1(JButton enemyButton1) {
        this.enemyButton1 = enemyButton1;
    }

    /**
     * @return the enemyButton2
     */
    public JButton getEnemyButton2() {
        return enemyButton2;
    }

    /**
     * @param enemyButton2 the enemyButton2 to set
     */
    public void setEnemyButton2(JButton enemyButton2) {
        this.enemyButton2 = enemyButton2;
    }

    /**
     * @return the popup
     */
    public JFrame getPopup() {
        return popup;
    }

    /**
     * @param popup the popup to set
     */
    public void setPopup(JFrame popup) {
        this.popup = popup;
    }

    /**
     * @return the team1
     */
    public JButton getTeam1() {
        return team1;
    }

    /**
     * @param team1 the team1 to set
     */
    public void setTeam1(JButton team1) {
        this.team1 = team1;
    }

    /**
     * @return the team2
     */
    public JButton getTeam2() {
        return team2;
    }

    /**
     * @param team2 the team2 to set
     */
    public void setTeam2(JButton team2) {
        this.team2 = team2;
    }

    /**
     * @return the team3
     */
    public JButton getTeam3() {
        return team3;
    }

    /**
     * @param team3 the team3 to set
     */
    public void setTeam3(JButton team3) {
        this.team3 = team3;
    }

    /**
     * @return the text
     */
    public JButton getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(JButton text) {
        this.text = text;
    }

    /**
     * @return the fieldImage
     */
    public Image getFieldImage() {
        return fieldImage;
    }

    /**
     * @param fieldImage the fieldImage to set
     */
    public void setFieldImage(Image fieldImage) {
        this.fieldImage = fieldImage;
    }

    /**
     * @return the enemy
     */
    public ImageIcon getEnemy() {
        return enemy;
    }

    /**
     * @param enemy the enemy to set
     */
    public void setEnemy(ImageIcon enemy) {
        this.enemy = enemy;
    }

    /**
     * @return the team1Icon
     */
    public ImageIcon getTeam1Icon() {
        return team1Icon;
    }

    /**
     * @param team1Icon the team1Icon to set
     */
    public void setTeam1Icon(ImageIcon team1Icon) {
        this.team1Icon = team1Icon;
    }

    /**
     * @return the team2Icon
     */
    public ImageIcon getTeam2Icon() {
        return team2Icon;
    }

    /**
     * @param team2Icon the team2Icon to set
     */
    public void setTeam2Icon(ImageIcon team2Icon) {
        this.team2Icon = team2Icon;
    }

    /**
     * @return the team3Icon
     */
    public ImageIcon getTeam3Icon() {
        return team3Icon;
    }

    /**
     * @param team3Icon the team3Icon to set
     */
    public void setTeam3Icon(ImageIcon team3Icon) {
        this.team3Icon = team3Icon;
    }
}
