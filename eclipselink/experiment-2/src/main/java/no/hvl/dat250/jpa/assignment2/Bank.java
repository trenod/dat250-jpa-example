package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "Bank")
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "bank")
    //private CreditCard creditcard;
    private Set<CreditCard> creditcards;

    public Bank() {

    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() { return this.name; }

    public void setName(String name) {
        this.name = name;
    }
    @CollectionTable
    public Set<CreditCard> getOwnedCards() {
        return this.creditcards;
    }

    public void addOwnedCard(CreditCard creditcard) {
        this.creditcards.add(creditcard);
    }
}
