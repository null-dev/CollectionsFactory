package xyz.nulldev.cf;

import java.util.*;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TransferQueue;

/**
 * Project: CollectionsFactory
 * Author: nulldev
 * Creation Date: 03/07/16
 *
 * Mirror of CollectionsFactory.
 */
public class Collections {
    public static void registerProvider(CollectionsProvider provider) {
        CollectionsFactory.registerProvider(provider);
    }

    public static <K, V> Map<K, V> newMap(Class<K> keyClass, Class<V> valueClass) {
        return CollectionsFactory.newMap(keyClass, valueClass);
    }

    public static <K, V> SortedMap<K, V> newSortedMap(Class<K> keyClass, Class<V> valueClass) {
        return CollectionsFactory.newSortedMap(keyClass, valueClass);
    }

    public static <K, V> Map<K, V> newOrderedMap(Class<K> keyClass, Class<V> valueClass) {
        return CollectionsFactory.newOrderedMap(keyClass, valueClass);
    }

    public static <K, V> Map<K, V> newConcurrentMap(Class<K> keyClass, Class<V> valueClass) {
        return CollectionsFactory.newConcurrentMap(keyClass, valueClass);
    }

    public static <T> List<T> newList(Class<T> typeClass) {
        return CollectionsFactory.newList(typeClass);
    }

    public static <T> List<T> newConcurrentList(Class<T> typeClass) {
        return CollectionsFactory.newConcurrentList(typeClass);
    }

    public static <T> Set<T> newSet(Class<T> typeClass) {
        return CollectionsFactory.newSet(typeClass);
    }

    public static <T> SortedSet<T> newSortedSet(Class<T> typeClass) {
        return CollectionsFactory.newSortedSet(typeClass);
    }

    public static <T> Queue<T> newQueue(Class<T> typeClass) {
        return CollectionsFactory.newQueue(typeClass);
    }

    public static <T> BlockingQueue<T> newBlockingQueue(Class<T> typeClass) {
        return CollectionsFactory.newBlockingQueue(typeClass);
    }

    public static <T> TransferQueue<T> newTransferQueue(Class<T> typeClass) {
        return CollectionsFactory.newTransferQueue(typeClass);
    }

    public static <T> Deque<T> newDeque(Class<T> typeClass) {
        return CollectionsFactory.newDeque(typeClass);
    }

    public static <T> BlockingDeque<T> newBlockingDeque(Class<T> typeClass) {
        return CollectionsFactory.newBlockingDeque(typeClass);
    }
}
