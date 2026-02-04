package com.sample.manage.nomapping.adapter.input.web

import com.sample.manage.nomapping.application.domain.model.User
import com.sample.manage.nomapping.application.port.input.RegisterUserUseCase
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("nomapping/users")
class UserController(
    val registerUserUseCase: RegisterUserUseCase,
) {
    /**
     * ユーザー登録
     *
     * @param user ユーザー情報
     * @return 登録したユーザー情報
     */
    @PostMapping
    fun registerUser(
        @RequestBody @Validated user: User,
    ): User {
        val registeredUser = registerUserUseCase.registerUser(user)
        return registeredUser
    }
}
