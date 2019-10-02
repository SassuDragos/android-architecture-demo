package com.example.kotlinindependent.datamodels

sealed class UserState {
    class AuthenticatedState(val user: User): UserState()
    object NotAuthenticatedState: UserState()
}