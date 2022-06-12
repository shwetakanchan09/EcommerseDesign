package com.shweta.reyound.di.module;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.shweta.reyound.BuildConfig;
import com.shweta.reyound.di.scop.ApplicationScope;
import com.shweta.reyound.network_service.ApiInterface;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module(includes = NetworkModule.class)
public class RetrofitModule {

    @Provides
    @ApplicationScope

    public ApiInterface networkService(Retrofit retrofit){
        return retrofit.create(ApiInterface.class);
    }
    @Provides
    @ApplicationScope
    public Retrofit retrofit(OkHttpClient okHttpClient, Converter.Factory converterFactory, CallAdapter.Factory callAdapterFactory){
        return new Retrofit.Builder()
                .addCallAdapterFactory(callAdapterFactory)
                .addConverterFactory(converterFactory)
                .client(okHttpClient)
                .baseUrl(BuildConfig.APIBASEURL)
                .build();
    }
    @Provides
    @ApplicationScope
    public Gson gson(){
        GsonBuilder builder = new GsonBuilder();
        builder.setLenient();
        return builder.create();
    }
    @Provides
    @ApplicationScope
    public Converter.Factory gsonConverterFactory(Gson gson) {
        return GsonConverterFactory.create(gson);
    }
    @Provides
    @ApplicationScope
    public CallAdapter.Factory rxJava2CallAdapterFactory(){
        return RxJava2CallAdapterFactory.create();
    }

}
