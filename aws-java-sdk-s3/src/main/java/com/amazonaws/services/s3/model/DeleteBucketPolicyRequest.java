/*
 * Copyright 2011-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.s3.model;
import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.services.s3.AmazonS3;

/**
 * Deletes the policy associated with the specified bucket. Only the owner of
 * the bucket can delete the bucket policy. </p>
 * <p>
 * Bucket policies provide access control management at the bucket level for
 * both the bucket resource and contained object resources. Only one policy can
 * be specified per-bucket.
 * </p>
 * <p>
 * See the <a href="http://docs.amazonwebservices.com/AmazonS3/latest/dev/">
 * Amazon S3 developer guide</a> for more information on forming bucket polices.
 * </p>
 *
 * @see AmazonS3#deleteBucketPolicy(DeleteBucketPolicyRequest)
 */
public class DeleteBucketPolicyRequest extends AmazonWebServiceRequest implements Serializable {

    /** The name of the Amazon S3 bucket whose policy is being deleted. */
    private String bucketName;


    /**
     * Creates a new request object, ready to be executed to delete the bucket
     * policy of an Amazon S3 bucket.
     *
     * @param bucketName
     *            The name of the Amazon S3 bucket whose policy is being
     *            deleted.
     */
    public DeleteBucketPolicyRequest(String bucketName) {
        this.bucketName = bucketName;
    }


    /**
     * Returns the name of the Amazon S3 bucket whose policy is being deleted.
     *
     * @return The name of the Amazon S3 bucket whose policy is being deleted.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the Amazon S3 bucket whose policy is being deleted.
     *
     * @param bucketName
     *            The name of the Amazon S3 bucket whose policy is being
     *            deleted.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Sets the name of the Amazon S3 bucket whose policy is being deleted, and
     * returns the updated request object so that additional method calls can be
     * chained together.
     *
     * @param bucketName
     *            The name of the Amazon S3 bucket whose policy is being
     *            deleted.
     *
     * @return The updated request object so that additional method calls can be
     *         chained together.
     */
    public DeleteBucketPolicyRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }
}
