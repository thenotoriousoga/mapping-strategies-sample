package com.sample.manage.oneway.adapter.input.web.model

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import com.sample.manage.oneway.application.domain.model.state.UserState
import jakarta.validation.constraints.NotNull

data class RegisterUserRequest(
    @JsonIgnore
    override val id: Long? = null,
    @get:NotNull
    @JsonProperty("user_name")
    override val name: String?,
    @get:NotNull
    @JsonProperty("email")
    override val email: String?,
    @get:NotNull
    @JsonProperty("password")
    override val password: String?,
) : UserState
