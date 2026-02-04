package com.sample.manage.full.application.port.output.mapper

import com.sample.manage.full.application.domain.model.User
import com.sample.manage.full.application.port.output.model.RegisterUserCommand
import com.sample.manage.full.application.port.output.model.RegisterUserResult

internal fun User.toCommand(): RegisterUserCommand =
    RegisterUserCommand(
        name = this.name,
        email = this.email,
        password = this.password,
    )

internal fun RegisterUserResult.toDomain(): User =
    User(
        id = this.id,
        name = this.name,
        email = this.email,
        password = this.password,
    )
