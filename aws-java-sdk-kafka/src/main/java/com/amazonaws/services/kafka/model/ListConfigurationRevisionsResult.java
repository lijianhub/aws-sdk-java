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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ListConfigurationRevisions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListConfigurationRevisionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Paginated results marker.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * List of ConfigurationRevision objects.
     * </p>
     */
    private java.util.List<ConfigurationRevision> revisions;

    /**
     * <p>
     * Paginated results marker.
     * </p>
     * 
     * @param nextToken
     *        <p>
     *        Paginated results marker.
     *        </p>
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Paginated results marker.
     * </p>
     * 
     * @return <p>
     *         Paginated results marker.
     *         </p>
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Paginated results marker.
     * </p>
     * 
     * @param nextToken
     *        <p>
     *        Paginated results marker.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationRevisionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * List of ConfigurationRevision objects.
     * </p>
     * 
     * @return <p>
     *         List of ConfigurationRevision objects.
     *         </p>
     */

    public java.util.List<ConfigurationRevision> getRevisions() {
        return revisions;
    }

    /**
     * <p>
     * List of ConfigurationRevision objects.
     * </p>
     * 
     * @param revisions
     *        <p>
     *        List of ConfigurationRevision objects.
     *        </p>
     */

    public void setRevisions(java.util.Collection<ConfigurationRevision> revisions) {
        if (revisions == null) {
            this.revisions = null;
            return;
        }

        this.revisions = new java.util.ArrayList<ConfigurationRevision>(revisions);
    }

    /**
     * <p>
     * List of ConfigurationRevision objects.
     * </p>
     * 
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRevisions(java.util.Collection)} or {@link #withRevisions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param revisions
     *        <p>
     *        List of ConfigurationRevision objects.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationRevisionsResult withRevisions(ConfigurationRevision... revisions) {
        if (this.revisions == null) {
            setRevisions(new java.util.ArrayList<ConfigurationRevision>(revisions.length));
        }
        for (ConfigurationRevision ele : revisions) {
            this.revisions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of ConfigurationRevision objects.
     * </p>
     * 
     * @param revisions
     *        <p>
     *        List of ConfigurationRevision objects.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationRevisionsResult withRevisions(java.util.Collection<ConfigurationRevision> revisions) {
        setRevisions(revisions);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getRevisions() != null)
            sb.append("Revisions: ").append(getRevisions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListConfigurationRevisionsResult == false)
            return false;
        ListConfigurationRevisionsResult other = (ListConfigurationRevisionsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRevisions() == null ^ this.getRevisions() == null)
            return false;
        if (other.getRevisions() != null && other.getRevisions().equals(this.getRevisions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRevisions() == null) ? 0 : getRevisions().hashCode());
        return hashCode;
    }

    @Override
    public ListConfigurationRevisionsResult clone() {
        try {
            return (ListConfigurationRevisionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
