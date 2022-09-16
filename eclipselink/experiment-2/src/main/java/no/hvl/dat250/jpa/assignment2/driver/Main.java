package no.hvl.dat250.jpa.assignment2.driver;

import no.hvl.dat250.jpa.assignment2.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static final String PERSISTENCE_UNIT_NAME = "experiment2";

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();

        // TODO: Persist object world corresponding to the domain model of experiment 2.
        EntityTransaction tx = em.getTransaction();
        //em.getTransaction().begin();
        tx.begin();
        Person person = new Person();
        person.setName("Max Mustermann");

        Address address = new Address();
        address.setStreet("Inndalsveien");
        address.setNumber(28);
        Set<Person> owners = new HashSet<>();
        owners.add(person);
        address.setOwners(owners);
        Set<Address> addresses = new HashSet<>();
        addresses.add(address);
        person.setAddresses(addresses);

        CreditCard c1 = new CreditCard();
        c1.setNumber(12345);
        c1.setBalance(-5000);
        c1.setLimit(-10000);
        c1.setOwner(person);

        CreditCard c2 = new CreditCard();
        c2.setNumber(123);
        c2.setBalance(1);
        c2.setLimit(2000);
        c2.setOwner(person);

        Set<CreditCard> creditcards = new HashSet<>();
        creditcards.add(c1);
        creditcards.add(c2);
        person.setCreditCards(creditcards);

        Pincode pincode = new Pincode();
        pincode.setPincode("123");
        pincode.setCount(1);
        c1.setPincode(pincode);
        c2.setPincode(pincode);

        Bank bank = new Bank();
        bank.setName("Pengebank");
        bank.setOwnedCards(creditcards);
        c1.setOwningBank(bank);
        c2.setOwningBank(bank);

        //persist everything
        em.persist(person);
        em.persist(address);
        em.persist(c1);
        em.persist(c2);
        em.persist(pincode);
        em.persist(bank);

        //commit() after everything is persisted
        tx.commit();
        factory.close();

    }
}
