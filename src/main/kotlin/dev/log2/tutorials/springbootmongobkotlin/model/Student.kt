package dev.log2.tutorials.springbootmongobkotlin.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(value = "students")
data class Student(@Id val id: String? = null,val firstName: String, val lastName: String, val age: Int)