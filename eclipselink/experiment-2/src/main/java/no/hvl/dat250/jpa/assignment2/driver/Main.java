package no.hvl.dat250.jpa.assignment2.driver;

import no.hvl.dat250.jpa.assignment2.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

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
        em.persist(person);

        //add persist after each object

        Address address = new Address();
        address.setStreet("Inndalsveien");
        address.setNumber("28");
        address.addOwner(person);
        em.persist(address);
        person.addAddress(address);

        CreditCard c1 = new CreditCard();
        c1.setNumber(12345);
        c1.setBalance(-5000);
        c1.setLimit(-10000);

        CreditCard c2 = new CreditCard();
        c1.setNumber(123);
        c1.setBalance(1);
        c1.setLimit(2000);

        em.persist(c1);
        em.persist(c2);

        person.addCreditCard(c1);
        person.addCreditCard(c2);

        Pincode pincode = new Pincode();
        pincode.setPincode(123);
        pincode.setCount(1);
        em.persist(pincode);

        c1.setPincode(pincode);
        c2.setPincode(pincode);

        Bank bank = new Bank();
        bank.setName("Pengebank");
        em.persist(bank);

        c1.setOwningBank(bank);
        c2.setOwningBank(bank);




        //commit() after everything is persisted
        tx.commit();
        factory.close();
        em.close();

    }
}
