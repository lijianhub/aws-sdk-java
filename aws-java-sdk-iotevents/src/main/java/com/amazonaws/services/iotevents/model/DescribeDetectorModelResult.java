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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/DescribeDetectorModel" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDetectorModelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the detector model.
     * </p>
     */
    private DetectorModel detectorModel;

    /**
     * <p>
     * Information about the detector model.
     * </p>
     * 
     * @param detectorModel
     *        Information about the detector model.
     */

    public void setDetectorModel(DetectorModel detectorModel) {
        this.detectorModel = detectorModel;
    }

    /**
     * <p>
     * Information about the detector model.
     * </p>
     * 
     * @return Information about the detector model.
     */

    public DetectorModel getDetectorModel() {
        return this.detectorModel;
    }

    /**
     * <p>
     * Information about the detector model.
     * </p>
     * 
     * @param detectorModel
     *        Information about the detector model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDetectorModelResult withDetectorModel(DetectorModel detectorModel) {
        setDetectorModel(detectorModel);
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
        if (getDetectorModel() != null)
            sb.append("DetectorModel: ").append(getDetectorModel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDetectorModelResult == false)
            return false;
        DescribeDetectorModelResult other = (DescribeDetectorModelResult) obj;
        if (other.getDetectorModel() == null ^ this.getDetectorModel() == null)
            return false;
        if (other.getDetectorModel() != null && other.getDetectorModel().equals(this.getDetectorModel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorModel() == null) ? 0 : getDetectorModel().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDetectorModelResult clone() {
        try {
            return (DescribeDetectorModelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
