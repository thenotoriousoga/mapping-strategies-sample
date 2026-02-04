package com.sample.manage.oneway.application.port.output

import com.sample.manage.oneway.application.domain.model.state.UserState

interface RegisterUserPort {
    /**
     * ユーザーを登録する
     *
     * @param userState 登録するユーザー情報
     * @return 登録されたユーザー情報
     */
    fun registerUser(userState: UserState): UserState
}
