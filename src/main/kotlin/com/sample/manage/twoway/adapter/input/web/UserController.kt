package com.sample.manage.twoway.adapter.input.web

import com.sample.manage.twoway.adapter.input.web.model.RegisterUserRequest
import com.sample.manage.twoway.adapter.input.web.model.RegisterUserResponse
import com.sample.manage.twoway.application.port.input.RegisterUserUseCase
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import toDomain
import toResponse

@RestController
@RequestMapping("twoway/users")
class UserController(
    val registerUserUseCase: RegisterUserUseCase,
) {
    /**
     * ユーザー登録
     *
     * @param request ユーザー情報リクエスト
     * @return 登録したユーザー情報レスポンス
     */
    @PostMapping
    fun registerUser(
        @RequestBody @Validated request: RegisterUserRequest,
    ): RegisterUserResponse {
        val registeredUser = registerUserUseCase.registerUser(request.toDomain())
        return registeredUser.toResponse()
    }
}
