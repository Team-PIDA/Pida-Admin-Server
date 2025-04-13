package com.pida.admin

import java.time.LocalDateTime

data class Admin(
    val id: Long,
    val name: String,
    val loginId: String,
    val password: String,
    val authorityType: AuthorityType,
    val createdAt: LocalDateTime,
)
