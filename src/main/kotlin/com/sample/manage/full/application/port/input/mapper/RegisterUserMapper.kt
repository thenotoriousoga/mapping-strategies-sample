package com.sample.manage.full.application.port.input.mapper

import com.sample.manage.full.application.domain.model.User
import com.sample.manage.full.application.port.input.model.RegisterUserCommand
import com.sample.manage.full.application.port.input.model.RegisterUserResult

internal fun RegisterUserCommand.toDomain(): User =
    User(
        id = null,
        name = this.name,
        email = this.email,
        password = this.password,
    )

internal fun User.toResult(): RegisterUserResult =
    RegisterUserResult(
        id = this.id!!,
        name = this.name,
        email = this.email,
    )
