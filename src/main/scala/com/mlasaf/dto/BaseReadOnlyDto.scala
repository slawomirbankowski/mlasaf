/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.dto

trait BaseReadOnlyDto {
  val dtoGuid : String = "" + com.mlasaf.common.CustomUtils.randomLong();
  val dtoCreatedDate = new java.util.Date();
  def tableName : String;
  def fields : String;
  def pkFields : String;
  def fkFields : String;
  def nameField : String;

  def getPk() : Long;
  def getGuid() : Long;
  def getInsertedRowDate() : java.util.Date;
  def getLastUpdatedDate() : java.util.Date;
  def getFieldValue(name : String) : Any;
  def getFieldTypeName(name : String) : String;
  def toAnyArray() : Array[Any];
  def toStringArray() : Array[String];

  override def toString: String = toStringArray().mkString(",");
}
