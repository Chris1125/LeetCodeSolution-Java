package Q0300_0399.Q0381;

import java.util.*;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/insert-delete-getrandom-o1-duplicates-allowed/">O(1) 时间插入、删除和获取随机元素 - 允许重复</a>
 * Difficulty: Hard
 * Status: TODO
 * Daily: 2020-10-31
 * @since 2020-10-31
 */
public class RandomizedCollection {

    final Map<Integer, Integer> map;
    final List<Integer> list;

    /**
     * Initialize your data structure here.
     */
    public RandomizedCollection() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }

    /**
     * Inserts a value to the collection. Returns true if the collection did not already contain the specified element.
     */
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }

        map.put(val, val);
        list.add(val, val);

        return true;
    }

    /**
     * Removes a value from the collection. Returns true if the collection contained the specified element.
     */
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }

        map.remove(val);
        list.remove(val);
        return true;
    }

    /**
     * Get a random element from the collection.
     */
    public int getRandom() {
        return list.get(new Random().nextInt() * list.size());
    }

}