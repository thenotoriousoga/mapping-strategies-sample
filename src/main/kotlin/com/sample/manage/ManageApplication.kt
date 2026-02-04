package com.sample.manage

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.FullyQualifiedAnnotationBeanNameGenerator

@SpringBootApplication
class ManageApplication

fun main(args: Array<String>) {
    runApplication<ManageApplication>(*args) {
        setBeanNameGenerator(FullyQualifiedAnnotationBeanNameGenerator())
    }
}
