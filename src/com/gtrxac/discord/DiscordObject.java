package com.gtrxac.discord;

import cc.nnproject.json.*;

/**
 * Represents guilds and channels, basically anything that has a name and an ID
 */
public class DiscordObject {
    public String id;
    public String name;

    public DiscordObject(JSONArray data) {
        id = data.getString(0);
        name = data.getString(1);
    }
}
