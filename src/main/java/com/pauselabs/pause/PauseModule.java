package com.pauselabs.pause;

import com.pauselabs.pause.core.PostFromAnyThreadBus;
import com.pauselabs.pause.listeners.PauseSmsListener;
import com.pauselabs.pause.listeners.SilenceListener;
import com.pauselabs.pause.listeners.SpeechListener;
import com.pauselabs.pause.models.JsonReader;
import com.pauselabs.pause.models.PauseSession;
import com.pauselabs.pause.models.StringRandomizer;
import com.pauselabs.pause.services.PauseApplicationService;
import com.pauselabs.pause.services.PauseSessionService;
import com.pauselabs.pause.ui.BlacklistActivity;
import com.pauselabs.pause.ui.BlacklistFragment;
import com.pauselabs.pause.ui.HomeActivity;
import com.pauselabs.pause.ui.MainActivity;
import com.pauselabs.pause.ui.OnBoardingActivity;
import com.pauselabs.pause.ui.SettingsLayout;
import com.squareup.otto.Bus;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Dagger module for setting up provides statements.
 * Register all of your entry points below.
 */
@Module(
        complete = false,

        injects = {
                PauseApplication.class,
                MainActivity.class,
                HomeActivity.class,
                SettingsLayout.class,
                PauseSessionService.class,
                PauseApplicationService.class,
                BlacklistActivity.class,
                BlacklistFragment.class,
                PauseSession.class,
                StringRandomizer.class,
                JsonReader.class,
                OnBoardingActivity.class,
                SpeechListener.class,
                SilenceListener.class,
                PauseSmsListener.class
        }
)
public class PauseModule {

    @Singleton
    @Provides
    Bus provideOttoBus() {
        return new PostFromAnyThreadBus();
    }
}