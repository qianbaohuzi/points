package com.future.points.auth;

import cn.hutool.core.util.PhoneUtil;
import lombok.Getter;
import org.springframework.util.Assert;

@Getter
public class DefaultUser implements Userid {

    private String userid;

    private String username;

    private String phone;

    protected DefaultUser() {
    }

    private DefaultUser(String username, String phone) {
        this.username = username;
        this.phone = phone;
    }

    public static DefaultUser of(String username, String phone) {
        Assert.hasText(username, "username can not be null");
        Assert.isTrue(PhoneUtil.isMobile(phone),"access phone");
        return new DefaultUser(username,phone);
    }
}