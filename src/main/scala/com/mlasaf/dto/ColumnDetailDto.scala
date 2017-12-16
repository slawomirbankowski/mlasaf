/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.dto


case class ColumnDetailDto(val TABLE_NAME : String, val COLUMN_NAME : String, val ORDINAL_POSITION : Int, val SCALA_TYPE : String) {
}