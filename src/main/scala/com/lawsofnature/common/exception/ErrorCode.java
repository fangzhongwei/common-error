package com.lawsofnature.common.exception;

/**
 * Created by fangzhongwei on 2016/11/29.
 */
public enum ErrorCode {
    
    EC_SYSTEM_ERROR(10000001, "系统目前无法处理您的请求，请稍后再试。"),
    EC_INVALID_REQUEST(10000002, "不正确的请求，请检查输入。"),

    EC_UC_USERNAME_LENGTH_LIMIT(10001001, "用户名长度不能超过64位，请修改或重新输入。"),
    EC_UC_INVALID_MOBILE(10001002, "手机号格式不正确，请修改或重新输入。"),
    EC_UC_EMAIL_LENGTH_LIMIT(10001003, "邮箱长度不能超过64位，请修改或重新输入。"),
    EC_UC_INVALID_EMAIL(10001004, "邮箱格式不正确，请修改或重新输入。"),
    EC_UC_PASSWORD_LENGTH_LIMIT(10001005, "密码长度为7至16位，请修改或重新输入。"),
    EC_UC_INVALID_PASSWORD(10001006, "密码至少包含一个小写字母和一个数字，请修改或重新输入。"),
    EC_UC_USERNAME_TOKEN(10001007, "用户名已被占用，请更换用户名。"),
    EC_UC_MOBILE_TOKEN(10001008, "手机号已被占用，请更换手机号。"),
    EC_UC_EMAIL_TOKEN(10001009, "邮箱已被占用，请更换邮箱。"),
    EC_UC_MEMBER_NOT_EXISTS(10001010, "会员不存在。"),
    EC_UC_MEMBER_INVALID_USERNAME_OR_PWD(10001011, "用户名或密码错误。"),
    EC_UC_MEMBER_ACCOUNT_FREEZE(10001012, "您的账户已冻结,请联系客服。"),

    EC_SSO_SESSION_EXPIRED(10002001, "会话已过期，请重新登录。"),
    EC_SSO_SESSION_REPELLED(10002002, "您的账号已在其他设备登录。"),

    EC_ED_TICKET_NOT_EXISTS(10003001, "ticket不存在。");

    private int code;
    private String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static ErrorCode get(int code) {
        final ErrorCode[] values = ErrorCode.values();
        for (int i=0; i<values.length;i++) {
            if (values[i].getCode() == code) return values[i];
        }
        return null;
    }
}
