package com.jxjxgo.common.exception

/**
  * Created by center on 2017/7/4.
  */
object ErrorCodeAsserts {
  def assertSuccess(code:String) = {
    if(!"0".equals(code))throw ServiceException.make(ErrorCode.get(code))
  }
}
