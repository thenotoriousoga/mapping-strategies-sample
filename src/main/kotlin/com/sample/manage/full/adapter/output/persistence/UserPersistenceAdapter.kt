package com.sample.manage.full.adapter.output.persistence

import com.sample.manage.full.adapter.output.persistence.mapper.toEntity
import com.sample.manage.full.adapter.output.persistence.mapper.toResult
import com.sample.manage.full.adapter.output.persistence.repository.UserRepository
import com.sample.manage.full.application.port.output.RegisterUserPort
import com.sample.manage.full.application.port.output.model.RegisterUserCommand
import com.sample.manage.full.application.port.output.model.RegisterUserResult
import org.springframework.stereotype.Component

@Component
class UserPersistenceAdapter(
    val userRepository: UserRepository,
) : RegisterUserPort {
    override fun registerUser(command: RegisterUserCommand): RegisterUserResult {
        val usersEntity = userRepository.save(command.toEntity())
        return usersEntity.toResult()
    }
}
