package com.example.ccsd.Users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class usersController {
    

    @Autowired
    private usersService UsersService;

    @GetMapping
    public List<users> getAlluser() {
        return UsersService.getAlluser();
    }

    @GetMapping("/{id}")
    public ResponseEntity<users> getusersById(@PathVariable String id) {
        return UsersService.getusersById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public users addusers(@RequestBody users Users) {
        return UsersService.addusers(Users);
    }

    @PutMapping("/{id}")
    public ResponseEntity<users> updateusers(@PathVariable String id, @RequestBody users UsersDetails) {
        users updatedusers = UsersService.updateusers(id, UsersDetails);
        if (updatedusers != null) {
            return ResponseEntity.ok(updatedusers);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteusers(@PathVariable String id) {
        UsersService.deleteusers(id);
        return ResponseEntity.noContent().build();
    }
}
