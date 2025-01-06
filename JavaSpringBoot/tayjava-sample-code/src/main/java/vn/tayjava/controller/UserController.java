package vn.tayjava.controller;

import org.springframework.web.bind.annotation.*;
import vn.tayjava.dto.request.UserRequestDTO;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    // Create User
    @PostMapping
    public String addUser(@RequestBody UserRequestDTO user) {
        return "User added";
    }

    //Edit
    @PutMapping("/{userId}")
    public String updateUser(@PathVariable int userId, @RequestBody UserRequestDTO user) {
        System.out.println("Request update userId = " + userId);
        return "User updated";
    }

    @PatchMapping("/{userId}")
    public String changeStatus(@PathVariable int userId, @RequestParam boolean status) {
        System.out.println("Request change user status, userId = " + userId);
        return "User status changed";
    }

    //Delete
    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable int userId) {
        System.out.println("Request delete user, userId = " + userId);
        return "User deleted";
    }

    //Get detail by ID
    @GetMapping("/{userId}")
    public UserRequestDTO getUser(@PathVariable int userId) {
        System.out.println("Request get userId = " + userId);
        return new UserRequestDTO("khiem@gmail.com","le","Khiem","0987654321");
    }

    //Get List
    @GetMapping("/list")
    public List<UserRequestDTO> getAllUsers(
            
            @RequestParam(defaultValue = "0") int pageNo,
            @RequestParam(defaultValue = "10") int pageSize) {
        System.out.println("Request getAll users List");
        return List.of(new UserRequestDTO("manh@gmail.com","Mi","Anh","0989552145"),
                new UserRequestDTO("tanh@gmail.com","Ta","Anh","0212333654"));
    }
}
