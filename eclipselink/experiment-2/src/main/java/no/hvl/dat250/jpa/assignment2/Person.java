package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;
import java.util.Set;

import no.hvl.dat250.jpa.assignment2.Address;
import no.hvl.dat250.jpa.assignment2.CreditCard;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany
    private Set<Address> addresses;
    @OneToMany
    private Set<CreditCard> creditcards;

    public Person() {

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @CollectionTable
    public Set<Address> getAddresses() {
        return this.addresses;
    }

    public void addAddress(Address address) { addresses.add(address); }

    @CollectionTable
    public Set<CreditCard> getCreditCards() {
        return this.creditcards;
    }

    public void addCreditCard(CreditCard creditcard) { creditcards.add(creditcard); }
}
