package dev.log2.tutorials.springbootmongobkotlin.dto

import dev.log2.tutorials.springbootmongobkotlin.model.Student

data class StudentRequest(val firstName: String, val lastName: String, val age: Int)
data class StudentResponse(val id: String?, val firstName: String, val lastName: String, val age: Int)

fun fromEntity(student: Student): StudentResponse {
    return StudentResponse(student.id, student.firstName, student.lastName, student.age)
}

fun toEntity(studentRequest: StudentRequest) : Student{
    return Student(firstName = studentRequest.firstName, lastName = studentRequest.lastName, age = studentRequest.age)
}