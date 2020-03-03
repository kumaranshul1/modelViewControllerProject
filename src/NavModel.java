
import java.awt.Rectangle;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anshulkumar
 */
public class NavModel {
    
    private FootballPlayer player;
    private FootballPlayer enemy1;
    private FootballPlayer enemy2;
    private int playerSpeed;
    private int enemySpeed;
    private int score;
    private int tackles;
    
    public NavModel() {
        player = new FootballPlayer(50, 230, 60, 50);
        enemy1 = new FootballPlayer(500, 50, 60, 50);
        enemy2 = new FootballPlayer(500, 425, 60, 50);
        playerSpeed = 5;
        enemySpeed = 1;
        score = 0;
        tackles = 0;
    }
    
    //Move player left
    public void MoveLeft() {
        getPlayer().setxCoor(getPlayer().getxCoor() - getPlayerSpeed());
    }
    
    //Move player right
    public void MoveRight() {
        getPlayer().setxCoor(getPlayer().getxCoor() + getPlayerSpeed());
    }
    
    //Move player up
    public void MoveUp() {
        getPlayer().setyCoor(getPlayer().getyCoor() - getPlayerSpeed());
    }
    
    //Move player down
    public void MoveDown() {
        getPlayer().setyCoor(getPlayer().getyCoor() + getPlayerSpeed());
    }
    
    //enemy movement
    public void ModelEnemyMovement() {
        if (getPlayer().getyCoor() > getEnemy1().getyCoor()) {
            getEnemy1().setyCoor(getEnemy1().getyCoor() + (1 * getEnemySpeed()));
        }
        if (getPlayer().getyCoor() <= getEnemy1().getyCoor()) {
            getEnemy1().setyCoor(getEnemy1().getyCoor() - (1 * getEnemySpeed()));
        }
        if (getPlayer().getxCoor() > getEnemy1().getxCoor()) {
            getEnemy1().setxCoor(getEnemy1().getxCoor() + (1 * getEnemySpeed()));
        }
        if (getPlayer().getxCoor() <= getEnemy1().getxCoor()) {
            getEnemy1().setxCoor(getEnemy1().getxCoor() - (1 * getEnemySpeed()));
        }
        if (getPlayer().getyCoor() > getEnemy2().getyCoor()) {
            getEnemy2().setyCoor(getEnemy2().getyCoor() + (1 * getEnemySpeed()));
        }
        if (getPlayer().getyCoor() <= getEnemy2().getyCoor()) {
            getEnemy2().setyCoor(getEnemy2().getyCoor() - (1 * getEnemySpeed()));
        }
        if (getPlayer().getxCoor() > getEnemy2().getxCoor()) {
            getEnemy2().setxCoor(getEnemy2().getxCoor() + (1 * getEnemySpeed()));
        }
        if (getPlayer().getxCoor() <= getEnemy2().getxCoor()) {
            getEnemy2().setxCoor(getEnemy2().getxCoor() - (1 * getEnemySpeed()));
        }
    }
    
    //Check enemy2 intersection and return boolean
    public boolean ModelCheckEnemy1Intersection() {
        boolean returnValue = false;
        if(new Rectangle(getPlayer().getxCoor(), getPlayer().getyCoor(), getPlayer().getBoxLength(), getPlayer().getBoxHeight()).intersects(new Rectangle(getEnemy1().getxCoor(), getEnemy1().getyCoor(), getEnemy1().getBoxLength(), getEnemy1().getBoxHeight()))) { 
            returnValue = true;
        }
        return returnValue;
    }
    
    //Check enemy2 intersection and return boolean
    public boolean ModelCheckEnemy2Intersection() {
        boolean returnValue = false;
        if(new Rectangle(getPlayer().getxCoor(), getPlayer().getyCoor(), getPlayer().getBoxLength(), getPlayer().getBoxHeight()).intersects(new Rectangle(getEnemy2().getxCoor(), getEnemy2().getyCoor(), getEnemy2().getBoxLength(), getEnemy2().getBoxHeight()))) { 
            returnValue = true;
        }
        return returnValue;
    }
    
    //Check endzone intersection and return boolean
    public boolean ModelCheckEndzoneIntersection() {
        boolean returnValue = false;
        if(new Rectangle(getPlayer().getxCoor(), getPlayer().getyCoor(), getPlayer().getBoxLength(), getPlayer().getBoxHeight()).intersects(new Rectangle(715,0,100,600))) { 
            returnValue = true;
        }
        return returnValue;
    }
    
    //increment score
    public void ScorePlus() {
        setScore(getScore() + 1);
    }
    
    //increment tackles
    public void TacklePlus() {
        setTackles(getTackles() + 1);
    }
    
    //set entities initial positions
    public void ModelSetInitPos() {
        getPlayer().setxCoor(50);
        getPlayer().setyCoor(230);
        getEnemy1().setxCoor(550);
        getEnemy1().setyCoor(50);
        getEnemy2().setxCoor(550);
        getEnemy2().setyCoor(425);
    }
    
    /**
     * @return the player
     */
    public FootballPlayer getPlayer() {
        return player;
    }

    /**
     * @param player the player to set
     */
    public void setPlayer(FootballPlayer player) {
        this.player = player;
    }

    /**
     * @return the enemy1
     */
    public FootballPlayer getEnemy1() {
        return enemy1;
    }

    /**
     * @param enemy1 the enemy1 to set
     */
    public void setEnemy1(FootballPlayer enemy1) {
        this.enemy1 = enemy1;
    }

    /**
     * @return the enemy2
     */
    public FootballPlayer getEnemy2() {
        return enemy2;
    }

    /**
     * @param enemy2 the enemy2 to set
     */
    public void setEnemy2(FootballPlayer enemy2) {
        this.enemy2 = enemy2;
    }

    /**
     * @return the playerSpeed
     */
    public int getPlayerSpeed() {
        return playerSpeed;
    }

    /**
     * @param playerSpeed the playerSpeed to set
     */
    public void setPlayerSpeed(int playerSpeed) {
        this.playerSpeed = playerSpeed;
    }

    /**
     * @return the enemySpeed
     */
    public int getEnemySpeed() {
        return enemySpeed;
    }

    /**
     * @param enemySpeed the enemySpeed to set
     */
    public void setEnemySpeed(int enemySpeed) {
        this.enemySpeed = enemySpeed;
    }

    /**
     * @return the score
     */
    public int getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * @return the tackles
     */
    public int getTackles() {
        return tackles;
    }

    /**
     * @param tackles the tackles to set
     */
    public void setTackles(int tackles) {
        this.tackles = tackles;
    }
}
