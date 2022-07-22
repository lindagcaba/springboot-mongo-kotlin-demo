package dev.log2.tutorials.springbootmongobkotlin.service

import dev.log2.tutorials.springbootmongobkotlin.dto.StudentRequest
import dev.log2.tutorials.springbootmongobkotlin.dto.toEntity
import dev.log2.tutorials.springbootmongobkotlin.model.Student
import dev.log2.tutorials.springbootmongobkotlin.repository.StudentRepository
import org.springframework.stereotype.Service

@Service
class StudentService(private val studentRepository: StudentRepository) {

    fun createStudent(studentRequest: StudentRequest): Student = studentRepository.save(toEntity(studentRequest))

    fun getStudents(): List<Student> = studentRepository.findAll()

    fun getStudent(id: String): Student = studentRepository.findById(id).orElseThrow()
}
