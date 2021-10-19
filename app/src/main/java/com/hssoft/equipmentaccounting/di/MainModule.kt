package com.hssoft.equipmentaccounting.di

import com.hssoft.equipmentaccounting.model.repositories.Repository
import com.hssoft.equipmentaccounting.model.repositories.RepositoryImpl
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