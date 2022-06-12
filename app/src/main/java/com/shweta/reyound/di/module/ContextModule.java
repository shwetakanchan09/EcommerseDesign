package com.shweta.reyound.di.module;

import android.content.Context;


import com.shweta.reyound.di.quilifier.ApplicationContext;
import com.shweta.reyound.di.scop.ApplicationScope;

import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {
    private final Context context;
    public ContextModule(Context context) {
        this.context = context.getApplicationContext();
    }

    @Provides
    @ApplicationScope
    @ApplicationContext
    public Context context() {
        return context;
    }
}
