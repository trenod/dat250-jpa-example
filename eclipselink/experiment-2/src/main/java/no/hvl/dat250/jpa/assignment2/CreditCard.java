package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;

@Entity
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Bank bank;

    private int number;
    private int balance;
    private int limit;
    @OneToOne
    private Pincode pincode;

    @OneToOne
    private Person owner;

    public int getNumber() { return this.number; }

    public void setNumber(int number) { this.number = number; }

    public int getBalance() { return this.balance; }

    public void setBalance(int balance) { this.balance = balance; }

    public int getLimit() { return this.limit; }

    public void setLimit(int limit) { this.limit = limit; }

    public Pincode getPincode() { return this.pincode; }

    public void setPincode(Pincode pin) { this.pincode = pincode; }

    public Bank getOwningBank() {
        return this.bank;
    }

    public void setOwner(Person person) { this.owner = owner; }
}
