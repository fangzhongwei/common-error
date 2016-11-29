package com.lawsofnature.common.exception

import com.lawsofnature.common.exception.ServiceErrorCode.ServiceErrorCode

/**
  * Created by fangzhongwei on 2016/11/5.
  */
case class ServiceException private(message: String) extends RuntimeException(message) {
  private var errorCode: ServiceErrorCode = _

  def getErrorCode: ServiceErrorCode = errorCode
}

object ServiceException {
  private val ERROR_MAP: scala.collection.mutable.Map[ServiceErrorCode, ServiceException] = scala.collection.mutable.Map[ServiceErrorCode, ServiceException]()

  private def get(serviceErrorCode: ServiceErrorCode): Option[ServiceException] = ERROR_MAP.get(serviceErrorCode)

  private def put(serviceErrorCode: ServiceErrorCode, serviceException: ServiceException): Unit = ERROR_MAP += (serviceErrorCode -> serviceException)

  def make(serviceErrorCode: ServiceErrorCode): ServiceException = {
    ServiceException.get(serviceErrorCode) match {
      case Some(exception) => exception
      case None =>
        val serviceException: ServiceException = new ServiceException(serviceErrorCode.toString)
        serviceException.errorCode = serviceErrorCode
        ServiceException.put(serviceErrorCode, serviceException)
        serviceException
    }
  }
}