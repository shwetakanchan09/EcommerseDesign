package com.shweta.reyound.di.component;


import android.content.SharedPreferences;


import com.shweta.reyound.MainActivity;
import com.shweta.reyound.di.module.RetrofitModule;
import com.shweta.reyound.di.module.SharedPrefModule;
import com.shweta.reyound.di.scop.ApplicationScope;
import com.shweta.reyound.network_service.ApiInterface;

import dagger.Component;

@ApplicationScope
@Component(modules = {RetrofitModule.class, SharedPrefModule.class})
public interface ApplicationComponent {

    ApiInterface getNetworkService();

    SharedPreferences sharedPrefences();

    void inject(MainActivity mainActivity);
}

