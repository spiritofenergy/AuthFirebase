package com.kodex.authfirebase.presientation.sign_in

data class SignInResult(
    val data: UserData?,
    val errorMassage: String?
)
data class UserData(
    val userId:String?,
    val userName: String?,
    val profilePictureUrl: String?

)