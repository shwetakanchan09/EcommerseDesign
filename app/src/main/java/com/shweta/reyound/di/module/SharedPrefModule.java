package com.shweta.reyound.di.module;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;


import com.shweta.reyound.di.quilifier.ApplicationContext;
import com.shweta.reyound.di.scop.ApplicationScope;

import dagger.Module;
import dagger.Provides;

@Module(includes = ContextModule.class)
public class SharedPrefModule {

    @Provides
    @ApplicationScope
    SharedPreferences sharedPreferences(@ApplicationContext Context context){
        return PreferenceManager.getDefaultSharedPreferences(context);
    }
}
