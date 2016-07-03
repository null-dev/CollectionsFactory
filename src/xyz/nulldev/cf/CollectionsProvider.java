package xyz.nulldev.cf;

import java.util.*;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TransferQueue;

/**
 * Project: CollectionsFactory
 * Author: nulldev
 * Creation Date: 03/07/16
 */
public interface CollectionsProvider {
    <K, V> Map<K, V> newMap(Class<K> keyClass, Class<V> valueClass);

    <K, V> SortedMap<K, V> newSortedMap(Class<K> keyClass, Class<V> valueClass);

    <K, V> Map<K, V> newOrderedMap(Class<K> keyClass, Class<V> valueClass);

    <K, V> Map<K, V> newConcurrentMap(Class<K> keyClass, Class<V> valueClass);

    <T> List<T> newList(Class<T> typeClass);

    <T> List<T> newConcurrentList(Class<T> typeClass);

    <T> Set<T> newSet(Class<T> typeClass);

    <T> SortedSet<T> newSortedSet(Class<T> typeClass);

    <T> Queue<T> newQueue(Class<T> typeClass);

    <T> BlockingQueue<T> newBlockingQueue(Class<T> typeClass);

    <T> TransferQueue<T> newTransferQueue(Class<T> typeClass);

    <T> Deque<T> newDeque(Class<T> typeClass);

    <T> BlockingDeque<T> newBlockingDeque(Class<T> typeClass);
}
