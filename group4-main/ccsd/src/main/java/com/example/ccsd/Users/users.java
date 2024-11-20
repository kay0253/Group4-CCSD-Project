package com.example.ccsd.Users;

public class users {
    
    private String FirstName;
    private String LastName;
    private long PhoneNumber;
    private String EmailAddress;
    private String HomeAddress;
    private String Password;
    private String ProfilePicture;


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

    public long getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(long PhoneNumber) {
        if (PhoneNumber > 0){
            this.PhoneNumber = PhoneNumber;
        } else {
            System.out.println("Phone Number cannot be negative");
        }
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

    public static void main(String[] args) {
        users person = new users();
        person.setFirstName("Syafig");
        person.setLastName("Aiman");
        person.setPhoneNumber(0112345667);
        person.setEmailAddress("syafiqaiman@gmail.com");
        person.setHomeAddress("Laman Norsham");
        person.setPassword("SyafiqAiman123");
        person.setProfilePicture("Link");



        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Phone Number: " + person.getLastName());
        System.out.println("Email Address: " + person.getEmailAddress());
        System.out.println("Home Address: " + person.getHomeAddress());
        System.out.println("Password: " + person.getPassword());
        System.out.println("Profile Picture: " + person.getProfilePicture());


    }

}
