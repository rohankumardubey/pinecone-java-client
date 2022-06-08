
Copyright (c) 2020-2021 Pinecone Systems Inc. All right reserved.


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/vector_service.proto

package io.pinecone.proto;

public interface UpsertResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:UpsertResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The number of vectors upserted.
   * </pre>
   *
   * <code>uint32 upserted_count = 1 [(.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The upsertedCount.
   */
  int getUpsertedCount();
}