package org.manish07.student;


import jakarta.persistence.*;

// Now hibernate will use My class as table name but if I want to change table name then
// I need to explicitly mention with @Table(name="") name as I keep there studentsDb

@Entity
@Table(name = "studentsDb")         //Renaming Table Name
public class Students {
    
    @Override
    public String toString () {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
  
    
    @Id                             // @Id ,the column id Consider as primary key
    private  int id ;
    
    private String name ;
    
    private String city;
    
    private Certificate certificate ;
    
    
    public Students () {
    }
    
    public int getId () {
        return id;
    }
    
    public String getName () {
        return name;
    }
    
    public String getCity () {
        return city;
    }
    @Embedded
    protected Certificate getCertificate () {
        return certificate;
    }
    
    
    public Students (int id, String name, String city, Certificate certificate) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.certificate = certificate;
    }
}
