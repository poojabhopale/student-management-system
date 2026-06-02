package com.bhopalepooja862.LearningRESTAPIs.service;
import com.bhopalepooja862.LearningRESTAPIs.dto.StudentDto;
import com.bhopalepooja862.LearningRESTAPIs.dto.AddStudentRequestDto;

import java.util.List;
import java.util.Map;

public interface StudentService {
    List<StudentDto> getAllStudent();
    StudentDto getStudentById(Long id);
    StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto);
    void deleteStudentById (Long id);
    StudentDto updateStudent(Long id, AddStudentRequestDto addStudentRequestDto);
    StudentDto updatePartialStudent(Long id, Map<String,Object> update);

}
