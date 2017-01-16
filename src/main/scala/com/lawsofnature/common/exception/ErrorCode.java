package com.lawsofnature.common.exception;

/**
 * Created by fangzhongwei on 2016/11/29.
 */
public enum ErrorCode {

    EC_SYSTEM_ERROR("EC_SYSTEM_ERROR", "系统目前无法处理您的请求，请稍后再试。"),
    EC_INVALID_REQUEST("EC_INVALID_REQUEST", "不正确的请求，请检查输入。"),

    EC_UC_INVALID_MOBILE("EC_UC_INVALID_MOBILE", "手机号格式不正确，请修改或重新输入。"),
    EC_UC_MEMBER_ACCOUNT_FREEZE("EC_UC_MEMBER_ACCOUNT_FREEZE", "您的账户已冻结,请联系客服。"),
    EC_UC_MEMBER_NOT_EXISTS("EC_UC_MEMBER_NOT_EXISTS", "会员信息未找到。"),

    EC_SSO_SESSION_EXPIRED("EC_SSO_SESSION_EXPIRED", "会话已过期，请重新登录。"),
    EC_SSO_SESSION_REPELLED("EC_SSO_SESSION_REPELLED", "您的账号已在其他设备登录。"),

    EC_ED_TICKET_NOT_EXISTS("EC_ED_TICKET_NOT_EXISTS", "ticket不存在。"),

    EC_GC_CONFIG_ERROR("EC_GC_CONFIG_ERROR", "系统配置错误。"),
    EC_SMS_TYPE_CONFIG_ERROR("EC_SMS_TYPE_CONFIG_ERROR", "信息类型配置错误。"),
    EC_SMS_DAY_LIMIT_ERROR("EC_SMS_DAY_LIMIT_ERROR", "一个手机号每天最多获取3次验证码。"),
    EC_SMS_SEND_TOO_OFTEN_ERROR("EC_SMS_SEND_TOO_OFTEN_ERROR", "验证码发送过于频繁。"),

    EC_SMS_WRONG_CODE("EC_SMS_WRONG_CODE", "验证码不正确。"),
    EC_SMS_CODE_EXPIRED_ERROR("EC_SMS_CODE_EXPIRED_ERROR", "验证码已过期。"),

    EC_GAME_INVALID_RESULT("EC_GAME_INVALID_RESULT", "游戏结算结果不正确。"),
    EC_ORDER_PAYMENT_ORDER_NOT_FOUND("EC_ORDER_PAYMENT_ORDER_NOT_FOUND", "支付订单不存在。"),

    EC_ACCOUNT_NOT_EXIST("EC_ACCOUNT_NOT_EXIST", "账户不存在。");

    private String code;
    private String desc;

    ErrorCode(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static ErrorCode get(String code) {
        final ErrorCode[] values = ErrorCode.values();
        for (int i = 0; i < values.length; i++) {
            if (values[i].getCode().equals(code)) return values[i];
        }
        return null;
    }
}
