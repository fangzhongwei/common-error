package com.jxjxgo.common.exception

/**
  * Created by center on 2017/7/4.
  */
object Asserts {
  def assertSuccess(code: String) = {
    if (!"0".equals(code)) throw ServiceException.make(ErrorCode.get(code))
  }

  def assertNotNone(option: Option[Any], errorCode: ErrorCode): Unit = {
    option match {
      case None => throw ServiceException.make(errorCode)
      case _ =>
    }
  }

  def assertNotBlank(str: String, errorCode: ErrorCode) = {
    if (str == null || "".equals(str.trim)) throw ServiceException.make(errorCode)
  }

  def assertNotNull(str: Any, errorCode: ErrorCode) = {
    if (str == null) throw ServiceException.make(errorCode)
  }

  def assertTrue(boolean: Boolean, errorCode: ErrorCode) = {
    if (!boolean) throw ServiceException.make(errorCode)
  }
}
