package com.maverick.springdatajparevisited.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class StudentResponseDTO {
    @NotBlank
    private String studentName;
    private String studentAddress;
}
