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
package com.amazonaws.services.managedblockchain.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration properties of the member.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/MemberConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MemberConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the member.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An optional description of the member.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Configuration properties of the blockchain framework relevant to the member.
     * </p>
     */
    private MemberFrameworkConfiguration frameworkConfiguration;

    /**
     * <p>
     * The name of the member.
     * </p>
     * 
     * @param name
     *        The name of the member.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the member.
     * </p>
     * 
     * @return The name of the member.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the member.
     * </p>
     * 
     * @param name
     *        The name of the member.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberConfiguration withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An optional description of the member.
     * </p>
     * 
     * @param description
     *        An optional description of the member.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description of the member.
     * </p>
     * 
     * @return An optional description of the member.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * An optional description of the member.
     * </p>
     * 
     * @param description
     *        An optional description of the member.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberConfiguration withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Configuration properties of the blockchain framework relevant to the member.
     * </p>
     * 
     * @param frameworkConfiguration
     *        Configuration properties of the blockchain framework relevant to the member.
     */

    public void setFrameworkConfiguration(MemberFrameworkConfiguration frameworkConfiguration) {
        this.frameworkConfiguration = frameworkConfiguration;
    }

    /**
     * <p>
     * Configuration properties of the blockchain framework relevant to the member.
     * </p>
     * 
     * @return Configuration properties of the blockchain framework relevant to the member.
     */

    public MemberFrameworkConfiguration getFrameworkConfiguration() {
        return this.frameworkConfiguration;
    }

    /**
     * <p>
     * Configuration properties of the blockchain framework relevant to the member.
     * </p>
     * 
     * @param frameworkConfiguration
     *        Configuration properties of the blockchain framework relevant to the member.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberConfiguration withFrameworkConfiguration(MemberFrameworkConfiguration frameworkConfiguration) {
        setFrameworkConfiguration(frameworkConfiguration);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getFrameworkConfiguration() != null)
            sb.append("FrameworkConfiguration: ").append(getFrameworkConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MemberConfiguration == false)
            return false;
        MemberConfiguration other = (MemberConfiguration) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getFrameworkConfiguration() == null ^ this.getFrameworkConfiguration() == null)
            return false;
        if (other.getFrameworkConfiguration() != null && other.getFrameworkConfiguration().equals(this.getFrameworkConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getFrameworkConfiguration() == null) ? 0 : getFrameworkConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public MemberConfiguration clone() {
        try {
            return (MemberConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchain.model.transform.MemberConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
