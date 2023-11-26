/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dromara.hertzbeat.collector.collect;


import org.dromara.hertzbeat.common.entity.job.Metrics;
import org.dromara.hertzbeat.common.entity.message.CollectRep;

/**
 * Specific metrics group collection implementation abstract class
 *
 * @author tomsun28
 *
 */
public abstract class AbstractCollect {

    /**
     * Real acquisition implementation interface
     *
     * @param builder response builder
     * @param appId   App monitoring ID   
     * @param app     Application Type 
     * @param metrics Metric group configuration    
     *                return response builder
     */
    public abstract void collect(CollectRep.MetricsData.Builder builder, long appId, String app, Metrics metrics);

    /**
     * the protocol this collect instance support
     * @return protocol str
     */
    public abstract String supportProtocol();
}
