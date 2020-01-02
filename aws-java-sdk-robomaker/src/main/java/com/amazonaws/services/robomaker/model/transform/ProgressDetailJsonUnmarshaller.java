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
package com.amazonaws.services.robomaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.robomaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ProgressDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProgressDetailJsonUnmarshaller implements Unmarshaller<ProgressDetail, JsonUnmarshallerContext> {

    public ProgressDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        ProgressDetail progressDetail = new ProgressDetail();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("currentProgress", targetDepth)) {
                    context.nextToken();
                    progressDetail.setCurrentProgress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("percentDone", targetDepth)) {
                    context.nextToken();
                    progressDetail.setPercentDone(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("estimatedTimeRemainingSeconds", targetDepth)) {
                    context.nextToken();
                    progressDetail.setEstimatedTimeRemainingSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("targetResource", targetDepth)) {
                    context.nextToken();
                    progressDetail.setTargetResource(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return progressDetail;
    }

    private static ProgressDetailJsonUnmarshaller instance;

    public static ProgressDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProgressDetailJsonUnmarshaller();
        return instance;
    }
}
