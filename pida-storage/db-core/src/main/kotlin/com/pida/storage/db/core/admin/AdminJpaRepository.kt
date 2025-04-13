package com.pida.storage.db.core.admin

import com.linecorp.kotlinjdsl.support.spring.data.jpa.repository.KotlinJdslJpqlExecutor
import org.springframework.data.jpa.repository.JpaRepository

interface AdminJpaRepository :
    JpaRepository<AdminEntity, Long>,
    KotlinJdslJpqlExecutor {
    fun findByLoginId(loginId: String): AdminEntity?

    fun existsByLoginId(loginId: String): Boolean
}
