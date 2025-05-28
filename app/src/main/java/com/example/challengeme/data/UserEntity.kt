package com.example.challengeme.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class UserEntity(
    @PrimaryKey(autoGenerate = true) val userId: Int = 0,
    val firstName: String,
    val lastName: String,
    val username: String,
    val email: String,
    val password: String,
    val gender: String?,  // "Male" or "Female"
    val dateOfBirth: String?,  // Use ISO format or convert to Date type later
    val address: String?,
    val streak_days: Int = 0,
    val achievementId: Int = 1  // Default achievement (optional)
)