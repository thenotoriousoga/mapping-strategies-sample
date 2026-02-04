package com.sample.manage.full.application.port.output.model

data class RegisterUserResult(
    val id: Long,
    val name: String,
    val email: String,
    val password: String,
)
