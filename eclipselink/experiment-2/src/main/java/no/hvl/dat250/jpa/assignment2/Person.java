package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;
import java.util.Set;

import no.hvl.dat250.jpa.assignment2.Address;
import no.hvl.dat250.jpa.assignment2.CreditCard;

@Entity(name = "Person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany(fetch = FetchType.LAZY, targetEntity = Address.class)//mappedBy = "address_person")
    private Set<Address> addresses;
    @OneToMany(fetch = FetchType.LAZY, targetEntity = CreditCard.class)//mappedBy = "creditcard")
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

    public void setAddresses(Set<Address> addresses) { this.addresses = addresses; }

    @CollectionTable
    public Set<CreditCard> getCreditCards() {
        return this.creditcards;
    }

    public void setCreditCards(Set<CreditCard> creditcards) { this.creditcards = creditcards; }
}
