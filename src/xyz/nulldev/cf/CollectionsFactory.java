package xyz.nulldev.cf;

import xyz.nulldev.cf.impl.DefaultCollectionsProvider;

import java.util.*;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TransferQueue;

/**
 * Project: CollectionsFactory
 * Author: nulldev
 * Creation Date: 03/07/16
 */
@SuppressWarnings("WeakerAccess")
public class CollectionsFactory {
    private static CollectionsProvider fallbackProvider = new DefaultCollectionsProvider();
    private static List<CollectionsProvider> collectionsProviders = fallbackProvider.newConcurrentList(CollectionsProvider.class);

    public static void registerProvider(CollectionsProvider provider) {
        if(provider != null && !collectionsProviders.contains(provider)) {
            collectionsProviders.add(provider);
        }
    }

    public static <K, V> Map<K, V> newMap(Class<K> keyClass, Class<V> valueClass) {
        Map<K, V> provided = null;
        for(CollectionsProvider provider : collectionsProviders) {
            if(provided != null) {
                break;
            }
            provided = provider.newMap(keyClass, valueClass);
        }
        if(provided == null) {
            provided = fallbackProvider.newMap(keyClass, valueClass);
        }
        return provided;
    }

    public static <K, V> SortedMap<K, V> newSortedMap(Class<K> keyClass, Class<V> valueClass) {
        SortedMap<K, V> provided = null;
        for(CollectionsProvider provider : collectionsProviders) {
            if(provided != null) {
                break;
            }
            provided = provider.newSortedMap(keyClass, valueClass);
        }
        if(provided == null) {
            provided = fallbackProvider.newSortedMap(keyClass, valueClass);
        }
        return provided;
    }

    public static <K, V> Map<K, V> newOrderedMap(Class<K> keyClass, Class<V> valueClass) {
        Map<K, V> provided = null;
        for(CollectionsProvider provider : collectionsProviders) {
            if(provided != null) {
                break;
            }
            provided = provider.newOrderedMap(keyClass, valueClass);
        }
        if(provided == null) {
            provided = fallbackProvider.newOrderedMap(keyClass, valueClass);
        }
        return provided;
    }

    public static <K, V> Map<K, V> newConcurrentMap(Class<K> keyClass, Class<V> valueClass) {
        Map<K, V> provided = null;
        for(CollectionsProvider provider : collectionsProviders) {
            if(provided != null) {
                break;
            }
            provided = provider.newConcurrentMap(keyClass, valueClass);
        }
        if(provided == null) {
            provided = fallbackProvider.newConcurrentMap(keyClass, valueClass);
        }
        return provided;
    }

    public static <T> List<T> newList(Class<T> typeClass) {
        List<T> provided = null;
        for(CollectionsProvider provider : collectionsProviders) {
            if(provided != null) {
                break;
            }
            provided = provider.newList(typeClass);
        }
        if(provided == null) {
            provided = fallbackProvider.newList(typeClass);
        }
        return provided;
    }

    public static <T> List<T> newConcurrentList(Class<T> typeClass) {
        List<T> provided = null;
        for(CollectionsProvider provider : collectionsProviders) {
            if(provided != null) {
                break;
            }
            provided = provider.newConcurrentList(typeClass);
        }
        if(provided == null) {
            provided = fallbackProvider.newConcurrentList(typeClass);
        }
        return provided;
    }

    public static <T> Set<T> newSet(Class<T> typeClass) {
        Set<T> provided = null;
        for(CollectionsProvider provider : collectionsProviders) {
            if(provided != null) {
                break;
            }
            provided = provider.newSet(typeClass);
        }
        if(provided == null) {
            provided = fallbackProvider.newSet(typeClass);
        }
        return provided;
    }

    public static <T> SortedSet<T> newSortedSet(Class<T> typeClass) {
        SortedSet<T> provided = null;
        for(CollectionsProvider provider : collectionsProviders) {
            if(provided != null) {
                break;
            }
            provided = provider.newSortedSet(typeClass);
        }
        if(provided == null) {
            provided = fallbackProvider.newSortedSet(typeClass);
        }
        return provided;
    }

    public static <T> Queue<T> newQueue(Class<T> typeClass) {
        Queue<T> provided = null;
        for(CollectionsProvider provider : collectionsProviders) {
            if(provided != null) {
                break;
            }
            provided = provider.newQueue(typeClass);
        }
        if(provided == null) {
            provided = fallbackProvider.newQueue(typeClass);
        }
        return provided;
    }

    public static <T> BlockingQueue<T> newBlockingQueue(Class<T> typeClass) {
        BlockingQueue<T> provided = null;
        for(CollectionsProvider provider : collectionsProviders) {
            if(provided != null) {
                break;
            }
            provided = provider.newBlockingQueue(typeClass);
        }
        if(provided == null) {
            provided = fallbackProvider.newBlockingQueue(typeClass);
        }
        return provided;
    }

    public static <T> TransferQueue<T> newTransferQueue(Class<T> typeClass) {
        TransferQueue<T> provided = null;
        for(CollectionsProvider provider : collectionsProviders) {
            if(provided != null) {
                break;
            }
            provided = provider.newTransferQueue(typeClass);
        }
        if(provided == null) {
            provided = fallbackProvider.newTransferQueue(typeClass);
        }
        return provided;
    }

    public static <T> Deque<T> newDeque(Class<T> typeClass) {
        Deque<T> provided = null;
        for(CollectionsProvider provider : collectionsProviders) {
            if(provided != null) {
                break;
            }
            provided = provider.newDeque(typeClass);
        }
        if(provided == null) {
            provided = fallbackProvider.newDeque(typeClass);
        }
        return provided;
    }

    public static <T> BlockingDeque<T> newBlockingDeque(Class<T> typeClass) {
        BlockingDeque<T> provided = null;
        for(CollectionsProvider provider : collectionsProviders) {
            if(provided != null) {
                break;
            }
            provided = provider.newBlockingDeque(typeClass);
        }
        if(provided == null) {
            provided = fallbackProvider.newBlockingDeque(typeClass);
        }
        return provided;
    }
}
