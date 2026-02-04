package com.sample.manage.oneway.adapter.output.persistence.repository

import com.sample.manage.oneway.adapter.output.persistence.entity.UsersEntity4
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<UsersEntity4, Long>
