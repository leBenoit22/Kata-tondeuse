package com.github.romankh3.maventemplaterepository;

public class LawnMower {
    private int xPosition;  //The x position of the lawn mower on the garden
    private int yPosition;  //The y position of the lawn mower on the garden
    private char orientation;   //The orientation of the lawn mower on the garden
    private String instructions;    //The series of instructions the lawn mower have to follow

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public char getOrientation() {
        return orientation;
    }

    public void setOrientation(char orientation) {
        this.orientation = orientation;
    }

    public String getInstructions() {
        return instructions;
    }

    public LawnMower(int xPosition, int yPosition, char orientation, String instructions) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.orientation = orientation;
        this.instructions = instructions;
    }
}
