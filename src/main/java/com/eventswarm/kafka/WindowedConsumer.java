/**
 * Copyright 2021 Andrew Berry
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/
package com.eventswarm.kafka;

import org.apache.kafka.clients.consumer.KafkaConsumer;
import io.kcache.KafkaCache;
import com.eventswarm.abstractions.IncrementalAbstraction;

/**
 * Scalable and persistent Kafka partition consumer providing an EventSwarm sliding window
 */

public class WindowedConsumer {
    private KafkaCache kcache;
    private KafkaConsumer consumer;
    private IncrementalAbstraction window;
}