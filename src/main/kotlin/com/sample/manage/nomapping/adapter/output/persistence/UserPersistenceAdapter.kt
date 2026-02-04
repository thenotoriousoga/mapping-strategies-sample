package com.sample.manage.nomapping.adapter.output.persistence

import com.sample.manage.nomapping.adapter.output.persistence.repository.UserRepository
import com.sample.manage.nomapping.application.domain.model.User
import com.sample.manage.nomapping.application.port.output.RegisterUserPort
import org.springframework.stereotype.Component

@Component
class UserPersistenceAdapter(
    val userRepository: UserRepository,
) : RegisterUserPort {
    override fun registerUser(user: User): User {
        val user = userRepository.save(user)
        return user
    }
}
