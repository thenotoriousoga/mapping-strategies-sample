package com.sample.manage.full.application.domain.service

import com.sample.manage.full.application.port.input.RegisterUserUseCase
import com.sample.manage.full.application.port.input.mapper.toDomain
import com.sample.manage.full.application.port.input.mapper.toResult
import com.sample.manage.full.application.port.input.model.RegisterUserCommand
import com.sample.manage.full.application.port.input.model.RegisterUserResult
import com.sample.manage.full.application.port.output.RegisterUserPort
import com.sample.manage.full.application.port.output.mapper.toCommand
import com.sample.manage.full.application.port.output.mapper.toDomain
import org.springframework.stereotype.Service

@Service
class RegisterUserService(
    val registerUserPort: RegisterUserPort,
) : RegisterUserUseCase {
    override fun registerUser(command: RegisterUserCommand): RegisterUserResult {
        val user = command.toDomain()
        user.someBusinessLogic()
        user.hogeBusinessLogic()

        val registeredUser = registerUserPort.registerUser(user.toCommand())
        return registeredUser.toDomain().toResult()
    }
}
