package vn.tayjava.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;
import vn.tayjava.util.PhoneNumber;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class UserRequestDTO implements Serializable {

    @NotBlank(message = "firstName must be not blank")
    private String firstName;

    @NotNull(message = "lastName must be not null")
    private String lastName;

    @Email(message = "Email invalid format")
    private String email;

    // @Pattern(regexp = "^\\d{10}$", message = "Phone invalid format")
    // @Phone
    @PhoneNumber
    private String phone;


    @NotNull(message = "dateOfBirth invalid format")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern = "mm/dd/yyyy")
    private Date dateOfBirth;

    // @NotEmpty
    List<String> permissions;


    public UserRequestDTO(){

    }

    public UserRequestDTO(String email, String firstName, String lastName, String phone) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
    }

    public @NotNull(message = "dateOfBirth invalid format") Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(@NotNull(message = "dateOfBirth invalid format") Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public @Email(message = "Email invalid format") String getEmail() {
        return email;
    }

    public void setEmail(@Email(message = "Email invalid format") String email) {
        this.email = email;
    }

    public @NotBlank(message = "firstName must be not blank") String getFirstName() {
        return firstName;
    }

    public void setFirstName(@NotBlank(message = "firstName must be not blank") String firstName) {
        this.firstName = firstName;
    }

    public @NotNull(message = "lastName must be not null") String getLastName() {
        return lastName;
    }

    public void setLastName(@NotNull(message = "lastName must be not null") String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }


    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }
}
