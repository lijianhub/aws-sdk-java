/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.kinesis.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the output for <a>DescribeStreamSummary</a>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/StreamDescriptionSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamDescriptionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the stream being described.
     * </p>
     */
    private String streamName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the stream being described.
     * </p>
     */
    private String streamARN;
    /**
     * <p>
     * The current status of the stream being described. The stream status is one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The stream is being created. Kinesis Data Streams immediately returns and sets
     * <code>StreamStatus</code> to <code>CREATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The stream is being deleted. The specified stream is in the <code>DELETING</code> state
     * until Kinesis Data Streams completes the deletion.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The stream exists and is ready for read and write operations or deletion. You should
     * perform read and write operations only on an <code>ACTIVE</code> stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - Shards in the stream are being merged or split. Read and write operations continue to
     * work while the stream is in the <code>UPDATING</code> state.
     * </p>
     * </li>
     * </ul>
     */
    private String streamStatus;
    /**
     * <p>
     * The current retention period, in hours.
     * </p>
     */
    private Integer retentionPeriodHours;
    /**
     * <p>
     * The approximate time that the stream was created.
     * </p>
     */
    private java.util.Date streamCreationTimestamp;
    /**
     * <p>
     * Represents the current enhanced monitoring settings of the stream.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<EnhancedMetrics> enhancedMonitoring;
    /**
     * <p>
     * The encryption type used. This value is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KMS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>
     * </p>
     * </li>
     * </ul>
     */
    private String encryptionType;
    /**
     * <p>
     * The GUID for the customer-managed AWS KMS key to use for encryption. This value can be a globally unique
     * identifier, a fully specified ARN to either an alias or a key, or an alias name prefixed by "alias/".You can also
     * use a master key owned by Kinesis Data Streams by specifying the alias <code>aws/kinesis</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ARN example: <code>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN example: <code> arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Globally unique key ID example: <code>12345678-1234-1234-1234-123456789012</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name example: <code>alias/MyAliasName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Master key owned by Kinesis Data Streams: <code>alias/aws/kinesis</code>
     * </p>
     * </li>
     * </ul>
     */
    private String keyId;
    /**
     * <p>
     * The number of open shards in the stream.
     * </p>
     */
    private Integer openShardCount;
    /**
     * <p>
     * The number of enhanced fan-out consumers registered with the stream.
     * </p>
     */
    private Integer consumerCount;

    /**
     * <p>
     * The name of the stream being described.
     * </p>
     * 
     * @param streamName
     *        The name of the stream being described.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream being described.
     * </p>
     * 
     * @return The name of the stream being described.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * The name of the stream being described.
     * </p>
     * 
     * @param streamName
     *        The name of the stream being described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamDescriptionSummary withStreamName(String streamName) {
        setStreamName(streamName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the stream being described.
     * </p>
     * 
     * @param streamARN
     *        The Amazon Resource Name (ARN) for the stream being described.
     */

    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the stream being described.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the stream being described.
     */

    public String getStreamARN() {
        return this.streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the stream being described.
     * </p>
     * 
     * @param streamARN
     *        The Amazon Resource Name (ARN) for the stream being described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamDescriptionSummary withStreamARN(String streamARN) {
        setStreamARN(streamARN);
        return this;
    }

    /**
     * <p>
     * The current status of the stream being described. The stream status is one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The stream is being created. Kinesis Data Streams immediately returns and sets
     * <code>StreamStatus</code> to <code>CREATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The stream is being deleted. The specified stream is in the <code>DELETING</code> state
     * until Kinesis Data Streams completes the deletion.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The stream exists and is ready for read and write operations or deletion. You should
     * perform read and write operations only on an <code>ACTIVE</code> stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - Shards in the stream are being merged or split. Read and write operations continue to
     * work while the stream is in the <code>UPDATING</code> state.
     * </p>
     * </li>
     * </ul>
     * 
     * @param streamStatus
     *        The current status of the stream being described. The stream status is one of the following states:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The stream is being created. Kinesis Data Streams immediately returns and sets
     *        <code>StreamStatus</code> to <code>CREATING</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The stream is being deleted. The specified stream is in the <code>DELETING</code>
     *        state until Kinesis Data Streams completes the deletion.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The stream exists and is ready for read and write operations or deletion. You should
     *        perform read and write operations only on an <code>ACTIVE</code> stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - Shards in the stream are being merged or split. Read and write operations continue
     *        to work while the stream is in the <code>UPDATING</code> state.
     *        </p>
     *        </li>
     * @see StreamStatus
     */

    public void setStreamStatus(String streamStatus) {
        this.streamStatus = streamStatus;
    }

    /**
     * <p>
     * The current status of the stream being described. The stream status is one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The stream is being created. Kinesis Data Streams immediately returns and sets
     * <code>StreamStatus</code> to <code>CREATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The stream is being deleted. The specified stream is in the <code>DELETING</code> state
     * until Kinesis Data Streams completes the deletion.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The stream exists and is ready for read and write operations or deletion. You should
     * perform read and write operations only on an <code>ACTIVE</code> stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - Shards in the stream are being merged or split. Read and write operations continue to
     * work while the stream is in the <code>UPDATING</code> state.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current status of the stream being described. The stream status is one of the following states:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATING</code> - The stream is being created. Kinesis Data Streams immediately returns and sets
     *         <code>StreamStatus</code> to <code>CREATING</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code> - The stream is being deleted. The specified stream is in the <code>DELETING</code>
     *         state until Kinesis Data Streams completes the deletion.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code> - The stream exists and is ready for read and write operations or deletion. You
     *         should perform read and write operations only on an <code>ACTIVE</code> stream.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATING</code> - Shards in the stream are being merged or split. Read and write operations
     *         continue to work while the stream is in the <code>UPDATING</code> state.
     *         </p>
     *         </li>
     * @see StreamStatus
     */

    public String getStreamStatus() {
        return this.streamStatus;
    }

    /**
     * <p>
     * The current status of the stream being described. The stream status is one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The stream is being created. Kinesis Data Streams immediately returns and sets
     * <code>StreamStatus</code> to <code>CREATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The stream is being deleted. The specified stream is in the <code>DELETING</code> state
     * until Kinesis Data Streams completes the deletion.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The stream exists and is ready for read and write operations or deletion. You should
     * perform read and write operations only on an <code>ACTIVE</code> stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - Shards in the stream are being merged or split. Read and write operations continue to
     * work while the stream is in the <code>UPDATING</code> state.
     * </p>
     * </li>
     * </ul>
     * 
     * @param streamStatus
     *        The current status of the stream being described. The stream status is one of the following states:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The stream is being created. Kinesis Data Streams immediately returns and sets
     *        <code>StreamStatus</code> to <code>CREATING</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The stream is being deleted. The specified stream is in the <code>DELETING</code>
     *        state until Kinesis Data Streams completes the deletion.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The stream exists and is ready for read and write operations or deletion. You should
     *        perform read and write operations only on an <code>ACTIVE</code> stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - Shards in the stream are being merged or split. Read and write operations continue
     *        to work while the stream is in the <code>UPDATING</code> state.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamStatus
     */

    public StreamDescriptionSummary withStreamStatus(String streamStatus) {
        setStreamStatus(streamStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the stream being described. The stream status is one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The stream is being created. Kinesis Data Streams immediately returns and sets
     * <code>StreamStatus</code> to <code>CREATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The stream is being deleted. The specified stream is in the <code>DELETING</code> state
     * until Kinesis Data Streams completes the deletion.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The stream exists and is ready for read and write operations or deletion. You should
     * perform read and write operations only on an <code>ACTIVE</code> stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - Shards in the stream are being merged or split. Read and write operations continue to
     * work while the stream is in the <code>UPDATING</code> state.
     * </p>
     * </li>
     * </ul>
     * 
     * @param streamStatus
     *        The current status of the stream being described. The stream status is one of the following states:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The stream is being created. Kinesis Data Streams immediately returns and sets
     *        <code>StreamStatus</code> to <code>CREATING</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The stream is being deleted. The specified stream is in the <code>DELETING</code>
     *        state until Kinesis Data Streams completes the deletion.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The stream exists and is ready for read and write operations or deletion. You should
     *        perform read and write operations only on an <code>ACTIVE</code> stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - Shards in the stream are being merged or split. Read and write operations continue
     *        to work while the stream is in the <code>UPDATING</code> state.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamStatus
     */

    public StreamDescriptionSummary withStreamStatus(StreamStatus streamStatus) {
        this.streamStatus = streamStatus.toString();
        return this;
    }

    /**
     * <p>
     * The current retention period, in hours.
     * </p>
     * 
     * @param retentionPeriodHours
     *        The current retention period, in hours.
     */

    public void setRetentionPeriodHours(Integer retentionPeriodHours) {
        this.retentionPeriodHours = retentionPeriodHours;
    }

    /**
     * <p>
     * The current retention period, in hours.
     * </p>
     * 
     * @return The current retention period, in hours.
     */

    public Integer getRetentionPeriodHours() {
        return this.retentionPeriodHours;
    }

    /**
     * <p>
     * The current retention period, in hours.
     * </p>
     * 
     * @param retentionPeriodHours
     *        The current retention period, in hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamDescriptionSummary withRetentionPeriodHours(Integer retentionPeriodHours) {
        setRetentionPeriodHours(retentionPeriodHours);
        return this;
    }

    /**
     * <p>
     * The approximate time that the stream was created.
     * </p>
     * 
     * @param streamCreationTimestamp
     *        The approximate time that the stream was created.
     */

    public void setStreamCreationTimestamp(java.util.Date streamCreationTimestamp) {
        this.streamCreationTimestamp = streamCreationTimestamp;
    }

    /**
     * <p>
     * The approximate time that the stream was created.
     * </p>
     * 
     * @return The approximate time that the stream was created.
     */

    public java.util.Date getStreamCreationTimestamp() {
        return this.streamCreationTimestamp;
    }

    /**
     * <p>
     * The approximate time that the stream was created.
     * </p>
     * 
     * @param streamCreationTimestamp
     *        The approximate time that the stream was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamDescriptionSummary withStreamCreationTimestamp(java.util.Date streamCreationTimestamp) {
        setStreamCreationTimestamp(streamCreationTimestamp);
        return this;
    }

    /**
     * <p>
     * Represents the current enhanced monitoring settings of the stream.
     * </p>
     * 
     * @return Represents the current enhanced monitoring settings of the stream.
     */

    public java.util.List<EnhancedMetrics> getEnhancedMonitoring() {
        if (enhancedMonitoring == null) {
            enhancedMonitoring = new com.amazonaws.internal.SdkInternalList<EnhancedMetrics>();
        }
        return enhancedMonitoring;
    }

    /**
     * <p>
     * Represents the current enhanced monitoring settings of the stream.
     * </p>
     * 
     * @param enhancedMonitoring
     *        Represents the current enhanced monitoring settings of the stream.
     */

    public void setEnhancedMonitoring(java.util.Collection<EnhancedMetrics> enhancedMonitoring) {
        if (enhancedMonitoring == null) {
            this.enhancedMonitoring = null;
            return;
        }

        this.enhancedMonitoring = new com.amazonaws.internal.SdkInternalList<EnhancedMetrics>(enhancedMonitoring);
    }

    /**
     * <p>
     * Represents the current enhanced monitoring settings of the stream.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnhancedMonitoring(java.util.Collection)} or {@link #withEnhancedMonitoring(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param enhancedMonitoring
     *        Represents the current enhanced monitoring settings of the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamDescriptionSummary withEnhancedMonitoring(EnhancedMetrics... enhancedMonitoring) {
        if (this.enhancedMonitoring == null) {
            setEnhancedMonitoring(new com.amazonaws.internal.SdkInternalList<EnhancedMetrics>(enhancedMonitoring.length));
        }
        for (EnhancedMetrics ele : enhancedMonitoring) {
            this.enhancedMonitoring.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Represents the current enhanced monitoring settings of the stream.
     * </p>
     * 
     * @param enhancedMonitoring
     *        Represents the current enhanced monitoring settings of the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamDescriptionSummary withEnhancedMonitoring(java.util.Collection<EnhancedMetrics> enhancedMonitoring) {
        setEnhancedMonitoring(enhancedMonitoring);
        return this;
    }

    /**
     * <p>
     * The encryption type used. This value is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KMS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param encryptionType
     *        The encryption type used. This value is one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>KMS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code>
     *        </p>
     *        </li>
     * @see EncryptionType
     */

    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    /**
     * <p>
     * The encryption type used. This value is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KMS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The encryption type used. This value is one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>KMS</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NONE</code>
     *         </p>
     *         </li>
     * @see EncryptionType
     */

    public String getEncryptionType() {
        return this.encryptionType;
    }

    /**
     * <p>
     * The encryption type used. This value is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KMS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param encryptionType
     *        The encryption type used. This value is one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>KMS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionType
     */

    public StreamDescriptionSummary withEncryptionType(String encryptionType) {
        setEncryptionType(encryptionType);
        return this;
    }

    /**
     * <p>
     * The encryption type used. This value is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KMS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param encryptionType
     *        The encryption type used. This value is one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>KMS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionType
     */

    public StreamDescriptionSummary withEncryptionType(EncryptionType encryptionType) {
        this.encryptionType = encryptionType.toString();
        return this;
    }

    /**
     * <p>
     * The GUID for the customer-managed AWS KMS key to use for encryption. This value can be a globally unique
     * identifier, a fully specified ARN to either an alias or a key, or an alias name prefixed by "alias/".You can also
     * use a master key owned by Kinesis Data Streams by specifying the alias <code>aws/kinesis</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ARN example: <code>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN example: <code> arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Globally unique key ID example: <code>12345678-1234-1234-1234-123456789012</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name example: <code>alias/MyAliasName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Master key owned by Kinesis Data Streams: <code>alias/aws/kinesis</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param keyId
     *        The GUID for the customer-managed AWS KMS key to use for encryption. This value can be a globally unique
     *        identifier, a fully specified ARN to either an alias or a key, or an alias name prefixed by "alias/".You
     *        can also use a master key owned by Kinesis Data Streams by specifying the alias <code>aws/kinesis</code>
     *        .</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ARN example: <code>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias ARN example: <code> arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Globally unique key ID example: <code>12345678-1234-1234-1234-123456789012</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias name example: <code>alias/MyAliasName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Master key owned by Kinesis Data Streams: <code>alias/aws/kinesis</code>
     *        </p>
     *        </li>
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The GUID for the customer-managed AWS KMS key to use for encryption. This value can be a globally unique
     * identifier, a fully specified ARN to either an alias or a key, or an alias name prefixed by "alias/".You can also
     * use a master key owned by Kinesis Data Streams by specifying the alias <code>aws/kinesis</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ARN example: <code>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN example: <code> arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Globally unique key ID example: <code>12345678-1234-1234-1234-123456789012</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name example: <code>alias/MyAliasName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Master key owned by Kinesis Data Streams: <code>alias/aws/kinesis</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The GUID for the customer-managed AWS KMS key to use for encryption. This value can be a globally unique
     *         identifier, a fully specified ARN to either an alias or a key, or an alias name prefixed by "alias/".You
     *         can also use a master key owned by Kinesis Data Streams by specifying the alias <code>aws/kinesis</code>
     *         .</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ARN example: <code>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Alias ARN example: <code> arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Globally unique key ID example: <code>12345678-1234-1234-1234-123456789012</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Alias name example: <code>alias/MyAliasName</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Master key owned by Kinesis Data Streams: <code>alias/aws/kinesis</code>
     *         </p>
     *         </li>
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * The GUID for the customer-managed AWS KMS key to use for encryption. This value can be a globally unique
     * identifier, a fully specified ARN to either an alias or a key, or an alias name prefixed by "alias/".You can also
     * use a master key owned by Kinesis Data Streams by specifying the alias <code>aws/kinesis</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ARN example: <code>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN example: <code> arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Globally unique key ID example: <code>12345678-1234-1234-1234-123456789012</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name example: <code>alias/MyAliasName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Master key owned by Kinesis Data Streams: <code>alias/aws/kinesis</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param keyId
     *        The GUID for the customer-managed AWS KMS key to use for encryption. This value can be a globally unique
     *        identifier, a fully specified ARN to either an alias or a key, or an alias name prefixed by "alias/".You
     *        can also use a master key owned by Kinesis Data Streams by specifying the alias <code>aws/kinesis</code>
     *        .</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ARN example: <code>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias ARN example: <code> arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Globally unique key ID example: <code>12345678-1234-1234-1234-123456789012</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias name example: <code>alias/MyAliasName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Master key owned by Kinesis Data Streams: <code>alias/aws/kinesis</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamDescriptionSummary withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * The number of open shards in the stream.
     * </p>
     * 
     * @param openShardCount
     *        The number of open shards in the stream.
     */

    public void setOpenShardCount(Integer openShardCount) {
        this.openShardCount = openShardCount;
    }

    /**
     * <p>
     * The number of open shards in the stream.
     * </p>
     * 
     * @return The number of open shards in the stream.
     */

    public Integer getOpenShardCount() {
        return this.openShardCount;
    }

    /**
     * <p>
     * The number of open shards in the stream.
     * </p>
     * 
     * @param openShardCount
     *        The number of open shards in the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamDescriptionSummary withOpenShardCount(Integer openShardCount) {
        setOpenShardCount(openShardCount);
        return this;
    }

    /**
     * <p>
     * The number of enhanced fan-out consumers registered with the stream.
     * </p>
     * 
     * @param consumerCount
     *        The number of enhanced fan-out consumers registered with the stream.
     */

    public void setConsumerCount(Integer consumerCount) {
        this.consumerCount = consumerCount;
    }

    /**
     * <p>
     * The number of enhanced fan-out consumers registered with the stream.
     * </p>
     * 
     * @return The number of enhanced fan-out consumers registered with the stream.
     */

    public Integer getConsumerCount() {
        return this.consumerCount;
    }

    /**
     * <p>
     * The number of enhanced fan-out consumers registered with the stream.
     * </p>
     * 
     * @param consumerCount
     *        The number of enhanced fan-out consumers registered with the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamDescriptionSummary withConsumerCount(Integer consumerCount) {
        setConsumerCount(consumerCount);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStreamName() != null)
            sb.append("StreamName: ").append(getStreamName()).append(",");
        if (getStreamARN() != null)
            sb.append("StreamARN: ").append(getStreamARN()).append(",");
        if (getStreamStatus() != null)
            sb.append("StreamStatus: ").append(getStreamStatus()).append(",");
        if (getRetentionPeriodHours() != null)
            sb.append("RetentionPeriodHours: ").append(getRetentionPeriodHours()).append(",");
        if (getStreamCreationTimestamp() != null)
            sb.append("StreamCreationTimestamp: ").append(getStreamCreationTimestamp()).append(",");
        if (getEnhancedMonitoring() != null)
            sb.append("EnhancedMonitoring: ").append(getEnhancedMonitoring()).append(",");
        if (getEncryptionType() != null)
            sb.append("EncryptionType: ").append(getEncryptionType()).append(",");
        if (getKeyId() != null)
            sb.append("KeyId: ").append(getKeyId()).append(",");
        if (getOpenShardCount() != null)
            sb.append("OpenShardCount: ").append(getOpenShardCount()).append(",");
        if (getConsumerCount() != null)
            sb.append("ConsumerCount: ").append(getConsumerCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamDescriptionSummary == false)
            return false;
        StreamDescriptionSummary other = (StreamDescriptionSummary) obj;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getStreamARN() == null ^ this.getStreamARN() == null)
            return false;
        if (other.getStreamARN() != null && other.getStreamARN().equals(this.getStreamARN()) == false)
            return false;
        if (other.getStreamStatus() == null ^ this.getStreamStatus() == null)
            return false;
        if (other.getStreamStatus() != null && other.getStreamStatus().equals(this.getStreamStatus()) == false)
            return false;
        if (other.getRetentionPeriodHours() == null ^ this.getRetentionPeriodHours() == null)
            return false;
        if (other.getRetentionPeriodHours() != null && other.getRetentionPeriodHours().equals(this.getRetentionPeriodHours()) == false)
            return false;
        if (other.getStreamCreationTimestamp() == null ^ this.getStreamCreationTimestamp() == null)
            return false;
        if (other.getStreamCreationTimestamp() != null && other.getStreamCreationTimestamp().equals(this.getStreamCreationTimestamp()) == false)
            return false;
        if (other.getEnhancedMonitoring() == null ^ this.getEnhancedMonitoring() == null)
            return false;
        if (other.getEnhancedMonitoring() != null && other.getEnhancedMonitoring().equals(this.getEnhancedMonitoring()) == false)
            return false;
        if (other.getEncryptionType() == null ^ this.getEncryptionType() == null)
            return false;
        if (other.getEncryptionType() != null && other.getEncryptionType().equals(this.getEncryptionType()) == false)
            return false;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getOpenShardCount() == null ^ this.getOpenShardCount() == null)
            return false;
        if (other.getOpenShardCount() != null && other.getOpenShardCount().equals(this.getOpenShardCount()) == false)
            return false;
        if (other.getConsumerCount() == null ^ this.getConsumerCount() == null)
            return false;
        if (other.getConsumerCount() != null && other.getConsumerCount().equals(this.getConsumerCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getStreamARN() == null) ? 0 : getStreamARN().hashCode());
        hashCode = prime * hashCode + ((getStreamStatus() == null) ? 0 : getStreamStatus().hashCode());
        hashCode = prime * hashCode + ((getRetentionPeriodHours() == null) ? 0 : getRetentionPeriodHours().hashCode());
        hashCode = prime * hashCode + ((getStreamCreationTimestamp() == null) ? 0 : getStreamCreationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getEnhancedMonitoring() == null) ? 0 : getEnhancedMonitoring().hashCode());
        hashCode = prime * hashCode + ((getEncryptionType() == null) ? 0 : getEncryptionType().hashCode());
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getOpenShardCount() == null) ? 0 : getOpenShardCount().hashCode());
        hashCode = prime * hashCode + ((getConsumerCount() == null) ? 0 : getConsumerCount().hashCode());
        return hashCode;
    }

    @Override
    public StreamDescriptionSummary clone() {
        try {
            return (StreamDescriptionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesis.model.transform.StreamDescriptionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
