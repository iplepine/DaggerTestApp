package com.zs.test.daggertestapp.model.user

import android.content.Context
import javax.inject.Inject

class UserRepository @Inject constructor(
    private val context: Context,
    private val local: UserLocalDataSource,
    private val remote: UserRemoteDataSource
) {

    fun getUserName(): String {
        return "This is a test app"
    }
}