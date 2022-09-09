package no.hvl.dat250.jpa.assignment2.driver;

import no.hvl.dat250.jpa.assignment2.Address;
import no.hvl.dat250.jpa.assignment2.CreditCard;
import no.hvl.dat250.jpa.assignment2.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static final String PERSISTENCE_UNIT_NAME = "experiment2";

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();

        // TODO: Persist object world corresponding to the domain model of experiment 2.
        em.getTransaction().begin();
        Person person = new Person();
        person.setName("Max Mustermann");

        //should I add persist after each object!?

        Address address = new Address();
        address.setStreet("Inndalsveien");
        address.setNumber("28");
        address.addOwner(person);
        person.addAddress(address);

        CreditCard c1 = new CreditCard();


        CreditCard c2 = new CreditCard();


        person.addCreditCard(c1);
        person.addCreditCard(c2);
        /*
        assertThat(person.getCreditCards().size(), is(2));
        CreditCard firstCard = getCardWithNumber(person, 12345);
        CreditCard secondCard = getCardWithNumber(person, 123);

        assertThat(firstCard.getNumber(), is(12345));
        assertThat(firstCard.getBalance(), is(-5000));
        assertThat(firstCard.getLimit(), is(-10000));

        assertThat(secondCard.getNumber(), is(123));
        assertThat(secondCard.getBalance(), is(1));
        assertThat(secondCard.getLimit(), is(2000));
        */


        //should I commit() after everything is persisted!?

    }
}
