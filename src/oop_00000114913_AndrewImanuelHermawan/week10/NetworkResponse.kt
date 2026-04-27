package oop_00000114913_AndrewImanuelHermawan.week10

data class ApiResponse<T>(
    val status: String,
    val data: T
)