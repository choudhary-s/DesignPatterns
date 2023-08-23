package typesofpatterns.structural.proxy;

import java.util.HashSet;
import java.util.Set;

public class ProxyInternet implements Internet {
    Set<String> bannedUrls = new HashSet<>();
    RealInternet realInternet = new RealInternet();
    {
        bannedUrls.add("abc.com");
        bannedUrls.add("xyz.com");
    }
    @Override
    public void connectTo(String url) {
        if(bannedUrls.contains(url)){
            System.out.println(url+" url is banned");
            return;
        }
        realInternet.connectTo(url);
    }
}
