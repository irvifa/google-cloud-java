// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/data_items.proto

package com.google.cloud.automl.v1beta1;

public interface DocumentDimensionsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.DocumentDimensions)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Unit of the dimension.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.DocumentDimensions.DocumentDimensionUnit unit = 1;</code>
   */
  int getUnitValue();
  /**
   *
   *
   * <pre>
   * Unit of the dimension.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.DocumentDimensions.DocumentDimensionUnit unit = 1;</code>
   */
  com.google.cloud.automl.v1beta1.DocumentDimensions.DocumentDimensionUnit getUnit();

  /**
   *
   *
   * <pre>
   * Width value of the document, works together with the unit.
   * </pre>
   *
   * <code>float width = 2;</code>
   */
  float getWidth();

  /**
   *
   *
   * <pre>
   * Height value of the document, works together with the unit.
   * </pre>
   *
   * <code>float height = 3;</code>
   */
  float getHeight();
}