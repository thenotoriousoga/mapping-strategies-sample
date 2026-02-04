package com.sample.manage.full.adapter.output.persistence.mapper

import com.sample.manage.full.adapter.output.persistence.entity.UsersEntity3
import com.sample.manage.full.application.port.output.model.RegisterUserCommand
import com.sample.manage.full.application.port.output.model.RegisterUserResult

fun RegisterUserCommand.toEntity(): UsersEntity3 =
    UsersEntity3(
        id = null,
        name = this.name,
        email = this.email,
        password = this.password,
    )

fun UsersEntity3.toResult(): RegisterUserResult =
    RegisterUserResult(
        id = this.id!!,
        name = this.name,
        email = this.email,
        password = this.password,
    )
