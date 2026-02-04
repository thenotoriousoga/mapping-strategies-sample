package com.sample.manage.oneway.adapter.output.persistence.entity

import com.sample.manage.oneway.application.domain.model.state.UserState
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "users4")
class UsersEntity4(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    override val id: Long?,
    override val name: String,
    override val email: String,
    override val password: String,
) : UserState
