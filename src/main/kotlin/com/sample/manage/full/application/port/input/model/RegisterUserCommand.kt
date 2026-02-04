package com.sample.manage.full.application.port.input.model

data class RegisterUserCommand(
    val name: String,
    val email: String,
    val password: String,
)
