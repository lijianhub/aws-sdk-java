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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <note>
 * <p>
 * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information, including
 * how to migrate your AWS WAF resources from the prior release, see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
 * </p>
 * </note>
 * <p>
 * Part of the response from <a>GetSampledRequests</a>. This is a complex type that appears as <code>Headers</code> in
 * the response syntax. <code>HTTPHeader</code> contains the names and values of all of the headers that appear in one
 * of the web requests.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/HTTPHeader" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HTTPHeader implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the HTTP header.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The value of the HTTP header.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The name of the HTTP header.
     * </p>
     * 
     * @param name
     *        The name of the HTTP header.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the HTTP header.
     * </p>
     * 
     * @return The name of the HTTP header.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the HTTP header.
     * </p>
     * 
     * @param name
     *        The name of the HTTP header.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HTTPHeader withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The value of the HTTP header.
     * </p>
     * 
     * @param value
     *        The value of the HTTP header.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the HTTP header.
     * </p>
     * 
     * @return The value of the HTTP header.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the HTTP header.
     * </p>
     * 
     * @param value
     *        The value of the HTTP header.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HTTPHeader withValue(String value) {
        setValue(value);
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HTTPHeader == false)
            return false;
        HTTPHeader other = (HTTPHeader) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public HTTPHeader clone() {
        try {
            return (HTTPHeader) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.HTTPHeaderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
