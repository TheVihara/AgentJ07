package net.astopia.agentj07.api;

import java.util.logging.Logger;

public interface J07Project {
    Logger getLogger();
    void onLoad();
    void onEnable();
    void onDisable();
}
