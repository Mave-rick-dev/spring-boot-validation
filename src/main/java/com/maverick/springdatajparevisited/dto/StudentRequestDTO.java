package com.maverick.springdatajparevisited.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class StudentRequestDTO {
    @NotBlank
    @NotNull
    private String facultyId;
    private String facultyName;
}
