/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anshulkumar
 */
public class FootballPlayer {
    
    private int xCoor;
    private int yCoor;
    private int boxLength;
    private int boxHeight;
    
    public FootballPlayer(int xC, int yC, int bxL, int bxH) {
        this.xCoor = xC;
        this.yCoor = yC;
        this.boxLength = bxL;
        this.boxHeight = bxH;
    }

    /**
     * @return the xCoor
     */
    public int getxCoor() {
        return xCoor;
    }

    /**
     * @param xCoor the xCoor to set
     */
    public void setxCoor(int xCoor) {
        this.xCoor = xCoor;
    }

    /**
     * @return the yCoor
     */
    public int getyCoor() {
        return yCoor;
    }

    /**
     * @param yCoor the yCoor to set
     */
    public void setyCoor(int yCoor) {
        this.yCoor = yCoor;
    }

    /**
     * @return the boxLength
     */
    public int getBoxLength() {
        return boxLength;
    }

    /**
     * @param boxLength the boxLength to set
     */
    public void setBoxLength(int boxLength) {
        this.boxLength = boxLength;
    }

    /**
     * @return the boxHeight
     */
    public int getBoxHeight() {
        return boxHeight;
    }

    /**
     * @param boxHeight the boxHeight to set
     */
    public void setBoxHeight(int boxHeight) {
        this.boxHeight = boxHeight;
    }
    
    
}
