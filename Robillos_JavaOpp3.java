/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package robillos_javaopp3;

/**
 *
 * @author ROBILLOS_CPE113
 */
public class Robillos_JavaOpp3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create two independent wallets
        CampusWallet aly = new CampusWallet("Aly", 100);
        CampusWallet ben = new CampusWallet("Ben");

        // Display initial balances
        System.out.println("Initial balances:");
        System.out.println("Aly: " + aly.getBalance());
        System.out.println("Ben: " + ben.getBalance());

        System.out.println();
        // Aly transfers 35 credits to Ben
        System.out.println("Aly transfers 35 credits to Ben: " + aly.transferTo(ben, 35));

        System.out.println("Aly: " + aly.getBalance());
        System.out.println("Ben: " + ben.getBalance());
        
        System.out.println();
        
        // Aly tries to transfer 70 credits
        System.out.println("Aly transfers 70 credits to Ben: " + aly.transferTo(ben, 70));

        System.out.println("Aly: " + aly.getBalance());
        System.out.println("Ben: " + ben.getBalance());

        System.out.println();
        
        // Aly transfers 10 credits to her own wallet
        System.out.println("Aly transfers 10 credits to herself: " + aly.transferTo(aly, 10));
        System.out.println("Aly: " + aly.getBalance());
        System.out.println("Ben: " + ben.getBalance());

        System.out.println();
        
        // Ben deposits 15 credits
        System.out.println("Ben deposits 15 credits: " + ben.deposit(15));
        System.out.println("Aly: " + aly.getBalance());
        System.out.println("Ben: " + ben.getBalance());

        System.out.println();
        
        // Aly transfers 65 credits to Ben
        System.out.println("Aly transfers 65 credits to Ben: " + aly.transferTo(ben, 65));
        System.out.println("Aly: " + aly.getBalance());
        System.out.println("Ben: " + ben.getBalance());

        System.out.println();
        
        // Zero-credit transfer
        System.out.println("Aly transfers 0 credits to Ben: " + aly.transferTo(ben, 0));
        System.out.println("Aly: " + aly.getBalance());
        System.out.println("Ben: " + ben.getBalance());

        System.out.println();
        
        // Transfer to null
        System.out.println("Aly transfers 10 credits to null: " + aly.transferTo(null, 10));
        System.out.println("Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());
    }
    
}
