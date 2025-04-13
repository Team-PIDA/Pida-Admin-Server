package com.pida.storage.db.core.admin

import com.pida.admin.Admin
import com.pida.admin.AuthorityType
import com.pida.storage.db.core.support.BaseEntity
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "t_admin")
class AdminEntity(
    val loginId: String,
    val password: String,
    val authorityType: AuthorityType,
    val name: String,
) : BaseEntity() {
    fun toAdmin(): Admin =
        Admin(
            id = id!!,
            name = name,
            loginId = loginId,
            password = password,
            authorityType = authorityType,
            createdAt = createdAt,
        )
}
