package ee.ringit.userManagement.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

    // GET, POST save(), DELETE deleteAll(), delete(userId), PUT/PATCH for updating

    // Get all users findAll()
    // Get single user userId findById(userId)

    @GetMapping
    public String getUsers() {
        System.out.println("anna kasutajad");
        return "users/list";
    }

}

