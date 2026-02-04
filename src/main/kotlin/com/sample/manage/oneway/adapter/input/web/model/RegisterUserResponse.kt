package com.sample.manage.oneway.adapter.input.web.model

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import com.sample.manage.oneway.application.domain.model.state.UserState

data class RegisterUserResponse(
    @JsonProperty("user_id")
    override val id: Long,
    @JsonProperty("user_name")
    override val name: String,
    @JsonProperty("email")
    override val email: String,
    @JsonIgnore
    override val password: String? = null,
) : UserState
