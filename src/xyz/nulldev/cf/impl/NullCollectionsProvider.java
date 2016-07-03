package xyz.nulldev.cf.impl;

import xyz.nulldev.cf.CollectionsProvider;

import java.util.*;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TransferQueue;

/**
 * Project: CollectionsFactory
 * Author: nulldev
 * Creation Date: 03/07/16
 *
 * Custom collection providers can extend this class if they only provide a small portion of the Java collections.
 */
public class NullCollectionsProvider implements CollectionsProvider {
    @Override
    public <K, V> Map<K, V> newMap(Class<K> keyClass, Class<V> valueClass) {
        return null;
    }

    @Override
    public <K, V> SortedMap<K, V> newSortedMap(Class<K> keyClass, Class<V> valueClass) {
        return null;
    }

    @Override
    public <K, V> Map<K, V> newOrderedMap(Class<K> keyClass, Class<V> valueClass) {
        return null;
    }

    @Override
    public <K, V> Map<K, V> newConcurrentMap(Class<K> keyClass, Class<V> valueClass) {
        return null;
    }

    @Override
    public <T> List<T> newList(Class<T> typeClass) {
        return null;
    }

    @Override
    public <T> List<T> newConcurrentList(Class<T> typeClass) {
        return null;
    }

    @Override
    public <T> Set<T> newSet(Class<T> typeClass) {
        return null;
    }

    @Override
    public <T> SortedSet<T> newSortedSet(Class<T> typeClass) {
        return null;
    }

    @Override
    public <T> Queue<T> newQueue(Class<T> typeClass) {
        return null;
    }

    @Override
    public <T> BlockingQueue<T> newBlockingQueue(Class<T> typeClass) {
        return null;
    }

    @Override
    public <T> TransferQueue<T> newTransferQueue(Class<T> typeClass) {
        return null;
    }

    @Override
    public <T> Deque<T> newDeque(Class<T> typeClass) {
        return null;
    }

    @Override
    public <T> BlockingDeque<T> newBlockingDeque(Class<T> typeClass) {
        return null;
    }
}
