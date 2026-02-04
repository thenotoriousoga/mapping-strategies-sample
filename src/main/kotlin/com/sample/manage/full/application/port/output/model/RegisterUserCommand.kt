package com.sample.manage.full.application.port.output.model

data class RegisterUserCommand(
    val name: String,
    val email: String,
    val password: String,
)
