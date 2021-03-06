// Copyright 2016 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.adwords.awreporting.model.csv.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Annotation to map a field in the CSV file to the annotated bean property.
 *
 * The CSV is constructed based on the mapping between the report property selected and the file
 * created.
 */
@Target({FIELD})
@Retention(RUNTIME)
public @interface CsvField {

  /**
   * The name of the property in the CSV file.
   */
  String value();

  /**
   * The report field on the API that will be selected to download.
   */
  String reportField();

}
