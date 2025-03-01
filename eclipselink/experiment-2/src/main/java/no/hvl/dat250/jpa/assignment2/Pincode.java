package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;

@Entity(name = "Pincode")
public class Pincode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pincode;
    private int count;

    public Pincode() {

    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getPincode() { return this.pincode; }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public int getCount() { return count; }

    public void setCount(int count) { this.count = count; }
}
