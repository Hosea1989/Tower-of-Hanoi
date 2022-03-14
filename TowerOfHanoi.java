//Name: Damien Hosea
//Assignment: Recursion Quiz
//Purpose: In this program, I am moving all of the disk from A to B using recursion
// and also using C as an Aux Tower to hold the disk to get to the other disk.

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of disk: ");
        int n = input.nextInt();

        System.out.println("The moves are: ");
        moveDisk(n, 'A', 'B', 'C');
    } //End of main

    public static void moveDisk(int n, char fromTower,char toTower, char auxTower){
        if (n == 1)
            System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
        else {
            moveDisk(n-1, fromTower,auxTower,toTower);
            System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
            moveDisk(n-1,auxTower,toTower,fromTower);
        }
    } // End of the moveDisk function
} //End of class
