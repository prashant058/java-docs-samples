/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.datalabeling.v1beta1.samples;

// [START datalabeling_v1beta1_generated_datalabelingserviceclient_listexamples_paged_async]
import com.google.cloud.datalabeling.v1beta1.AnnotatedDatasetName;
import com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient;
import com.google.cloud.datalabeling.v1beta1.Example;
import com.google.cloud.datalabeling.v1beta1.ListExamplesRequest;
import com.google.cloud.datalabeling.v1beta1.ListExamplesResponse;
import com.google.common.base.Strings;

public class AsyncListExamplesPaged {

  public static void main(String[] args) throws Exception {
    asyncListExamplesPaged();
  }

  public static void asyncListExamplesPaged() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
      ListExamplesRequest request =
          ListExamplesRequest.newBuilder()
              .setParent(
                  AnnotatedDatasetName.of("[PROJECT]", "[DATASET]", "[ANNOTATED_DATASET]")
                      .toString())
              .setFilter("filter-1274492040")
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      while (true) {
        ListExamplesResponse response =
            dataLabelingServiceClient.listExamplesCallable().call(request);
        for (Example element : response.getExamplesList()) {
          // doThingsWith(element);
        }
        String nextPageToken = response.getNextPageToken();
        if (!Strings.isNullOrEmpty(nextPageToken)) {
          request = request.toBuilder().setPageToken(nextPageToken).build();
        } else {
          break;
        }
      }
    }
  }
}
// [END datalabeling_v1beta1_generated_datalabelingserviceclient_listexamples_paged_async]
