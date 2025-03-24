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

}
