package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;
import java.util.Set;

import no.hvl.dat250.jpa.assignment2.Person;

@Entity(name = "Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;
    private String number;
    @OneToMany
    private Set<Person> owners;

    public Address() {

    }

    public String getStreet() { return this.street; }

    public void setStreet(String street) { this.street = street; }

    public String getNumber() { return this.number; }

    public void setNumber(String number) { this.number = number; }

    @CollectionTable
    public Set<Person> getOwners() { return this.owners; }

    public void addOwner(Person person) { owners.add(person); }
}
