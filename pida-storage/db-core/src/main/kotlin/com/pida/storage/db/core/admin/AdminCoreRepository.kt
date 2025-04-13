package com.pida.storage.db.core.admin

import com.pida.admin.AdminRepository
import org.springframework.stereotype.Repository

@Repository
class AdminCoreRepository(
    private val adminJpaRepository: AdminJpaRepository,
) : AdminRepository
