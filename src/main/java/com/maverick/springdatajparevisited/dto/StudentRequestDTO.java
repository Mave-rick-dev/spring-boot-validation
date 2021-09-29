package com.maverick.springdatajparevisited.dto;

import com.maverick.springdatajparevisited.exception.annots.ContactNumberConstraint;
import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class StudentRequestDTO {
    @NotBlank
    @NotNull
    private String facultyId;
    @Size(min = 5)
    private String facultyName;
    @Email
    private String facultyEmail;
    @ContactNumberConstraint
    private String facultyNumber;
}
