package com.sample.manage.twoway.adapter.output.persistence.mapper

import com.sample.manage.twoway.adapter.output.persistence.entity.UsersEntity2
import com.sample.manage.twoway.application.domain.model.User

fun User.toEntity(): UsersEntity2 =
    UsersEntity2(
        id = this.id,
        name = this.name,
        email = this.email,
        password = this.password,
    )

fun UsersEntity2.toDomain(): User =
    User(
        id = this.id,
        name = this.name,
        email = this.email,
        password = this.password,
    )
