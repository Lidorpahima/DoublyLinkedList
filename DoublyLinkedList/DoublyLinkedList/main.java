package DoublyLinkedList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *  * Lidor pahima
 *  * ID : 206735971
 * The main class that contains the entry point of the program.
 */
public class main {

    /**
     * The main method that is executed when the program starts.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DoublyLinkedList<Integer> numList = new DoublyLinkedList<Integer>();
        Scanner input = new Scanner(System.in);
        Menu choice = null;
        do {
            Menu.MenuOption();
            int userInput = input.nextInt();
            choice = Menu.getOption(userInput);
            if (choice != null) {
                choice.Selected(numList);
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        } while (choice != Menu.endProgram);
    }
}

