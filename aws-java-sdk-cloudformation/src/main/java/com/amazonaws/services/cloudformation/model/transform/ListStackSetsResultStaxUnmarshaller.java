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
package com.amazonaws.services.cloudformation.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ListStackSetsResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStackSetsResultStaxUnmarshaller implements Unmarshaller<ListStackSetsResult, StaxUnmarshallerContext> {

    public ListStackSetsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ListStackSetsResult listStackSetsResult = new ListStackSetsResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return listStackSetsResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Summaries", targetDepth)) {
                    listStackSetsResult.withSummaries(new ArrayList<StackSetSummary>());
                    continue;
                }

                if (context.testExpression("Summaries/member", targetDepth)) {
                    listStackSetsResult.withSummaries(StackSetSummaryStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NextToken", targetDepth)) {
                    listStackSetsResult.setNextToken(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return listStackSetsResult;
                }
            }
        }
    }

    private static ListStackSetsResultStaxUnmarshaller instance;

    public static ListStackSetsResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListStackSetsResultStaxUnmarshaller();
        return instance;
    }
}
