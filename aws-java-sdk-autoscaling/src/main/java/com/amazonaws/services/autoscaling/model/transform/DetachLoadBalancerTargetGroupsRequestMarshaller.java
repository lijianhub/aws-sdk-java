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
package com.amazonaws.services.autoscaling.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DetachLoadBalancerTargetGroupsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetachLoadBalancerTargetGroupsRequestMarshaller implements
        Marshaller<Request<DetachLoadBalancerTargetGroupsRequest>, DetachLoadBalancerTargetGroupsRequest> {

    public Request<DetachLoadBalancerTargetGroupsRequest> marshall(DetachLoadBalancerTargetGroupsRequest detachLoadBalancerTargetGroupsRequest) {

        if (detachLoadBalancerTargetGroupsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DetachLoadBalancerTargetGroupsRequest> request = new DefaultRequest<DetachLoadBalancerTargetGroupsRequest>(
                detachLoadBalancerTargetGroupsRequest, "AmazonAutoScaling");
        request.addParameter("Action", "DetachLoadBalancerTargetGroups");
        request.addParameter("Version", "2011-01-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (detachLoadBalancerTargetGroupsRequest.getAutoScalingGroupName() != null) {
            request.addParameter("AutoScalingGroupName", StringUtils.fromString(detachLoadBalancerTargetGroupsRequest.getAutoScalingGroupName()));
        }

        if (!detachLoadBalancerTargetGroupsRequest.getTargetGroupARNs().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) detachLoadBalancerTargetGroupsRequest.getTargetGroupARNs()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> targetGroupARNsList = (com.amazonaws.internal.SdkInternalList<String>) detachLoadBalancerTargetGroupsRequest
                    .getTargetGroupARNs();
            int targetGroupARNsListIndex = 1;

            for (String targetGroupARNsListValue : targetGroupARNsList) {
                if (targetGroupARNsListValue != null) {
                    request.addParameter("TargetGroupARNs.member." + targetGroupARNsListIndex, StringUtils.fromString(targetGroupARNsListValue));
                }
                targetGroupARNsListIndex++;
            }
        }

        return request;
    }

}
