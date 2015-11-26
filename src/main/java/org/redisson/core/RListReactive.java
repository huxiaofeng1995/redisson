/**
 * Copyright 2014 Nikita Koksharov, Nickolay Borbit
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.redisson.core;

import java.util.Collection;

import rx.Observable;
import rx.Single;

/**
 *  list functions
 *
 * @author Nikita Koksharov
 *
 * @param <V> the type of elements held in this collection
 */
public interface RListReactive<V> extends RCollectionReactive<V> {

    Observable<V> descendingIterator();

    Observable<V> descendingIterator(int startIndex);

    Observable<V> iterator(int startIndex);

    Single<Integer> lastIndexOf(Object o);

    Single<Integer> indexOf(Object o);

    Single<Long> add(long index, V element);

    Single<Long> addAll(long index, Collection<? extends V> coll);

    Single<Void> fastSet(long index, V element);

    Single<V> set(long index, V element);

    Single<V> get(long index);

    Single<V> remove(int index);

}