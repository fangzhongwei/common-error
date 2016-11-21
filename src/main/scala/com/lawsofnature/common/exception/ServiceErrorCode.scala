package com.lawsofnature.common.exception

/**
  * Created by fangzhongwei on 2016/11/2.
  */
object ServiceErrorCode extends Enumeration {
  type ServiceErrorCode = Value

  val EC_SYSTEM_ERROR = Value(10000001, "系统目前无法处理您的请求，请稍后再试。")
  val EC_INVALID_REQUEST = Value(10000002, "不正确的请求，请检查输入。")
  val EC_UC_USERNAME_LENGTH_LIMIT = Value(10001001, "用户名长度不能超过64位，请修改或重新输入。")
  val EC_UC_INVALID_MOBILE = Value(10001002, "手机号格式不正确，请修改或重新输入。")
  val EC_UC_EMAIL_LENGTH_LIMIT = Value(10001003, "邮箱长度不能超过64位，请修改或重新输入。")
  val EC_UC_INVALID_EMAIL = Value(10001004, "邮箱格式不正确，请修改或重新输入。")
  val EC_UC_PASSWORD_LENGTH_LIMIT = Value(10001005, "密码长度为7至16位，请修改或重新输入。")
  val EC_UC_INVALID_PASSWORD = Value(10001006, "密码至少包含一个小写字母和一个数字，请修改或重新输入。")

  def get(id: Int): ServiceErrorCode = ServiceErrorCode.values.filter(_.id == id).head
}

