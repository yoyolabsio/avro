/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */

package io.yoyolabs.org.apache.avro.hadoop.io;

import io.yoyolabs.org.apache.avro.Schema;
import io.yoyolabs.org.apache.avro.generic.GenericData;
import io.yoyolabs.org.apache.avro.io.BinaryData;
import io.yoyolabs.org.apache.avro.mapred.AvroKey;
import io.yoyolabs.org.apache.avro.mapreduce.AvroJob;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.io.RawComparator;

/**
 * The {@link org.apache.hadoop.io.RawComparator} used by jobs configured with
 * {@link io.yoyolabs.org.apache.avro.mapreduce.AvroJob}.
 *
 * <p>Compares AvroKeys output from the map phase for sorting.</p>
 */
public class AvroKeyComparator<T> extends Configured implements RawComparator<AvroKey<T>> {
  /** The schema of the Avro data in the key to compare. */
  private Schema mSchema;
  private GenericData mDataModel;

  /** {@inheritDoc} */
  @Override
  public void setConf(Configuration conf) {
    super.setConf(conf);
    if (null != conf) {
      // The MapReduce framework will be using this comparator to sort AvroKey objects
      // output from the map phase, so use the schema defined for the map output key
      // and the data model non-raw compare() implementation.
      mSchema = AvroJob.getMapOutputKeySchema(conf);
      mDataModel = AvroSerialization.createDataModel(conf);
    }
  }

  /** {@inheritDoc} */
  @Override
  public int compare(byte[] b1, int s1, int l1, byte[] b2, int s2, int l2) {
    return BinaryData.compare(b1, s1, b2, s2, mSchema);
  }

  /** {@inheritDoc} */
  @Override
  public int compare(AvroKey<T> x, AvroKey<T> y) {
    return mDataModel.compare(x.datum(), y.datum(), mSchema);
  }
}
