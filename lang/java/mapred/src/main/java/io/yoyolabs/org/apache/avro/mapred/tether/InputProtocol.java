/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package io.yoyolabs.org.apache.avro.mapred.tether;

@SuppressWarnings("all")
/** Transmit inputs to a map or reduce task sub-process. */
@io.yoyolabs.org.apache.avro.specific.AvroGenerated
public interface InputProtocol {
  public static final io.yoyolabs.org.apache.avro.Protocol PROTOCOL = io.yoyolabs.org.apache.avro.Protocol.parse("{\"protocol\":\"InputProtocol\",\"namespace\":\"io.yoyolabs.org.apache.avro.mapred.tether\",\"doc\":\"Transmit inputs to a map or reduce task sub-process.\",\"types\":[{\"type\":\"enum\",\"name\":\"TaskType\",\"symbols\":[\"MAP\",\"REDUCE\"]}],\"messages\":{\"configure\":{\"doc\":\"Configure the task.  Sent before any other message.\",\"request\":[{\"name\":\"taskType\",\"type\":\"TaskType\",\"doc\":\"Whether this is a map or reduce task.\"},{\"name\":\"inSchema\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The Avro schema for task input data.\"},{\"name\":\"outSchema\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The Avro schema for task output data.\"}],\"response\":\"null\",\"one-way\":true},\"partitions\":{\"doc\":\"Set the number of map output partitions.\",\"request\":[{\"name\":\"partitions\",\"type\":\"int\",\"doc\":\"The number of map output partitions.\"}],\"response\":\"null\",\"one-way\":true},\"input\":{\"doc\":\"Send a block of input data to a task.\",\"request\":[{\"name\":\"data\",\"type\":\"bytes\",\"doc\":\"A sequence of instances of the declared schema.\"},{\"name\":\"count\",\"type\":\"long\",\"doc\":\"The number of instances in this block.\",\"default\":1}],\"response\":\"null\",\"one-way\":true},\"abort\":{\"doc\":\"Called to abort the task.\",\"request\":[],\"response\":\"null\",\"one-way\":true},\"complete\":{\"doc\":\"Called when a task's input is complete.\",\"request\":[],\"response\":\"null\",\"one-way\":true}}}");
  /**
   * Configure the task.  Sent before any other message.
   * @param taskType Whether this is a map or reduce task.
   * @param inSchema The Avro schema for task input data.
   * @param outSchema The Avro schema for task output data.
   */
  void configure(io.yoyolabs.org.apache.avro.mapred.tether.TaskType taskType, java.lang.String inSchema, java.lang.String outSchema);
  /**
   * Set the number of map output partitions.
   * @param partitions The number of map output partitions.
   */
  void partitions(int partitions);
  /**
   * Send a block of input data to a task.
   * @param data A sequence of instances of the declared schema.
   * @param count The number of instances in this block.
   */
  void input(java.nio.ByteBuffer data, long count);
  /**
   * Called to abort the task.
   */
  void abort();
  /**
   * Called when a task's input is complete.
   */
  void complete();

  @SuppressWarnings("all")
  /** Transmit inputs to a map or reduce task sub-process. */
  public interface Callback extends InputProtocol {
    public static final io.yoyolabs.org.apache.avro.Protocol PROTOCOL = io.yoyolabs.org.apache.avro.mapred.tether.InputProtocol.PROTOCOL;
  }
}