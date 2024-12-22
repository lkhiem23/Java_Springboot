package com.devmaster.SpringBoot_Lesson06.DTO;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class StudentDTO {
     Long id;
     String name;
     String email;
     int age;
}
