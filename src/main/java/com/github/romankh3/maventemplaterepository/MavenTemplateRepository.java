package com.github.romankh3.maventemplaterepository;

import java.io.FileReader;
import java.util.Scanner;

/**
 * Main class for Java Repository Template.
 */
public class MavenTemplateRepository {
    public static void main(String[] args) throws Exception {
        //Find the file containing the instructions
        Scanner scanner = new Scanner(new FileReader("src/entryFile.txt"));
        //Read the file
        StringBuilder sb = new StringBuilder();
        while(scanner.hasNext()) {
            sb.append(scanner.nextLine());
        }
        scanner.close();

        //Identify each parts of the file, separated by a space
        String [] elementsFromFile = sb.toString().split(" ");
        //First element in the file is the x size of the garden
        int gardenXSize = Integer.parseInt(elementsFromFile[0]);
        //Then it's the y size of the garden
        int gardenYSize = Integer.parseInt(elementsFromFile[1]);
        //Creation of the garden for the specified size
        Garden garden = new Garden(gardenXSize, gardenYSize);
        /*
         * Each lawn mower needs 4 elements from the entry file(x position, y position, orientation, instructions),
         * and the first two are for the size of the garden, so we can calculate the amount of lawn mower we have to
         * manage.
         */
        for (int i=0; i<(elementsFromFile.length - 2)/ 4; i++){
            //The informations for a lawn mower are stored four by four, that's why we need the index i*4
            LawnMower lawnMower = new LawnMower(Integer.parseInt(elementsFromFile[i*4+2]),
                    Integer.parseInt(elementsFromFile[i*4+3]),elementsFromFile[i*4+4].charAt(0), elementsFromFile[i*4+5]);
            //The lawn mower is added to the garden
            garden.addLawnMower(lawnMower);
            //Execute the instructions for this lawn mower
            garden.move(lawnMower);
            //Display the final position
            System.out.print(String.valueOf(lawnMower.getxPosition()).concat(" ")
                    .concat(String.valueOf(lawnMower.getyPosition())).concat(" ")
                    .concat(String.valueOf(lawnMower.getOrientation())).concat(" "));
        }
    }
}
