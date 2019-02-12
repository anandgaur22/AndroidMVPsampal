/*
 * Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://mindorks.com/license/apache-v2
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package com.accemy.SampalMVP.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.accemy.SampalMVP.data.network.model.BlogResponse;
import com.accemy.SampalMVP.data.network.model.OpenSourceResponse;
import com.accemy.SampalMVP.di.ActivityContext;
import com.accemy.SampalMVP.di.PerActivity;
import com.accemy.SampalMVP.ui.about.AboutMvpPresenter;
import com.accemy.SampalMVP.ui.about.AboutMvpView;
import com.accemy.SampalMVP.ui.about.AboutPresenter;
import com.accemy.SampalMVP.ui.feed.FeedMvpPresenter;
import com.accemy.SampalMVP.ui.feed.FeedMvpView;
import com.accemy.SampalMVP.ui.feed.FeedPagerAdapter;
import com.accemy.SampalMVP.ui.feed.FeedPresenter;
import com.accemy.SampalMVP.ui.feed.blogs.BlogAdapter;
import com.accemy.SampalMVP.ui.feed.blogs.BlogMvpPresenter;
import com.accemy.SampalMVP.ui.feed.blogs.BlogMvpView;
import com.accemy.SampalMVP.ui.feed.blogs.BlogPresenter;
import com.accemy.SampalMVP.ui.feed.opensource.OpenSourceAdapter;
import com.accemy.SampalMVP.ui.feed.opensource.OpenSourceMvpPresenter;
import com.accemy.SampalMVP.ui.feed.opensource.OpenSourceMvpView;
import com.accemy.SampalMVP.ui.feed.opensource.OpenSourcePresenter;
import com.accemy.SampalMVP.ui.login.LoginMvpPresenter;
import com.accemy.SampalMVP.ui.login.LoginMvpView;
import com.accemy.SampalMVP.ui.login.LoginPresenter;
import com.accemy.SampalMVP.ui.main.MainMvpPresenter;
import com.accemy.SampalMVP.ui.main.MainMvpView;
import com.accemy.SampalMVP.ui.main.MainPresenter;
import com.accemy.SampalMVP.ui.main.rating.RatingDialogMvpPresenter;
import com.accemy.SampalMVP.ui.main.rating.RatingDialogMvpView;
import com.accemy.SampalMVP.ui.main.rating.RatingDialogPresenter;
import com.accemy.SampalMVP.ui.splash.SplashMvpPresenter;
import com.accemy.SampalMVP.ui.splash.SplashMvpView;
import com.accemy.SampalMVP.ui.splash.SplashPresenter;
import com.accemy.SampalMVP.utils.rx.AppSchedulerProvider;
import com.accemy.SampalMVP.utils.rx.SchedulerProvider;

import java.util.ArrayList;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by anand
 */

@Module
public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return mActivity;
    }

    @Provides
    CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }

    @Provides
    SchedulerProvider provideSchedulerProvider() {
        return new AppSchedulerProvider();
    }

    @Provides
    @PerActivity
    SplashMvpPresenter<SplashMvpView> provideSplashPresenter(
            SplashPresenter<SplashMvpView> presenter) {
        return presenter;
    }

    @Provides
    AboutMvpPresenter<AboutMvpView> provideAboutPresenter(
            AboutPresenter<AboutMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    LoginMvpPresenter<LoginMvpView> provideLoginPresenter(
            LoginPresenter<LoginMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    MainMvpPresenter<MainMvpView> provideMainPresenter(
            MainPresenter<MainMvpView> presenter) {
        return presenter;
    }

    @Provides
    RatingDialogMvpPresenter<RatingDialogMvpView> provideRateUsPresenter(
            RatingDialogPresenter<RatingDialogMvpView> presenter) {
        return presenter;
    }

    @Provides
    FeedMvpPresenter<FeedMvpView> provideFeedPresenter(
            FeedPresenter<FeedMvpView> presenter) {
        return presenter;
    }

    @Provides
    OpenSourceMvpPresenter<OpenSourceMvpView> provideOpenSourcePresenter(
            OpenSourcePresenter<OpenSourceMvpView> presenter) {
        return presenter;
    }

    @Provides
    BlogMvpPresenter<BlogMvpView> provideBlogMvpPresenter(
            BlogPresenter<BlogMvpView> presenter) {
        return presenter;
    }

    @Provides
    FeedPagerAdapter provideFeedPagerAdapter(AppCompatActivity activity) {
        return new FeedPagerAdapter(activity.getSupportFragmentManager());
    }

    @Provides
    OpenSourceAdapter provideOpenSourceAdapter() {
        return new OpenSourceAdapter(new ArrayList<OpenSourceResponse.Repo>());
    }

    @Provides
    BlogAdapter provideBlogAdapter() {
        return new BlogAdapter(new ArrayList<BlogResponse.Blog>());
    }

    @Provides
    LinearLayoutManager provideLinearLayoutManager(AppCompatActivity activity) {
        return new LinearLayoutManager(activity);
    }
}
