package com.sample.manage.oneway.application.domain.service

import com.sample.manage.oneway.application.domain.model.User
import com.sample.manage.oneway.application.domain.model.state.UserState
import com.sample.manage.oneway.application.port.input.RegisterUserUseCase
import com.sample.manage.oneway.application.port.output.RegisterUserPort
import org.springframework.stereotype.Service

@Service
class RegisterUserService(
    val registerUserPort: RegisterUserPort,
) : RegisterUserUseCase {
    override fun registerUser(userState: UserState): UserState {
        val user =
            User(
                id = null,
                name = userState.name!!,
                email = userState.email!!,
                password = userState.password!!,
            )

        user.someBusinessLogic()
        user.hogeBusinessLogic()

        return registerUserPort.registerUser(user)
    }
}
