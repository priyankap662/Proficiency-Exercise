package com.capgemini.assignment;


import android.app.Application;

import com.capgemini.assignment.common.Common;

public class AssignmentApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Common.init(getApplicationContext(), this);
    }
}
