package com.maverick.springdatajparevisited.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class StudentRequestDTO {
    @NotBlank
    private String facultyId;
    private String facultyName;
}
