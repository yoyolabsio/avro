/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package io.yoyolabs.org.apache.avro.ipc;

import io.yoyolabs.org.apache.avro.specific.SpecificData;
import io.yoyolabs.org.apache.avro.message.BinaryMessageEncoder;
import io.yoyolabs.org.apache.avro.message.BinaryMessageDecoder;
import io.yoyolabs.org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@io.yoyolabs.org.apache.avro.specific.AvroGenerated
public class HandshakeRequest extends io.yoyolabs.org.apache.avro.specific.SpecificRecordBase implements io.yoyolabs.org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6293635732927376057L;
  public static final io.yoyolabs.org.apache.avro.Schema SCHEMA$ = new io.yoyolabs.org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"HandshakeRequest\",\"namespace\":\"org.apache.avro.ipc\",\"fields\":[{\"name\":\"clientHash\",\"type\":{\"type\":\"fixed\",\"name\":\"MD5\",\"size\":16}},{\"name\":\"clientProtocol\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"serverHash\",\"type\":\"MD5\"},{\"name\":\"meta\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"bytes\",\"avro.java.string\":\"String\"}]}]}");
  public static io.yoyolabs.org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<HandshakeRequest> ENCODER =
      new BinaryMessageEncoder<HandshakeRequest>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<HandshakeRequest> DECODER =
      new BinaryMessageDecoder<HandshakeRequest>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<HandshakeRequest> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<HandshakeRequest> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<HandshakeRequest>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this HandshakeRequest to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a HandshakeRequest from a ByteBuffer. */
  public static HandshakeRequest fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public io.yoyolabs.org.apache.avro.ipc.MD5 clientHash;
  @Deprecated public java.lang.String clientProtocol;
  @Deprecated public io.yoyolabs.org.apache.avro.ipc.MD5 serverHash;
  @Deprecated public java.util.Map<java.lang.String,java.nio.ByteBuffer> meta;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public HandshakeRequest() {}

  /**
   * All-args constructor.
   * @param clientHash The new value for clientHash
   * @param clientProtocol The new value for clientProtocol
   * @param serverHash The new value for serverHash
   * @param meta The new value for meta
   */
  public HandshakeRequest(io.yoyolabs.org.apache.avro.ipc.MD5 clientHash, java.lang.String clientProtocol, io.yoyolabs.org.apache.avro.ipc.MD5 serverHash, java.util.Map<java.lang.String,java.nio.ByteBuffer> meta) {
    this.clientHash = clientHash;
    this.clientProtocol = clientProtocol;
    this.serverHash = serverHash;
    this.meta = meta;
  }

  public io.yoyolabs.org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return clientHash;
    case 1: return clientProtocol;
    case 2: return serverHash;
    case 3: return meta;
    default: throw new io.yoyolabs.org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: clientHash = (io.yoyolabs.org.apache.avro.ipc.MD5)value$; break;
    case 1: clientProtocol = (java.lang.String)value$; break;
    case 2: serverHash = (io.yoyolabs.org.apache.avro.ipc.MD5)value$; break;
    case 3: meta = (java.util.Map<java.lang.String,java.nio.ByteBuffer>)value$; break;
    default: throw new io.yoyolabs.org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'clientHash' field.
   * @return The value of the 'clientHash' field.
   */
  public io.yoyolabs.org.apache.avro.ipc.MD5 getClientHash() {
    return clientHash;
  }

  /**
   * Sets the value of the 'clientHash' field.
   * @param value the value to set.
   */
  public void setClientHash(io.yoyolabs.org.apache.avro.ipc.MD5 value) {
    this.clientHash = value;
  }

  /**
   * Gets the value of the 'clientProtocol' field.
   * @return The value of the 'clientProtocol' field.
   */
  public java.lang.String getClientProtocol() {
    return clientProtocol;
  }

  /**
   * Sets the value of the 'clientProtocol' field.
   * @param value the value to set.
   */
  public void setClientProtocol(java.lang.String value) {
    this.clientProtocol = value;
  }

  /**
   * Gets the value of the 'serverHash' field.
   * @return The value of the 'serverHash' field.
   */
  public io.yoyolabs.org.apache.avro.ipc.MD5 getServerHash() {
    return serverHash;
  }

  /**
   * Sets the value of the 'serverHash' field.
   * @param value the value to set.
   */
  public void setServerHash(io.yoyolabs.org.apache.avro.ipc.MD5 value) {
    this.serverHash = value;
  }

  /**
   * Gets the value of the 'meta' field.
   * @return The value of the 'meta' field.
   */
  public java.util.Map<java.lang.String,java.nio.ByteBuffer> getMeta() {
    return meta;
  }

  /**
   * Sets the value of the 'meta' field.
   * @param value the value to set.
   */
  public void setMeta(java.util.Map<java.lang.String,java.nio.ByteBuffer> value) {
    this.meta = value;
  }

  /**
   * Creates a new HandshakeRequest RecordBuilder.
   * @return A new HandshakeRequest RecordBuilder
   */
  public static io.yoyolabs.org.apache.avro.ipc.HandshakeRequest.Builder newBuilder() {
    return new io.yoyolabs.org.apache.avro.ipc.HandshakeRequest.Builder();
  }

  /**
   * Creates a new HandshakeRequest RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new HandshakeRequest RecordBuilder
   */
  public static io.yoyolabs.org.apache.avro.ipc.HandshakeRequest.Builder newBuilder(io.yoyolabs.org.apache.avro.ipc.HandshakeRequest.Builder other) {
    return new io.yoyolabs.org.apache.avro.ipc.HandshakeRequest.Builder(other);
  }

  /**
   * Creates a new HandshakeRequest RecordBuilder by copying an existing HandshakeRequest instance.
   * @param other The existing instance to copy.
   * @return A new HandshakeRequest RecordBuilder
   */
  public static io.yoyolabs.org.apache.avro.ipc.HandshakeRequest.Builder newBuilder(io.yoyolabs.org.apache.avro.ipc.HandshakeRequest other) {
    return new io.yoyolabs.org.apache.avro.ipc.HandshakeRequest.Builder(other);
  }

  /**
   * RecordBuilder for HandshakeRequest instances.
   */
  public static class Builder extends io.yoyolabs.org.apache.avro.specific.SpecificRecordBuilderBase<HandshakeRequest>
    implements io.yoyolabs.org.apache.avro.data.RecordBuilder<HandshakeRequest> {

    private io.yoyolabs.org.apache.avro.ipc.MD5 clientHash;
    private java.lang.String clientProtocol;
    private io.yoyolabs.org.apache.avro.ipc.MD5 serverHash;
    private java.util.Map<java.lang.String,java.nio.ByteBuffer> meta;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.yoyolabs.org.apache.avro.ipc.HandshakeRequest.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.clientHash)) {
        this.clientHash = data().deepCopy(fields()[0].schema(), other.clientHash);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.clientProtocol)) {
        this.clientProtocol = data().deepCopy(fields()[1].schema(), other.clientProtocol);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.serverHash)) {
        this.serverHash = data().deepCopy(fields()[2].schema(), other.serverHash);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.meta)) {
        this.meta = data().deepCopy(fields()[3].schema(), other.meta);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing HandshakeRequest instance
     * @param other The existing instance to copy.
     */
    private Builder(io.yoyolabs.org.apache.avro.ipc.HandshakeRequest other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.clientHash)) {
        this.clientHash = data().deepCopy(fields()[0].schema(), other.clientHash);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.clientProtocol)) {
        this.clientProtocol = data().deepCopy(fields()[1].schema(), other.clientProtocol);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.serverHash)) {
        this.serverHash = data().deepCopy(fields()[2].schema(), other.serverHash);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.meta)) {
        this.meta = data().deepCopy(fields()[3].schema(), other.meta);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'clientHash' field.
      * @return The value.
      */
    public io.yoyolabs.org.apache.avro.ipc.MD5 getClientHash() {
      return clientHash;
    }

    /**
      * Sets the value of the 'clientHash' field.
      * @param value The value of 'clientHash'.
      * @return This builder.
      */
    public io.yoyolabs.org.apache.avro.ipc.HandshakeRequest.Builder setClientHash(io.yoyolabs.org.apache.avro.ipc.MD5 value) {
      validate(fields()[0], value);
      this.clientHash = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'clientHash' field has been set.
      * @return True if the 'clientHash' field has been set, false otherwise.
      */
    public boolean hasClientHash() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'clientHash' field.
      * @return This builder.
      */
    public io.yoyolabs.org.apache.avro.ipc.HandshakeRequest.Builder clearClientHash() {
      clientHash = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'clientProtocol' field.
      * @return The value.
      */
    public java.lang.String getClientProtocol() {
      return clientProtocol;
    }

    /**
      * Sets the value of the 'clientProtocol' field.
      * @param value The value of 'clientProtocol'.
      * @return This builder.
      */
    public io.yoyolabs.org.apache.avro.ipc.HandshakeRequest.Builder setClientProtocol(java.lang.String value) {
      validate(fields()[1], value);
      this.clientProtocol = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'clientProtocol' field has been set.
      * @return True if the 'clientProtocol' field has been set, false otherwise.
      */
    public boolean hasClientProtocol() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'clientProtocol' field.
      * @return This builder.
      */
    public io.yoyolabs.org.apache.avro.ipc.HandshakeRequest.Builder clearClientProtocol() {
      clientProtocol = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'serverHash' field.
      * @return The value.
      */
    public io.yoyolabs.org.apache.avro.ipc.MD5 getServerHash() {
      return serverHash;
    }

    /**
      * Sets the value of the 'serverHash' field.
      * @param value The value of 'serverHash'.
      * @return This builder.
      */
    public io.yoyolabs.org.apache.avro.ipc.HandshakeRequest.Builder setServerHash(io.yoyolabs.org.apache.avro.ipc.MD5 value) {
      validate(fields()[2], value);
      this.serverHash = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'serverHash' field has been set.
      * @return True if the 'serverHash' field has been set, false otherwise.
      */
    public boolean hasServerHash() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'serverHash' field.
      * @return This builder.
      */
    public io.yoyolabs.org.apache.avro.ipc.HandshakeRequest.Builder clearServerHash() {
      serverHash = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'meta' field.
      * @return The value.
      */
    public java.util.Map<java.lang.String,java.nio.ByteBuffer> getMeta() {
      return meta;
    }

    /**
      * Sets the value of the 'meta' field.
      * @param value The value of 'meta'.
      * @return This builder.
      */
    public io.yoyolabs.org.apache.avro.ipc.HandshakeRequest.Builder setMeta(java.util.Map<java.lang.String,java.nio.ByteBuffer> value) {
      validate(fields()[3], value);
      this.meta = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'meta' field has been set.
      * @return True if the 'meta' field has been set, false otherwise.
      */
    public boolean hasMeta() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'meta' field.
      * @return This builder.
      */
    public io.yoyolabs.org.apache.avro.ipc.HandshakeRequest.Builder clearMeta() {
      meta = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public HandshakeRequest build() {
      try {
        HandshakeRequest record = new HandshakeRequest();
        record.clientHash = fieldSetFlags()[0] ? this.clientHash : (io.yoyolabs.org.apache.avro.ipc.MD5) defaultValue(fields()[0]);
        record.clientProtocol = fieldSetFlags()[1] ? this.clientProtocol : (java.lang.String) defaultValue(fields()[1]);
        record.serverHash = fieldSetFlags()[2] ? this.serverHash : (io.yoyolabs.org.apache.avro.ipc.MD5) defaultValue(fields()[2]);
        record.meta = fieldSetFlags()[3] ? this.meta : (java.util.Map<java.lang.String,java.nio.ByteBuffer>) defaultValue(fields()[3]);
        return record;
      } catch (java.lang.Exception e) {
        throw new io.yoyolabs.org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final io.yoyolabs.org.apache.avro.io.DatumWriter<HandshakeRequest>
    WRITER$ = (io.yoyolabs.org.apache.avro.io.DatumWriter<HandshakeRequest>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final io.yoyolabs.org.apache.avro.io.DatumReader<HandshakeRequest>
    READER$ = (io.yoyolabs.org.apache.avro.io.DatumReader<HandshakeRequest>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
