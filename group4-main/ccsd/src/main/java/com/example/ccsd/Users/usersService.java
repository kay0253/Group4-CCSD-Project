package com.example.ccsd.Users;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class usersService {

    @Autowired
    private usersRepository UsersRepository;

    // Getting all users
    public List<users> getAlluser() {
        return UsersRepository.findAll();
    }

    // Getting single users
    public Optional<users> getusersById(String id) {
        return UsersRepository.findById(id);
    }

    // Creating new data in repository

    public users addusers(users Users) {
        return UsersRepository.save(Users);
    }

    // Updating the users

    public users updateusers(String id, users UsersDetails) {
        Optional<users> UsersOpt = UsersRepository.findById(id);
        if (UsersOpt.isPresent()) {

            // Get from database

            users Users = UsersOpt.get();
            Users.setFirstName(UsersDetails.getFirstName());
            Users.setLastName(UsersDetails.getLastName());
            Users.setPhoneNumber(UsersDetails.getPhoneNumber());
            Users.setEmailAddress(UsersDetails.getEmailAddress());
            Users.setHomeAddress(UsersDetails.getHomeAddress());
            Users.setPassword(UsersDetails.getPassword());
            Users.setProfilePicture(UsersDetails.getProfilePicture());
            return UsersRepository.save(Users);
        }
        return null;
    }

    // Deleting
    
    public void deleteusers(String id) {
        UsersRepository.deleteById(id);
    } 
}
