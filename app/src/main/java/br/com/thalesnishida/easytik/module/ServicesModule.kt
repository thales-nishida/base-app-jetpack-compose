package br.com.thalesnishida.easytik.module

import android.content.Context
import br.com.thalesnishida.easytik.services.CacheService
import br.com.thalesnishida.easytik.services.impl.CacheServiceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class ServicesModule {
    @Provides
    fun provideCacheService(@ApplicationContext context: Context): CacheService {
        return CacheServiceImpl(context)
    }
}