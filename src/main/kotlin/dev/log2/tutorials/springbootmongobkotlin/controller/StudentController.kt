package dev.log2.tutorials.springbootmongobkotlin.controller

import dev.log2.tutorials.springbootmongobkotlin.dto.StudentRequest
import dev.log2.tutorials.springbootmongobkotlin.dto.StudentResponse
import dev.log2.tutorials.springbootmongobkotlin.dto.fromEntity
import dev.log2.tutorials.springbootmongobkotlin.service.StudentService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/students")
class StudentController(private  val studentService: StudentService) {

    @PostMapping
    fun createStudent(@RequestBody studentRequest: StudentRequest): ResponseEntity<StudentResponse> {
        return ResponseEntity.ok(fromEntity(studentService.createStudent(studentRequest)))
    }

    @GetMapping("/{id}")
    fun getStudent(@PathVariable id: String) : ResponseEntity<StudentResponse> {
        return ResponseEntity.ok(fromEntity(studentService.getStudent(id)))
    }

    @GetMapping
    fun getStudents(): ResponseEntity<List<StudentResponse>> {
        return ResponseEntity.ok(studentService.getStudents().map(::fromEntity))
    }
}