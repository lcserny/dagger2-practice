package net.cserny.dic;

import javax.inject.Inject;
import javax.inject.Named;

public class BackendService {

    private User user;
    private String serverUrl;

    @Inject
    public BackendService(@Named("serverUrl") String serverUrl, User user) {
        this.serverUrl = serverUrl;
        this.user = user;
    }

    public boolean callServer() {
        if (user != null && serverUrl != null && serverUrl.length() > 0) {
            System.out.println("User: " + user + " ServerURL: " + serverUrl);
            return true;
        }
        return false;
    }
}
