package com.sample.manage.full.application.port.output

import com.sample.manage.full.application.port.output.model.RegisterUserCommand
import com.sample.manage.full.application.port.output.model.RegisterUserResult

interface RegisterUserPort {
    /**
     * ユーザーを登録する
     *
     * @param command 登録するユーザー情報
     * @return 登録されたユーザー情報
     */
    fun registerUser(command: RegisterUserCommand): RegisterUserResult
}
