package net.cserny.dic;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class UserModule {

    @Provides
    @Singleton
    User provideUser() {
        return new User("Leonardo", "Cserny");
    }
}
