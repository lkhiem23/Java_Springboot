package vn.tayjava.dto.request;

import java.io.Serializable;

public class UserRequestDTO implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    public UserRequestDTO(){

    }

    public UserRequestDTO(String email, String firstName, String lastName, String phone) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }
}
