package com.sample.manage.nomapping.application.domain.service

import com.sample.manage.nomapping.application.domain.model.User
import com.sample.manage.nomapping.application.port.input.RegisterUserUseCase
import com.sample.manage.nomapping.application.port.output.RegisterUserPort
import org.springframework.stereotype.Service

@Service
class RegisterUserService(
    val registerUserPort: RegisterUserPort,
) : RegisterUserUseCase {
    override fun registerUser(user: User): User {
        user.someBusinessLogic()
        user.hogeBusinessLogic()

        return registerUserPort.registerUser(user)
    }
}
