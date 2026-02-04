package com.sample.manage.twoway.adapter.output.persistence

import com.sample.manage.twoway.adapter.output.persistence.mapper.toDomain
import com.sample.manage.twoway.adapter.output.persistence.mapper.toEntity
import com.sample.manage.twoway.adapter.output.persistence.repository.UserRepository
import com.sample.manage.twoway.application.domain.model.User
import com.sample.manage.twoway.application.port.output.RegisterUserPort
import org.springframework.stereotype.Component

@Component
class UserPersistenceAdapter(
    val userRepository: UserRepository,
) : RegisterUserPort {
    override fun registerUser(user: User): User {
        val usersEntity = userRepository.save(user.toEntity())
        return usersEntity.toDomain()
    }
}
