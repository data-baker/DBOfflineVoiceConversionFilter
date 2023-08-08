package com.offline.conversion;

import com.google.gson.JsonObject;

public class KeyCenter {
    // 定义配置信息
    public static final String CONFIG_JSON;
    // 在静态块中初始化配置信息
    static {
//        String clientId = "xxx...";
//        String clientSecret = "xxx...";
        // TODO: 测试授权使用
        String clientId = "dfa13e49832147dc929055fdfb1063ee";
        String clientSecret = "4cf51d618c6d459b8b897a75283185b6";
        String voiceName = "Vc_luoli"; // 离线变声的发音人，可以动态的修改
        String isLog = "true"; // 日志记录，一般用于debug使用
        // 构造JSON字符串
        JsonObject configJson = new JsonObject();
        configJson.addProperty("clientId", clientId);
        configJson.addProperty("clientSecret", clientSecret);
        configJson.addProperty("voiceName", voiceName);
        configJson.addProperty("isLog", isLog);
        CONFIG_JSON = configJson.toString();
    }
    public final static String APPID = "d19e2d42f90142b0889efaaa9883477f";

    public static final String EXTENSION_AUDIO_FILTER_VOLUME = "OfflineVoiceConversion"; // Audio filter name defined in ExtensionProvider.h

    public static final String EXTENSION_NAME = "databaker_offlinevc"; // Name of target link library used in CMakeLists.txt

    public static final String EXTENSION_VENDOR_NAME = "DataBaker"; // Provider name used for registering in agora-bytedance.cpp

}
