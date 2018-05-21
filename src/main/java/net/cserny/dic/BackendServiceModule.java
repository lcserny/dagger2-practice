package net.cserny.dic;

import dagger.Module;
import dagger.Provides;

import javax.inject.Named;
import javax.inject.Singleton;

@Module
public class BackendServiceModule {

    @Provides
    @Singleton
    BackendService provideBackendService(@Named("serverUrl") String serverUrl, User user) {
        return new BackendService(serverUrl, user);
    }

    @Provides
    @Named("serverUrl")
    String provideServerUrl() {
        return "https://www.cserny.net";
    }

    @Provides
    @Named("anotherUrl")
    String provideAnotherUrl() {
        return "https://www.another-cserny.net";
    }
}
