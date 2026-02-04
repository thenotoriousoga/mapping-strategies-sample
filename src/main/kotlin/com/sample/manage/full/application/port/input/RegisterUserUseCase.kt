package com.sample.manage.full.application.port.input

import com.sample.manage.full.application.port.input.model.RegisterUserCommand
import com.sample.manage.full.application.port.input.model.RegisterUserResult

interface RegisterUserUseCase {
    /**
     * ユーザーを登録する
     *
     * @param command 登録するユーザー情報
     * @return 登録されたユーザー情報
     */
    fun registerUser(command: RegisterUserCommand): RegisterUserResult
}
