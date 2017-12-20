/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.dto

trait BaseDto extends BaseReadOnlyDto {
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement;
}
