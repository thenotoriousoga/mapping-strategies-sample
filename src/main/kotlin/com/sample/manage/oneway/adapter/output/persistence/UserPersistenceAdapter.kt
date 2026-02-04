package com.sample.manage.oneway.adapter.output.persistence

import com.sample.manage.oneway.adapter.output.persistence.entity.UsersEntity4
import com.sample.manage.oneway.adapter.output.persistence.repository.UserRepository
import com.sample.manage.oneway.application.domain.model.state.UserState
import com.sample.manage.oneway.application.port.output.RegisterUserPort
import org.springframework.stereotype.Component

@Component
class UserPersistenceAdapter(
    val userRepository: UserRepository,
) : RegisterUserPort {
    override fun registerUser(userState: UserState): UserState {
        val usersEntity =
            UsersEntity4(
                id = null,
                name = userState.name!!,
                email = userState.email!!,
                password = userState.password!!,
            )
        return userRepository.save(usersEntity)
    }
}
