package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;
import java.util.Set;

import no.hvl.dat250.jpa.assignment2.Person;

@Entity(name = "Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String street;
    @Column(name = "number_id")
    private int number;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "owners_id")
    private Set<Person> owners;

    public Address() {

    }

    public String getStreet() { return this.street; }

    public void setStreet(String street) { this.street = street; }

    public int getNumber() { return this.number; }

    public void setNumber(int number) { this.number = number; }

    @CollectionTable
    public Set<Person> getOwners() { return this.owners; }

    public void setOwners(Set<Person> persons) { this.owners = persons; }
}
