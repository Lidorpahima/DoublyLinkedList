package DoublyLinkedList;
import java.util.Scanner;

/**
 *  * Lidor pahima
 *  * ID : 206735971
 * The Menu enum represents the available menu options.
 */
public enum Menu {

    addFirst(1, "Add number first spot"),
    addLast(2, "Add number last spot"),
    remove(3, "Remove number"),
    clear(4, "Clear all the numbers"),
    contain(5, "Check if contain the number"),
    printForwards(6, "Print all the numbers forward"),
    printBackward(7, "Print all the numbers backward"),
    endProgram(8, "End program");

    int choice;
    String description;

    /**
     * Constructs a Menu option with the specified choice and description.
     *
     * @param choice      the numerical choice for the menu option
     * @param description the description of the menu option
     */
    Menu(int choice, String description) {
        this.choice = choice;
        this.description = description;
    }

    /**
     * Sets the choice for the menu option.
     *
     * @param choice the numerical choice to set
     */
    public void setChoice(int choice) {
        this.choice = choice;
    }

    /**
     * Returns the description of the menu option.
     *
     * @return the description of the menu option
     */
    public String getDescription() {
        return description;
    }

    /**
     * Returns the numerical choice of the menu option.
     *
     * @return the numerical choice of the menu option
     */
    public int getChoice() {
        return choice;
    }

    /**
     * Displays the menu options.
     */
    public static void MenuOption() {
        System.out.println("Enter the number corresponding to the action you want to perform:");
        for (Menu option : Menu.values()) {
            System.out.println(option.getChoice() + ". " + option.getDescription());
        }
    }

    /**
     * Returns the Menu option corresponding to the user's input.
     *
     * @param userInput the user's input
     * @return the Menu option corresponding to the user's input, or null if not found
     */
    public static Menu getOption(int userInput) {
        for (Menu option : Menu.values()) {
            if (option.getChoice() == userInput) {
                return option;
            }
        }
        return null;
    }

    /**
     * Performs the selected action based on the menu option.
     *
     * @param Numbers the DoublyLinkedList of numbers
     */
    public void Selected(DoublyLinkedList<Integer> Numbers) {
        Scanner input = new Scanner(System.in);
        switch (this) {
            case addFirst:
                System.out.println("Enter the number you want to add at the beginning:");
                int number = input.nextInt();
                addFirst(number, Numbers);
                break;
            case addLast:
                System.out.println("Enter the number you want to add at the end:");
                number = input.nextInt();
                addLast(number, Numbers);
                break;
            case remove:
                System.out.println("Enter the number you want to remove:");
                number = input.nextInt();
                remove(number, Numbers);
                break;
            case clear:
                clear(Numbers);
                break;
            case contain:
                System.out.println("Enter the number you want to check for:");
                number = input.nextInt();
                contain(number, Numbers);
                break;
            case printForwards:
                printForwards(Numbers);
                break;
            case printBackward:
                printBackward(Numbers);
                break;
            case endProgram:
                endProgram();
                break;
        }
    }

    /**
     * Adds a number to the beginning of the DoublyLinkedList.
     *
     * @param number  the number to add
     * @param Numbers the DoublyLinkedList of numbers
     */
    public static void addFirst(int number, DoublyLinkedList<Integer> Numbers) {
        Numbers.addFirst(number);
        System.out.println("The updated list of numbers:");
        printBackward(Numbers);
    }

    /**
     * Adds a number to the end of the DoublyLinkedList.
     *
     * @param number  the number to add
     * @param Numbers the DoublyLinkedList of numbers
     */
    public static void addLast(int number, DoublyLinkedList<Integer> Numbers) {
        Numbers.addLast(number);
    }

    /**
     * Removes a number from the DoublyLinkedList.
     *
     * @param number  the number to remove
     * @param Numbers the DoublyLinkedList of numbers
     */
    public static void remove(int number, DoublyLinkedList<Integer> Numbers) {
        Numbers.remove(number);
        System.out.println("The updated list of numbers:");
        printForwards(Numbers);
    }

    /**
     * Clears all the numbers from the DoublyLinkedList.
     *
     * @param Numbers the DoublyLinkedList of numbers
     */
    public static void clear(DoublyLinkedList<Integer> Numbers) {
        Numbers.clear();
    }

    /**
     * Checks if the DoublyLinkedList contains a specific number.
     *
     * @param number  the number to check
     * @param Numbers the DoublyLinkedList of numbers
     */
    public static void contain(int number, DoublyLinkedList<Integer> Numbers) {
        System.out.println(Numbers.contains(number));
    }

    /**
     * Prints all the numbers in the DoublyLinkedList in forward order.
     *
     * @param Numbers the DoublyLinkedList of numbers
     */
    public static void printForwards(DoublyLinkedList<Integer> Numbers) {
        Numbers.printForwards();
    }

    /**
     * Prints all the numbers in the DoublyLinkedList in backward order.
     *
     * @param Numbers the DoublyLinkedList of numbers
     */
    public static void printBackward(DoublyLinkedList<Integer> Numbers) {
        Numbers.printBackward();
    }

    /**
     * Ends the program execution.
     */
    public static void endProgram() {
        System.exit(0);
    }
}