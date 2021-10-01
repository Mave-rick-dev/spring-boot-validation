package com.maverick.springdatajparevisited.dto;

import com.maverick.springdatajparevisited.exception.annots.NewPasswordConstraint;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 *  Validation of new and re-entered pwd(@NewPasswordConstraint)
 *  Validation of old pwd (pending...)
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@NewPasswordConstraint
public class PasswordReqDTO {
    @NotNull
    @NotBlank
    private String oldPwd;
    /**
     * New password must be:
     * - a-z & A-Z & 0-9
     * - range 8-14
     * - no special chars
     */

    @NotNull
    @NotBlank
    //@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\\\S+$).{8,20}$")
    private String newPwd;
    @NotNull
    @NotBlank
    private String reEnteredPwd;
}
