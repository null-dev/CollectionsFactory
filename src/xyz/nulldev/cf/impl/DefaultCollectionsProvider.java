package xyz.nulldev.cf.impl;

import xyz.nulldev.cf.CollectionsProvider;

import java.util.*;
import java.util.concurrent.*;

/**
 * Project: CollectionsFactory
 * Author: nulldev
 * Creation Date: 03/07/16
 *
 * Simple example implementation of a CollectionsProvider, returns the built in the Java collections.
 */
public class DefaultCollectionsProvider implements CollectionsProvider {

    @Override
    public <K, V> Map<K, V> newMap(Class<K> keyClass, Class<V> valueClass) {
        return new HashMap<>();
    }

    @Override
    public <K, V> SortedMap<K, V> newSortedMap(Class<K> keyClass, Class<V> valueClass) {
        return new TreeMap<>();
    }

    @Override
    public <K, V> Map<K, V> newOrderedMap(Class<K> keyClass, Class<V> valueClass) {
        return new LinkedHashMap<>();
    }

    @Override
    public <K, V> Map<K, V> newConcurrentMap(Class<K> keyClass, Class<V> valueClass) {
        return new ConcurrentHashMap<>();
    }

    @Override
    public <T> List<T> newList(Class<T> typeClass) {
        return new ArrayList<>();
    }

    @Override
    public <T> List<T> newConcurrentList(Class<T> typeClass) {
        return new CopyOnWriteArrayList<>();
    }

    @Override
    public <T> Set<T> newSet(Class<T> typeClass) {
        return new HashSet<>();
    }

    @Override
    public <T> SortedSet<T> newSortedSet(Class<T> typeClass) {
        return new TreeSet<>();
    }

    @Override
    public <T> Queue<T> newQueue(Class<T> typeClass) {
        return new ConcurrentLinkedQueue<>();
    }

    @Override
    public <T> BlockingQueue<T> newBlockingQueue(Class<T> typeClass) {
        return new LinkedBlockingQueue<>();
    }

    @Override
    public <T> TransferQueue<T> newTransferQueue(Class<T> typeClass) {
        return new LinkedTransferQueue<>();
    }

    @Override
    public <T> Deque<T> newDeque(Class<T> typeClass) {
        return new ConcurrentLinkedDeque<>();
    }

    @Override
    public <T> BlockingDeque<T> newBlockingDeque(Class<T> typeClass) {
        return new LinkedBlockingDeque<T>();
    }
}
