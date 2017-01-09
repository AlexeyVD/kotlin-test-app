package com.avd.kotlin_test_app.di.component

import com.avd.kotlin_test_app.MainActivity
import com.avd.kotlin_test_app.di.ActivityScope
import dagger.Subcomponent

/**
 * Created by Alexey.Dementyev on 09.01.2017.
 */

@ActivityScope
@Subcomponent
public interface ActivityComponent {

    fun inject(mainActivity : MainActivity)
}