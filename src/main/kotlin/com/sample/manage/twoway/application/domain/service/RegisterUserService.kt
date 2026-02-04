package com.sample.manage.twoway.application.domain.service

import com.sample.manage.twoway.application.domain.model.User
import com.sample.manage.twoway.application.port.input.RegisterUserUseCase
import com.sample.manage.twoway.application.port.output.RegisterUserPort
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
