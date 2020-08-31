package me.darkboy.test.testclient.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class TestClientClient implements ClientModInitializer {


    @Override
    public void onInitializeClient() {
        System.out.println("Client Initialized!");
    }
}
