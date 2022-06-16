// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vector_service.proto

package io.pinecone.proto;

public interface UpdateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:UpdateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Vector's unique id.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * Vector's unique id.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Vector data.
   * </pre>
   *
   * <code>repeated float values = 2;</code>
   * @return A list containing the values.
   */
  java.util.List<java.lang.Float> getValuesList();
  /**
   * <pre>
   * Vector data.
   * </pre>
   *
   * <code>repeated float values = 2;</code>
   * @return The count of values.
   */
  int getValuesCount();
  /**
   * <pre>
   * Vector data.
   * </pre>
   *
   * <code>repeated float values = 2;</code>
   * @param index The index of the element to return.
   * @return The values at the given index.
   */
  float getValues(int index);

  /**
   * <pre>
   * Metadata to *set* for the vector.
   * </pre>
   *
   * <code>.google.protobuf.Struct set_metadata = 3;</code>
   * @return Whether the setMetadata field is set.
   */
  boolean hasSetMetadata();
  /**
   * <pre>
   * Metadata to *set* for the vector.
   * </pre>
   *
   * <code>.google.protobuf.Struct set_metadata = 3;</code>
   * @return The setMetadata.
   */
  com.google.protobuf.Struct getSetMetadata();
  /**
   * <pre>
   * Metadata to *set* for the vector.
   * </pre>
   *
   * <code>.google.protobuf.Struct set_metadata = 3;</code>
   */
  com.google.protobuf.StructOrBuilder getSetMetadataOrBuilder();

  /**
   * <pre>
   * Namespace name where to update the vector.
   * </pre>
   *
   * <code>string namespace = 4;</code>
   * @return The namespace.
   */
  java.lang.String getNamespace();
  /**
   * <pre>
   * Namespace name where to update the vector.
   * </pre>
   *
   * <code>string namespace = 4;</code>
   * @return The bytes for namespace.
   */
  com.google.protobuf.ByteString
      getNamespaceBytes();
}