package com.bhopalepooja862.LearningRESTAPIs.controller;
import com.bhopalepooja862.LearningRESTAPIs.dto.StudentDto;


import com.bhopalepooja862.LearningRESTAPIs. service.StudentService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.bhopalepooja862.LearningRESTAPIs.entity.Student;

import java.util.List;
import java.util.Map;

import com.bhopalepooja862.LearningRESTAPIs.dto.AddStudentRequestDto;

@RestController// restcontoller do notation se milakar bana hai controller and response body isame controller http ki
// request leta hai response body use json ke form return karati hai
@RequiredArgsConstructor
@RequestMapping("/api/Students")

public class StudentController {
    private final StudentService studentService;

    @GetMapping
    public ResponseEntity<List<StudentDto>> getAllStudent() {
        //return ResponseEntity.status(HttpStatus.OK).body(StudentService.getAllStudents());

        return ResponseEntity.ok(studentService.getAllStudent());
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable("id") Long id) {
        //return ResponseEntity.status(HttpStatus.OK).body(StudentService.getAllStudents());
        return ResponseEntity.ok(studentService.getStudentById(id));
    }

    @PostMapping
    public ResponseEntity<StudentDto> createNewStudent(  @Valid @RequestBody   AddStudentRequestDto addStudentRequestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.createNewStudent(addStudentRequestDto));
    }
     @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAStudent(@PathVariable("id") Long id){
        studentService.deleteStudentById(id);
        return ResponseEntity.noContent().build();
     }
     @PutMapping("/{id}")// student ko pura update karane ke liye use krana padata hai
    public ResponseEntity<StudentDto> updateStudent(@PathVariable ("id") Long id,
                                                  @Valid @RequestBody  AddStudentRequestDto addStudentRequestDto){
        return ResponseEntity.ok(studentService.updateStudent(  id ,addStudentRequestDto));
     }
     @PatchMapping("/{id}")//partial update karane ke liye use kiya jata hai
           public ResponseEntity<StudentDto> updatePartialStudent (@PathVariable("id")Long id,
                                                                  @Valid @RequestBody Map <String,Object>update){
                        return ResponseEntity.ok(studentService.updatePartialStudent(id,update));

     }

}




