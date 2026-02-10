package com.example.msstudent.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class StudentRequestDto {

    private String firstName;
    private String lastName;
    @EqualsAndHashCode.Include
    private Integer id;

}
