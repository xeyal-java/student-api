package com.example.msstudent.controller;

import com.example.msstudent.dto.StudentResponseDto;
import com.example.msstudent.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

public final StudentService studentService;


@GetMapping
public List<StudentResponseDto> getAllStudents(){
    return studentService.getStudentsList();
}
@GetMapping("/{id}")
public StudentResponseDto getStudentsById(@PathVariable Integer id){
    return studentService.getStudentById(id);
}
@PostMapping
@ResponseStatus(CREATED)
public void addStudent(@RequestBody StudentResponseDto student){
    studentService.addStudent(student.getId(),student.getFirstName(),student.getLastName());
    System.out.println(student);
}
@PutMapping("/{id}")
@ResponseStatus(NO_CONTENT)
    public void updateStudent(@PathVariable Integer id,@RequestBody StudentResponseDto student){
studentService.updateStudentById(id,student);
}
@DeleteMapping("/{id}")
@ResponseStatus(NO_CONTENT)
    public void deleteStudent(@PathVariable Integer id){
    studentService.deleteStudentById(id);
}


}
