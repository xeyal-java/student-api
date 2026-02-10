package com.example.msstudent.service;

import com.example.msstudent.dto.StudentResponseDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    //PR ucun comment yaziram

    public List<StudentResponseDto> studentsList = new ArrayList<>();

    public List<StudentResponseDto> getStudentsList() {
        return studentsList;
    }
    public void addStudent(Integer id,String firstName,String lastName){
        StudentResponseDto studentResponseDto = new StudentResponseDto();
        studentResponseDto.setId(id);
        studentResponseDto.setFirstName(firstName);
        studentResponseDto.setLastName(lastName);
        studentsList.add(studentResponseDto);
    }

    public StudentResponseDto getStudentById(Integer id){
        return studentsList.stream()
                .filter(s -> s.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void updateStudentById(Integer id, StudentResponseDto student) {
        try {
            for (StudentResponseDto s : studentsList) {
                if (s.getId().equals(id)) {
                    s.setFirstName(student.getFirstName());
                    s.setLastName(student.getLastName());
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void deleteStudentById(Integer id) {
        studentsList.removeIf(s -> s.getId().equals(id));
    }
}
