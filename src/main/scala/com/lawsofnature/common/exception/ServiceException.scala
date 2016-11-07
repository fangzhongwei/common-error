package com.lawsofnature.common.exception

import com.lawsofnature.common.exception.ServiceErrorCode.ServiceErrorCode

/**
  * Created by fangzhongwei on 2016/11/5.
  */
class ServiceException(val serviceErrorCode: ServiceErrorCode.ServiceErrorCode) extends RuntimeException{
  def apply(serviceErrorCode: ServiceErrorCode): ServiceException = new ServiceException(serviceErrorCode)
}