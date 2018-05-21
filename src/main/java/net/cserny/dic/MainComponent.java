package net.cserny.dic;

import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {UserModule.class, BackendServiceModule.class})
public interface MainComponent {

    BackendService backendService();

    void inject(Application application);
}
