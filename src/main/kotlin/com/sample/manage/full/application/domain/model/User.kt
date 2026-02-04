package com.sample.manage.full.application.domain.model

class User(
    val id: Long?,
    val name: String,
    val email: String,
    val password: String,
) {
    fun someBusinessLogic(): String = "User: $name, Email: $email"

    fun hogeBusinessLogic(): String = "Hoge logic for user $name"
}
