// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protoFile.proto

package proto;

public final class ProtoFile {
  private ProtoFile() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_RoleVo_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_proto_RoleVo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017protoFile.proto\022\005proto\";\n\006RoleVo\022\016\n\006ro" +
      "leID\030\001 \002(\r\022\020\n\010roleName\030\002 \001(\t\022\017\n\007roleSex\030" +
      "\003 \001(\rB\002P\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_proto_RoleVo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_RoleVo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_proto_RoleVo_descriptor,
        new java.lang.String[] { "RoleID", "RoleName", "RoleSex", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
