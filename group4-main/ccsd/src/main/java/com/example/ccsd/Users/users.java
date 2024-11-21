package com.example.ccsd.Users;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "users")
public class users {
    
    @Id
    private String id;
    private String FirstName;
    private String LastName;
    private String PhoneNumber;
    private String EmailAddress;
    private String HomeAddress;
    private String Password;
    private String ProfilePicture;

    public users() {}

    public users(String FirstName, String LastName, String PhoneNumber, String EmailAddress, String HomeAddress, String Password, String ProfilePicture) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.PhoneNumber = PhoneNumber;
        this.EmailAddress = EmailAddress;
        this.HomeAddress = HomeAddress;
        this.Password = Password;
        this.ProfilePicture =ProfilePicture;

    }
        
    public String getId() {
        return id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    public String getHomeAddress() {
        return HomeAddress;
    }

    public void setHomeAddress(String HomeAddress) {
        this.HomeAddress = HomeAddress;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getProfilePicture() {
        return ProfilePicture;
    }

    public void setProfilePicture(String ProfilePicture) {
        this.ProfilePicture =ProfilePicture;
    }

}
