package com.dvc.mybilibili.danmaku.live.interfaces;

import org.json.JSONObject;

/**
 * Created by miserydx on 17/9/11.
 */

public abstract class SocketMsgParserProcess<T> {

    public abstract void  process(String cmd, JSONObject jSONObject, T t);

}
