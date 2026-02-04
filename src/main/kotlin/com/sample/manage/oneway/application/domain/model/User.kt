package com.sample.manage.oneway.application.domain.model

import com.sample.manage.oneway.application.domain.model.state.UserState

class User(
    override val id: Long?,
    override val name: String,
    override val email: String,
    override val password: String,
) : UserState {
    fun someBusinessLogic(): String = "User: $name, Email: $email"

    fun hogeBusinessLogic(): String = "Hoge logic for user $name"
}
