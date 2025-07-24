package org.manish07.student;

import jakarta.persistence.Embeddable;

@Embeddable
public class Certificate {
    private String certificate;
    private String subject;
    private String issuer;
    private String type;
    
    public Certificate (String certificate, String subject, String issuer, String type) {
        this.certificate = certificate;
        this.subject = subject;
        this.issuer = issuer;
        this.type = type;
    }
    public Certificate(){
    
    }
    public String getCertificate () {
        return certificate;
    }
    public String getIssuer () {
        return issuer;
    }
    public String getType () {
        return type;
        
    }
    public String getSubject() {
        return subject;
    }
}
