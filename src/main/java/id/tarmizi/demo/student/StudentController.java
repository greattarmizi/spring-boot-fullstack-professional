/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.tarmizi.demo.student;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Tarmizi
 */
@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {
    
    @GetMapping
    public List<Student> getAllStudent(){
        List<Student> students = Arrays.asList(
               new Student(
                       1L, 
                       "Tarmizi", 
                       "tarmizi@tarmizi.id", 
                       Gender.MALE),
                new Student(
                       2L, 
                       "Shine", 
                       "Shine@tarmizi.id", 
                       Gender.FEMALE)
        );
        
        return students;
    }   

            
}
