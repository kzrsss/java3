package adpter;

import java.util.Scanner;

/**
 * Main Class
 * -----------
 * Demonstrates Adapter Design Pattern
 */
public class Main {

    public static void main(String[] args) {

        // Simple object (only supports full name)
        SimpleName sm = new SimpleName();

        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter your full name: ");
        String name = sc.nextLine();

        // Set simple name
        sm.setSimpleName(name);

        System.out.println("Simple Name: " + sm.getSimpleName());

        // ============================================
        // Use Adapter
        // ============================================

        // Convert SimpleName → ComplexNameInterface
        NameAdpter adapter = new NameAdpter(sm);

        // Now we can access first and last name separately
        System.out.println("First Name: " + adapter.getFname());
        System.out.println("Last Name : " + adapter.getLname());
    }
}