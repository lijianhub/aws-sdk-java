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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateAddressBook" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAddressBookResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the newly created address book.
     * </p>
     */
    private String addressBookArn;

    /**
     * <p>
     * The ARN of the newly created address book.
     * </p>
     * 
     * @param addressBookArn
     *        The ARN of the newly created address book.
     */

    public void setAddressBookArn(String addressBookArn) {
        this.addressBookArn = addressBookArn;
    }

    /**
     * <p>
     * The ARN of the newly created address book.
     * </p>
     * 
     * @return The ARN of the newly created address book.
     */

    public String getAddressBookArn() {
        return this.addressBookArn;
    }

    /**
     * <p>
     * The ARN of the newly created address book.
     * </p>
     * 
     * @param addressBookArn
     *        The ARN of the newly created address book.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAddressBookResult withAddressBookArn(String addressBookArn) {
        setAddressBookArn(addressBookArn);
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
        if (getAddressBookArn() != null)
            sb.append("AddressBookArn: ").append(getAddressBookArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAddressBookResult == false)
            return false;
        CreateAddressBookResult other = (CreateAddressBookResult) obj;
        if (other.getAddressBookArn() == null ^ this.getAddressBookArn() == null)
            return false;
        if (other.getAddressBookArn() != null && other.getAddressBookArn().equals(this.getAddressBookArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddressBookArn() == null) ? 0 : getAddressBookArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateAddressBookResult clone() {
        try {
            return (CreateAddressBookResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
