package com.sample.manage.oneway.application.domain.model.state

interface UserState {
    val id: Long?
    val name: String?
    val email: String?
    val password: String?
}
