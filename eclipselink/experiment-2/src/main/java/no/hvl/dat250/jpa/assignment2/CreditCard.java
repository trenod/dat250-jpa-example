package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;

@Entity(name = "CreditCard")
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "bank_id")
    private Bank bank;

    private int number;
    private int balance;
    private int limit;
    @OneToOne
    private Pincode pincode;

    @ManyToOne
    @JoinColumn(name = "creditcard")
    private Person owner;

    public CreditCard() {

    }

    public int getNumber() { return this.number; }

    public void setNumber(int number) { this.number = number; }

    public int getBalance() { return this.balance; }

    public void setBalance(int balance) { this.balance = balance; }

    public int getLimit() { return this.limit; }

    public void setLimit(int limit) { this.limit = limit; }

    public Pincode getPincode() { return this.pincode; }

    public void setPincode(Pincode pincode) { this.pincode = pincode; }

    public Bank getOwningBank() {
        return this.bank;
    }

    public void setOwningBank(Bank bank) { this.bank = bank; }

    public Person getOwner() {
        return this.owner;
    }

    public void setOwner(Person person) { this.owner = owner; }
}
