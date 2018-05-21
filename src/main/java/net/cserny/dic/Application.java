package net.cserny.dic;

import javax.inject.Inject;

public class Application {

    @Inject
    BackendService backendService;

    private MainComponent component;

    public Application() {
        component = DaggerMainComponent.builder().build();
        component.inject(this);
    }

    private void callServer() {
        boolean callServer = backendService.callServer();
        if (callServer) {
            System.out.println("Server call was successful");
        } else {
            System.out.println("Server call failed");
        }
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.callServer();
    }
}
