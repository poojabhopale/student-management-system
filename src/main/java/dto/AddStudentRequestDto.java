package com.bhopalepooja862.LearningRESTAPIs.dto;

import jakarta.validation.constraints.*;
import lombok.*;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Getter
@Setter

public class AddStudentRequestDto {
@NotBlank(message = "name should be required")
@Size(min =3,message = "Name Must be at least 3 Characters")
    private String name;
    @Email
    @NotBlank(message = "Email Should be required ")
    private String email;


    }


