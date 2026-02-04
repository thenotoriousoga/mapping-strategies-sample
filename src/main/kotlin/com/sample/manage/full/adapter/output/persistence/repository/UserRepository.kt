package com.sample.manage.full.adapter.output.persistence.repository

import com.sample.manage.full.adapter.output.persistence.entity.UsersEntity3
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<UsersEntity3, Long>
