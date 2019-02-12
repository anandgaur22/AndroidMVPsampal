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

package com.accemy.SampalMVP.di.component;

import com.accemy.SampalMVP.di.PerActivity;
import com.accemy.SampalMVP.di.module.ActivityModule;
import com.accemy.SampalMVP.ui.about.AboutFragment;
import com.accemy.SampalMVP.ui.feed.FeedActivity;
import com.accemy.SampalMVP.ui.feed.blogs.BlogFragment;
import com.accemy.SampalMVP.ui.feed.opensource.OpenSourceFragment;
import com.accemy.SampalMVP.ui.login.LoginActivity;
import com.accemy.SampalMVP.ui.main.MainActivity;
import com.accemy.SampalMVP.ui.main.rating.RateUsDialog;
import com.accemy.SampalMVP.ui.splash.SplashActivity;

import dagger.Component;

/**
 * Created by anand
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity activity);

    void inject(LoginActivity activity);

    void inject(SplashActivity activity);

    void inject(FeedActivity activity);

    void inject(AboutFragment fragment);

    void inject(OpenSourceFragment fragment);

    void inject(BlogFragment fragment);

    void inject(RateUsDialog dialog);

}
