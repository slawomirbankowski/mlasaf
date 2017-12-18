package com.mlasaf.dto

trait BaseDto {
  val dtoGuid : String = "" + com.mlasaf.common.CustomUtils.randomLong();
  val dtoInsertedDate = new java.util.Date();
  def tableName : String;
  def fields : String;
  def pkFields : String;
  def fkFields : String;
  def nameField : String;
  def getFieldValue(name : String) : Any;
  def getFieldTypeName(name : String) : Any
  def toAnyArray() : Array[Any];
  def toStringArray() : Array[String];
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement;
}
