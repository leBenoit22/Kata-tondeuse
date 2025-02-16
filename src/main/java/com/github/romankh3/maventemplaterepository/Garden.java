package com.github.romankh3.maventemplaterepository;

public class Garden {
    private final int xSize;    //The size of the garden in the x-axis
    private final int ySize;    //The size of the garden in the y-axis
    public LawnMower lawnMower; //An object representing the lawn mower

    public Garden(int xSize, int ySize) {
        this.xSize = xSize;
        this.ySize = ySize;
    }

    /**
     * This method add a lawn mower to the garden
     * @param newLawnMower  the new lawn mower, the object that should be used in the 'move' method
     */
    public void addLawnMower(LawnMower newLawnMower){
        this.lawnMower = newLawnMower;
    }

    /**
     * This method make the lawn mower execute its suit of instructions.
     * For all the instructions, knowing the directions the lawn mower is facing, and the direction that must be
     * followed, the new direction the lawn mower is facing is deducted.
     * If the instruction to advance is executed if the lawn mower does not go out of the garden's bounds.
     * @param lawnMower the lawn mower
     * @throws Exception an exception should be lifted if an instruction given to the lawn mower is not D, G, or A
     */
    public void move(LawnMower lawnMower) throws Exception {
        for(char instruction : lawnMower.getInstructions().toCharArray()){
            switch (lawnMower.getOrientation()){
                case 'N':
                    switch (instruction){
                        case 'D':
                            lawnMower.setOrientation('E');
                            break;
                        case 'G':
                            lawnMower.setOrientation('W');
                            break;
                        case 'A':
                            if (lawnMower.getyPosition() + 1 <= ySize){
                                lawnMower.setyPosition(lawnMower.getyPosition() + 1);
                            }
                            break;
                        default:
                            throw new Exception("Error, unknown direction: " + instruction);
                    }
                    break;
                case 'E':
                    switch (instruction){
                        case 'D':
                            lawnMower.setOrientation('S');
                            break;
                        case 'G':
                            lawnMower.setOrientation('N');
                            break;
                        case 'A':
                            if (lawnMower.getxPosition() + 1 <= xSize){
                                lawnMower.setxPosition(lawnMower.getxPosition() + 1);
                            }
                            break;
                        default:
                            throw new Exception("Error, unknown direction: " + instruction);
                    }
                    break;
                case 'W':
                    switch (instruction){
                        case 'D':
                            lawnMower.setOrientation('N');
                            break;
                        case 'G':
                            lawnMower.setOrientation('S');
                            break;
                        case 'A':
                            if (lawnMower.getxPosition() - 1 >= 0){
                                lawnMower.setxPosition(lawnMower.getxPosition() - 1);
                            }
                            break;
                        default:
                            throw new Exception("Error, unknown direction: " + instruction);
                    }
                    break;
                case 'S':
                    switch (instruction){
                        case 'D':
                            lawnMower.setOrientation('W');
                            break;
                        case 'G':
                            lawnMower.setOrientation('E');
                            break;
                        case 'A':
                            if (lawnMower.getyPosition() - 1 >= 0){
                                lawnMower.setyPosition(lawnMower.getyPosition() - 1);
                            }
                            break;
                        default:
                            throw new Exception("Error, unknown direction: " + instruction);
                    }
                    break;
            }
        }
    }
}
