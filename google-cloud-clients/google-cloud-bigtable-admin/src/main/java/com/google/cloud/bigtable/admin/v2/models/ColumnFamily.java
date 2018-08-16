/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.bigtable.admin.v2.models;

import static com.google.cloud.bigtable.admin.v2.models.GCRules.GCRULES;

import com.google.api.core.InternalApi;
import com.google.bigtable.admin.v2.GcRule;
import com.google.bigtable.admin.v2.GcRule.RuleCase;
import com.google.cloud.bigtable.admin.v2.models.GCRules.GCRule;
import com.google.common.base.MoreObjects;

/** Wrapper for {@link ColumnFamily} protocol buffer object */
public final class ColumnFamily {
  // TODO(igorbernstein2): rename this to `name`
  private final String id;
  private final GCRule rule;

  @InternalApi
  public static ColumnFamily fromProto(String id, com.google.bigtable.admin.v2.ColumnFamily proto) {
    // TODO(igorbernstein): can getGcRule ever be null?
    GcRule ruleProto = MoreObjects.firstNonNull(proto.getGcRule(), GcRule.getDefaultInstance());

    return new ColumnFamily(id, GCRULES.fromProto(ruleProto));
  }

  private ColumnFamily(String id, GCRule rule) {
    this.id = id;
    this.rule = rule;
  }

  /**
   * Gets the columnfamily name
   */
  public String getId() {
    return id;
  }

  /**
   * Get's the GCRule configured for the columnfamily
   */
  public GCRule getGCRule() {
    return rule;
  }

  /**
   * Returns true if a GCRule has been configured for the family
   */
  public boolean hasGCRule() {
    return !RuleCase.RULE_NOT_SET.equals(rule.toProto().getRuleCase());
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this).add("id", id).add("GCRule", rule).toString();
  }
}