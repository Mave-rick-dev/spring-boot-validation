package com.maverick.springdatajparevisited.dto;

import com.maverick.springdatajparevisited.exception.annots.*;
import lombok.*;

import javax.validation.constraints.*;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@TopUpConstraint
public class TopUpReqDTO {
    @NotNull
    @NotBlank
    private String servicecode;
    @NotNull
    private Double amount;
    @NotNull
    @NotBlank
    private String mobileno;


}
