package com.kanakM.KMBlogging.model.dto;

import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignInInput {

    @Pattern(regexp = "^.+@(?![Aa][Dd][Mm][Ii][Nn]\\.[Cc][Oo][Mm]$).+$")
    private String email;
    private String password;
}
