import java.util.*;

public class TrafficLight {
    public static void main(String[] args) {
        System.out.println("Enter the colour: Red, Green, Yellow");
        Scanner sc = new Scanner(System.in);
        String colour = sc.nextLine();
        switch (colour) {
            case "Red":
                System.out.println("STOP");
                break;
            case "Green":
                System.out.println("GO");
                break;
            case "Yellow":
                System.out.println("WAIT");
                break;
            default:
                System.out.println("The Colour is not valid");
                break;
        }
        sc.close();
    }
}