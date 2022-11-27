package com.example.kotlinlogopassv2.data

import com.example.kotlinlogopassv2.data.model.LoggedInUser
import java.io.IOException

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
class LoginDataSource {

    fun login(username: String, password: String): Result<LoggedInUser> {
        try {

            //  handle loggedInUser authentication
//            val fakeUser = LoggedInUser(java.util.UUID.randomUUID().toString(), "Jane Doe")
            val fakeUser = LoggedInUser("$username".toString(), "ALEX BLACK")
            if (username == MY_USER && password  == MY_PASSWORD) {
                return Result.Success(fakeUser)
            }
            return Result.Error(IOException("Error logging in", ))
        } catch (e: Throwable) {
            return Result.Error(IOException("Error logging in", e))
        }
    }

    fun logout() {
        //  revoke authentication
    }

    companion object {
        //1
        const val MY_USER = "aaa"

        //2
        const val MY_PASSWORD = "123321"

        //3
        val myConst = "something"
    }
}