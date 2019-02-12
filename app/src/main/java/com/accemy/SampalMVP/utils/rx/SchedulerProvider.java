package com.accemy.SampalMVP.utils.rx;

import io.reactivex.Scheduler;

/**
 * Created by anand
 */

public interface SchedulerProvider {

    Scheduler ui();

    Scheduler computation();

    Scheduler io();

}
