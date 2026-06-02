package com.bhopalepooja862.LearningRESTAPIs.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//ye jo data anotation ye apane aap hi constructor aur getter setter bana leti hai to ise use karane ke bad hume kisi bhi chij
//ki jarurat nahi hai
@AllArgsConstructor// ye sabhi variable ke constuctor ko banata hai
@NoArgsConstructor
public class StudentDto {
    private Long id;
    private String name;
    private String email;
}
