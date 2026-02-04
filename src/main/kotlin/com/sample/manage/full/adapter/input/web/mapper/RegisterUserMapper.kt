package com.sample.manage.full.adapter.input.web.mapper

import com.sample.manage.full.adapter.input.web.model.RegisterUserRequest
import com.sample.manage.full.adapter.input.web.model.RegisterUserResponse
import com.sample.manage.full.application.port.input.model.RegisterUserCommand
import com.sample.manage.full.application.port.input.model.RegisterUserResult

internal fun RegisterUserRequest.toCommand(): RegisterUserCommand =
    RegisterUserCommand(
        name = this.name!!,
        email = this.email!!,
        password = this.password!!,
    )

internal fun RegisterUserResult.toResponse(): RegisterUserResponse =
    RegisterUserResponse(
        id = this.id,
        name = this.name,
        email = this.email,
    )
