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
package com.amazonaws.services.cloudwatch.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DisableInsightRulesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisableInsightRulesRequestMarshaller implements Marshaller<Request<DisableInsightRulesRequest>, DisableInsightRulesRequest> {

    public Request<DisableInsightRulesRequest> marshall(DisableInsightRulesRequest disableInsightRulesRequest) {

        if (disableInsightRulesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DisableInsightRulesRequest> request = new DefaultRequest<DisableInsightRulesRequest>(disableInsightRulesRequest, "AmazonCloudWatch");
        request.addParameter("Action", "DisableInsightRules");
        request.addParameter("Version", "2010-08-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (!disableInsightRulesRequest.getRuleNames().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) disableInsightRulesRequest.getRuleNames()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> ruleNamesList = (com.amazonaws.internal.SdkInternalList<String>) disableInsightRulesRequest
                    .getRuleNames();
            int ruleNamesListIndex = 1;

            for (String ruleNamesListValue : ruleNamesList) {
                if (ruleNamesListValue != null) {
                    request.addParameter("RuleNames.member." + ruleNamesListIndex, StringUtils.fromString(ruleNamesListValue));
                }
                ruleNamesListIndex++;
            }
        }

        return request;
    }

}
