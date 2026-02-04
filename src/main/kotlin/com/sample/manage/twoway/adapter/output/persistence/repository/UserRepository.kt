package com.sample.manage.twoway.adapter.output.persistence.repository

import com.sample.manage.twoway.adapter.output.persistence.entity.UsersEntity2
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<UsersEntity2, Long>
