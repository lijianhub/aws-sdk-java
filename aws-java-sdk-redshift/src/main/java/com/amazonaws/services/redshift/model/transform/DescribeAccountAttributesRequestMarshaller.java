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
package com.amazonaws.services.redshift.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribeAccountAttributesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAccountAttributesRequestMarshaller implements Marshaller<Request<DescribeAccountAttributesRequest>, DescribeAccountAttributesRequest> {

    public Request<DescribeAccountAttributesRequest> marshall(DescribeAccountAttributesRequest describeAccountAttributesRequest) {

        if (describeAccountAttributesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeAccountAttributesRequest> request = new DefaultRequest<DescribeAccountAttributesRequest>(describeAccountAttributesRequest,
                "AmazonRedshift");
        request.addParameter("Action", "DescribeAccountAttributes");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (!describeAccountAttributesRequest.getAttributeNames().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) describeAccountAttributesRequest.getAttributeNames()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> attributeNamesList = (com.amazonaws.internal.SdkInternalList<String>) describeAccountAttributesRequest
                    .getAttributeNames();
            int attributeNamesListIndex = 1;

            for (String attributeNamesListValue : attributeNamesList) {
                if (attributeNamesListValue != null) {
                    request.addParameter("AttributeNames.AttributeName." + attributeNamesListIndex, StringUtils.fromString(attributeNamesListValue));
                }
                attributeNamesListIndex++;
            }
        }

        return request;
    }

}
