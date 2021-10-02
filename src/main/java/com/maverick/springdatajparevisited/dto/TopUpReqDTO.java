package com.maverick.springdatajparevisited.dto;

import com.maverick.springdatajparevisited.exception.annots.*;
import lombok.*;
import org.springframework.boot.context.properties.bind.DefaultValue;

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
    //@NotNull(message = "Amount must not be null!!")
    //@NotBlank
    private Double amount;
    @NotNull
    @NotBlank
    //@TopUpMobileConstraint
    private String mobileno;


}
