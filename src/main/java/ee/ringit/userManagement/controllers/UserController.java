package ee.ringit.userManagement.controllers;

import ee.ringit.userManagement.models.User;
import ee.ringit.userManagement.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    // GET, POST save(), DELETE deleteAll(), delete(userId), PUT/PATCH for updating

    // Get all users findAll()
    // Get single user userId findById(userId)


    // TODO @DeleteMapping, needs userId as input
    // TODO @PostMapping, needs user object, first/last names, email and password as input

    @GetMapping
    public String getUsers(Model model) {
        model.addAttribute("users", userRepository.findAll());
        System.out.println("anna kasutajad");
        return "users/list";
    }

}
