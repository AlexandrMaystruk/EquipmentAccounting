package com.hssoft.equipmentaccounting.di

import com.hssoft.equipmentaccounting.domain.repositories.Repository
import com.hssoft.equipmentaccounting.data.RepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

@Module
@InstallIn(ActivityRetainedComponent::class)
abstract class MainModule {

    @Binds
    abstract fun bindRepository(impl: RepositoryImpl): Repository

}