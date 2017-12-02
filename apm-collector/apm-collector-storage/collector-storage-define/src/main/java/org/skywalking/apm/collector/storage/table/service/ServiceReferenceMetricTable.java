/*
 * Copyright 2017, OpenSkywalking Organization All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Project repository: https://github.com/OpenSkywalking/skywalking
 */

package org.skywalking.apm.collector.storage.table.service;

import org.skywalking.apm.collector.core.data.CommonTable;

/**
 * @author peng-yongsheng
 */
public class ServiceReferenceMetricTable extends CommonTable {
    public static final String TABLE = "service_reference_metric";
    public static final String COLUMN_ENTRY_SERVICE_ID = "entry_service_id";
    public static final String COLUMN_FRONT_SERVICE_ID = "front_service_id";
    public static final String COLUMN_BEHIND_SERVICE_ID = "behind_service_id";
    public static final String COLUMN_TRANSACTION_CALLS = "transaction_calls";
    public static final String COLUMN_TRANSACTION_ERROR_CALLS = "transaction_error_calls";
    public static final String COLUMN_TRANSACTION_DURATION_SUM = "transaction_duration_sum";
    public static final String COLUMN_TRANSACTION_ERROR_DURATION_SUM = "transaction_error_duration_sum";
    public static final String COLUMN_BUSINESS_TRANSACTION_CALLS = "business_transaction_calls";
    public static final String COLUMN_BUSINESS_TRANSACTION_ERROR_CALLS = "business_transaction_error_calls";
    public static final String COLUMN_BUSINESS_TRANSACTION_DURATION_SUM = "business_transaction_duration_sum";
    public static final String COLUMN_BUSINESS_TRANSACTION_ERROR_DURATION_SUM = "business_transaction_error_duration_sum";
    public static final String COLUMN_MQ_TRANSACTION_CALLS = "mq_transaction_calls";
    public static final String COLUMN_MQ_TRANSACTION_ERROR_CALLS = "mq_transaction_error_calls";
    public static final String COLUMN_MQ_TRANSACTION_DURATION_SUM = "mq_transaction_duration_sum";
    public static final String COLUMN_MQ_TRANSACTION_ERROR_DURATION_SUM = "mq_transaction_error_duration_sum";
}