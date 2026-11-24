/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robillos_javaopp3;

/**
 *
 * @author ROBILLOS_CPE113
 */
public class CampusWallet {

    private String owner;
    private int balance;

    // Two-argument constructor
    public CampusWallet(String owner, int balance) {
        this.owner = owner;

        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    // One-argument constructor
    public CampusWallet(String owner) {
        this(owner, 0);
    }

    // Deposit credits
    public boolean deposit(int amount) {

        if (amount <= 0) {
            return false;
        }

        this.balance += amount;
        return true;
    }

    // Transfer credits to another wallet
    public boolean transferTo(CampusWallet recipient, int amount) {

        // Validate transfer conditions
        if (recipient == null
                || recipient == this
                || amount <= 0
                || amount > this.balance) {

            return false;
        }

        // Transfer credits
        this.balance -= amount;
        recipient.balance += amount;

        return true;
    }

    // Get current balance
    public int getBalance() {
        return this.balance;
    }

    // Get wallet owner
    public String getOwner() {
        return this.owner;
    }
}
