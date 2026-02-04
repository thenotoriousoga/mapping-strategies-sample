package com.sample.manage.nomapping.adapter.output.persistence.repository

import com.sample.manage.nomapping.application.domain.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long>
