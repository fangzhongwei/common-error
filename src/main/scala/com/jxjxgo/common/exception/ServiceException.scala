package com.jxjxgo.common.exception


/**
  * Created by fangzhongwei on 2016/11/5.
  */
case class ServiceException private(message: String) extends RuntimeException(message) {
  private var errorCode: ErrorCode = _

  def getErrorCode: ErrorCode = errorCode
}

object ServiceException {
  private val ERROR_MAP: scala.collection.mutable.Map[ErrorCode, ServiceException] = scala.collection.mutable.Map[ErrorCode, ServiceException]()

  private def get(serviceErrorCode: ErrorCode): Option[ServiceException] = ERROR_MAP.get(serviceErrorCode)

  private def put(serviceErrorCode: ErrorCode, serviceException: ServiceException): Unit = ERROR_MAP += (serviceErrorCode -> serviceException)

  def make(serviceErrorCode: ErrorCode): ServiceException = {
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