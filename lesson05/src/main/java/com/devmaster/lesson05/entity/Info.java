package com.devmaster.lesson05.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter

@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Info {
    String name;
    String email;
    String website;
    String phone;
    String address;

    public Info(String address, String email, String name, String phone, String website) {
        this.address = address;
        this.email = email;
        this.name = name;
        this.phone = phone;
        this.website = website;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
