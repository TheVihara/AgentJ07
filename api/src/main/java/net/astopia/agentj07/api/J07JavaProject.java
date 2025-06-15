package net.astopia.agentj07.api;

import net.astopia.agentj07.api.logging.J07Logger;

public abstract class J07JavaProject implements J07Project {
    private J07Logger logger;

    public void load() {
        onLoad();
    }

    public void enable() {
        onEnable();
    }

    public void disable() {
        onDisable();
    }

    @Override
    public J07Logger getLogger() {
        return logger;
    }
}
