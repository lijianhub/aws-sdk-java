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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateApnsVoipChannel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateApnsVoipChannelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private APNSVoipChannelRequest aPNSVoipChannelRequest;
    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon
     * Pinpoint console.
     * </p>
     */
    private String applicationId;

    /**
     * @param aPNSVoipChannelRequest
     */

    public void setAPNSVoipChannelRequest(APNSVoipChannelRequest aPNSVoipChannelRequest) {
        this.aPNSVoipChannelRequest = aPNSVoipChannelRequest;
    }

    /**
     * @return
     */

    public APNSVoipChannelRequest getAPNSVoipChannelRequest() {
        return this.aPNSVoipChannelRequest;
    }

    /**
     * @param aPNSVoipChannelRequest
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApnsVoipChannelRequest withAPNSVoipChannelRequest(APNSVoipChannelRequest aPNSVoipChannelRequest) {
        setAPNSVoipChannelRequest(aPNSVoipChannelRequest);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon
     * Pinpoint console.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the
     *        Amazon Pinpoint console.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon
     * Pinpoint console.
     * </p>
     * 
     * @return The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the
     *         Amazon Pinpoint console.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon
     * Pinpoint console.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the
     *        Amazon Pinpoint console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApnsVoipChannelRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
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
        if (getAPNSVoipChannelRequest() != null)
            sb.append("APNSVoipChannelRequest: ").append(getAPNSVoipChannelRequest()).append(",");
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateApnsVoipChannelRequest == false)
            return false;
        UpdateApnsVoipChannelRequest other = (UpdateApnsVoipChannelRequest) obj;
        if (other.getAPNSVoipChannelRequest() == null ^ this.getAPNSVoipChannelRequest() == null)
            return false;
        if (other.getAPNSVoipChannelRequest() != null && other.getAPNSVoipChannelRequest().equals(this.getAPNSVoipChannelRequest()) == false)
            return false;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAPNSVoipChannelRequest() == null) ? 0 : getAPNSVoipChannelRequest().hashCode());
        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateApnsVoipChannelRequest clone() {
        return (UpdateApnsVoipChannelRequest) super.clone();
    }

}
