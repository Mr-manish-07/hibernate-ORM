package org.manish07.student;


import jakarta.persistence.*;

import java.util.Arrays;
import java.util.Date;

@Entity
@Table(name = "student_address")
public class Address {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private int addressId;
    
    @Column(name = "street" , nullable = false , length = 100)
    private String street;
    
    @Column(nullable = false , length = 50)
    private String city;
    
    @Column(nullable = false , length = 50)
    private String state;
    
    @Column(nullable = false , length = 6)
    private int zip;
    
    @Transient
    private int age;
    
    @Column(name = "created_date" , nullable = false)
    @Temporal (TemporalType.TIMESTAMP)
    private Date createdDate;
    
    @Lob
    private byte[] image;
    
    public Address () {
    }
    
    public void setStreet (String street) {
        this.street = street;
    }
    
    public void setCity (String city) {
        this.city = city;
    }
    
    public void setState (String state) {
        this.state = state;
    }
    
    public void setZip (int zip) {
        this.zip = zip;
    }
    
    public void setAge (int age) {
        this.age = age;
    }
    
    public void setImage (byte[] image) {
        this.image = image;
    }
    
    public void setCreatedDate (Date createdDate) {
        this.createdDate = createdDate;
    }
    
    @Override
    public String toString () {
        return "Address{" +
                "addressId=" + addressId +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", age=" + age +
                ", createdDate=" + createdDate +
                ", image=" + Arrays.toString (image) +
                '}';
    }
}
