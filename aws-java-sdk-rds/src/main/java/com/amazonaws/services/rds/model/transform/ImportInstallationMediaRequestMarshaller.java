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
package com.amazonaws.services.rds.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ImportInstallationMediaRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportInstallationMediaRequestMarshaller implements Marshaller<Request<ImportInstallationMediaRequest>, ImportInstallationMediaRequest> {

    public Request<ImportInstallationMediaRequest> marshall(ImportInstallationMediaRequest importInstallationMediaRequest) {

        if (importInstallationMediaRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ImportInstallationMediaRequest> request = new DefaultRequest<ImportInstallationMediaRequest>(importInstallationMediaRequest, "AmazonRDS");
        request.addParameter("Action", "ImportInstallationMedia");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (importInstallationMediaRequest.getCustomAvailabilityZoneId() != null) {
            request.addParameter("CustomAvailabilityZoneId", StringUtils.fromString(importInstallationMediaRequest.getCustomAvailabilityZoneId()));
        }

        if (importInstallationMediaRequest.getEngine() != null) {
            request.addParameter("Engine", StringUtils.fromString(importInstallationMediaRequest.getEngine()));
        }

        if (importInstallationMediaRequest.getEngineVersion() != null) {
            request.addParameter("EngineVersion", StringUtils.fromString(importInstallationMediaRequest.getEngineVersion()));
        }

        if (importInstallationMediaRequest.getEngineInstallationMediaPath() != null) {
            request.addParameter("EngineInstallationMediaPath", StringUtils.fromString(importInstallationMediaRequest.getEngineInstallationMediaPath()));
        }

        if (importInstallationMediaRequest.getOSInstallationMediaPath() != null) {
            request.addParameter("OSInstallationMediaPath", StringUtils.fromString(importInstallationMediaRequest.getOSInstallationMediaPath()));
        }

        return request;
    }

}
