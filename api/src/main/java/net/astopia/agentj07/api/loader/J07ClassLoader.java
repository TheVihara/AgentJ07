package net.astopia.agentj07.api.loader;

import java.net.URL;
import java.net.URLClassLoader;

public class J07ClassLoader extends URLClassLoader {
    public J07ClassLoader(URL[] urls, ClassLoader parent) {
        super(urls, parent);
    }
}
