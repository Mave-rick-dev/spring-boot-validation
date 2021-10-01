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
    //@ServicecodeConstraint
    private String servicecode;
    @NotNull
    //@

    private Double amount;
    @NotNull
    @NotBlank
    //@TopUpMobileConstraint
    private String mobileno;


}
