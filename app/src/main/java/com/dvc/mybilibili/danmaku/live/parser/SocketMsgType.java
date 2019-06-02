package com.dvc.mybilibili.danmaku.live.parser;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface SocketMsgType {
    /* renamed from: a */
    String[] types();
}
