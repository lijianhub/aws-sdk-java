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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Item in a list of satellites.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/SatelliteListItem" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SatelliteListItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * NORAD satellite ID number.
     * </p>
     */
    private Integer noradSatelliteID;
    /**
     * <p>
     * ARN of a satellite.
     * </p>
     */
    private String satelliteArn;
    /**
     * <p>
     * ID of a satellite.
     * </p>
     */
    private String satelliteId;

    /**
     * <p>
     * NORAD satellite ID number.
     * </p>
     * 
     * @param noradSatelliteID
     *        NORAD satellite ID number.
     */

    public void setNoradSatelliteID(Integer noradSatelliteID) {
        this.noradSatelliteID = noradSatelliteID;
    }

    /**
     * <p>
     * NORAD satellite ID number.
     * </p>
     * 
     * @return NORAD satellite ID number.
     */

    public Integer getNoradSatelliteID() {
        return this.noradSatelliteID;
    }

    /**
     * <p>
     * NORAD satellite ID number.
     * </p>
     * 
     * @param noradSatelliteID
     *        NORAD satellite ID number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SatelliteListItem withNoradSatelliteID(Integer noradSatelliteID) {
        setNoradSatelliteID(noradSatelliteID);
        return this;
    }

    /**
     * <p>
     * ARN of a satellite.
     * </p>
     * 
     * @param satelliteArn
     *        ARN of a satellite.
     */

    public void setSatelliteArn(String satelliteArn) {
        this.satelliteArn = satelliteArn;
    }

    /**
     * <p>
     * ARN of a satellite.
     * </p>
     * 
     * @return ARN of a satellite.
     */

    public String getSatelliteArn() {
        return this.satelliteArn;
    }

    /**
     * <p>
     * ARN of a satellite.
     * </p>
     * 
     * @param satelliteArn
     *        ARN of a satellite.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SatelliteListItem withSatelliteArn(String satelliteArn) {
        setSatelliteArn(satelliteArn);
        return this;
    }

    /**
     * <p>
     * ID of a satellite.
     * </p>
     * 
     * @param satelliteId
     *        ID of a satellite.
     */

    public void setSatelliteId(String satelliteId) {
        this.satelliteId = satelliteId;
    }

    /**
     * <p>
     * ID of a satellite.
     * </p>
     * 
     * @return ID of a satellite.
     */

    public String getSatelliteId() {
        return this.satelliteId;
    }

    /**
     * <p>
     * ID of a satellite.
     * </p>
     * 
     * @param satelliteId
     *        ID of a satellite.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SatelliteListItem withSatelliteId(String satelliteId) {
        setSatelliteId(satelliteId);
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
        if (getNoradSatelliteID() != null)
            sb.append("NoradSatelliteID: ").append(getNoradSatelliteID()).append(",");
        if (getSatelliteArn() != null)
            sb.append("SatelliteArn: ").append(getSatelliteArn()).append(",");
        if (getSatelliteId() != null)
            sb.append("SatelliteId: ").append(getSatelliteId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SatelliteListItem == false)
            return false;
        SatelliteListItem other = (SatelliteListItem) obj;
        if (other.getNoradSatelliteID() == null ^ this.getNoradSatelliteID() == null)
            return false;
        if (other.getNoradSatelliteID() != null && other.getNoradSatelliteID().equals(this.getNoradSatelliteID()) == false)
            return false;
        if (other.getSatelliteArn() == null ^ this.getSatelliteArn() == null)
            return false;
        if (other.getSatelliteArn() != null && other.getSatelliteArn().equals(this.getSatelliteArn()) == false)
            return false;
        if (other.getSatelliteId() == null ^ this.getSatelliteId() == null)
            return false;
        if (other.getSatelliteId() != null && other.getSatelliteId().equals(this.getSatelliteId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNoradSatelliteID() == null) ? 0 : getNoradSatelliteID().hashCode());
        hashCode = prime * hashCode + ((getSatelliteArn() == null) ? 0 : getSatelliteArn().hashCode());
        hashCode = prime * hashCode + ((getSatelliteId() == null) ? 0 : getSatelliteId().hashCode());
        return hashCode;
    }

    @Override
    public SatelliteListItem clone() {
        try {
            return (SatelliteListItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.SatelliteListItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
