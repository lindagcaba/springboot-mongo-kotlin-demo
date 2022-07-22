package dev.log2.tutorials.springbootmongobkotlin.repository

import dev.log2.tutorials.springbootmongobkotlin.model.Student
import org.springframework.data.mongodb.repository.MongoRepository

interface StudentRepository : MongoRepository<Student, String>