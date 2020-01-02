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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the GPU accelerators for the instance type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/GpuDeviceInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GpuDeviceInfo implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the GPU accelerator.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The manufacturer of the GPU accelerator.
     * </p>
     */
    private String manufacturer;
    /**
     * <p>
     * The number of GPUs for the instance type.
     * </p>
     */
    private Integer count;
    /**
     * <p>
     * Describes the memory available to the GPU accelerator.
     * </p>
     */
    private GpuDeviceMemoryInfo memoryInfo;

    /**
     * <p>
     * The name of the GPU accelerator.
     * </p>
     * 
     * @param name
     *        The name of the GPU accelerator.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the GPU accelerator.
     * </p>
     * 
     * @return The name of the GPU accelerator.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the GPU accelerator.
     * </p>
     * 
     * @param name
     *        The name of the GPU accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GpuDeviceInfo withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The manufacturer of the GPU accelerator.
     * </p>
     * 
     * @param manufacturer
     *        The manufacturer of the GPU accelerator.
     */

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * <p>
     * The manufacturer of the GPU accelerator.
     * </p>
     * 
     * @return The manufacturer of the GPU accelerator.
     */

    public String getManufacturer() {
        return this.manufacturer;
    }

    /**
     * <p>
     * The manufacturer of the GPU accelerator.
     * </p>
     * 
     * @param manufacturer
     *        The manufacturer of the GPU accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GpuDeviceInfo withManufacturer(String manufacturer) {
        setManufacturer(manufacturer);
        return this;
    }

    /**
     * <p>
     * The number of GPUs for the instance type.
     * </p>
     * 
     * @param count
     *        The number of GPUs for the instance type.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of GPUs for the instance type.
     * </p>
     * 
     * @return The number of GPUs for the instance type.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * The number of GPUs for the instance type.
     * </p>
     * 
     * @param count
     *        The number of GPUs for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GpuDeviceInfo withCount(Integer count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * Describes the memory available to the GPU accelerator.
     * </p>
     * 
     * @param memoryInfo
     *        Describes the memory available to the GPU accelerator.
     */

    public void setMemoryInfo(GpuDeviceMemoryInfo memoryInfo) {
        this.memoryInfo = memoryInfo;
    }

    /**
     * <p>
     * Describes the memory available to the GPU accelerator.
     * </p>
     * 
     * @return Describes the memory available to the GPU accelerator.
     */

    public GpuDeviceMemoryInfo getMemoryInfo() {
        return this.memoryInfo;
    }

    /**
     * <p>
     * Describes the memory available to the GPU accelerator.
     * </p>
     * 
     * @param memoryInfo
     *        Describes the memory available to the GPU accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GpuDeviceInfo withMemoryInfo(GpuDeviceMemoryInfo memoryInfo) {
        setMemoryInfo(memoryInfo);
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
        if (getManufacturer() != null)
            sb.append("Manufacturer: ").append(getManufacturer()).append(",");
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getMemoryInfo() != null)
            sb.append("MemoryInfo: ").append(getMemoryInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GpuDeviceInfo == false)
            return false;
        GpuDeviceInfo other = (GpuDeviceInfo) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getManufacturer() == null ^ this.getManufacturer() == null)
            return false;
        if (other.getManufacturer() != null && other.getManufacturer().equals(this.getManufacturer()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getMemoryInfo() == null ^ this.getMemoryInfo() == null)
            return false;
        if (other.getMemoryInfo() != null && other.getMemoryInfo().equals(this.getMemoryInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getManufacturer() == null) ? 0 : getManufacturer().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getMemoryInfo() == null) ? 0 : getMemoryInfo().hashCode());
        return hashCode;
    }

    @Override
    public GpuDeviceInfo clone() {
        try {
            return (GpuDeviceInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
