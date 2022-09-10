package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;

@Entity(name = "Pincode")
public class Pincode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int pincode;
    private int count;

    public Pincode() {

    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public int getPincode() { return this.pincode; }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public int getCount() { return count; }

    public void addCount() { this.count = (this.count + 1); }
}
