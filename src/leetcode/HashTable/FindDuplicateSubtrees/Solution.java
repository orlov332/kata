package leetcode.HashTable.FindDuplicateSubtrees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Solution {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> result = new LinkedList<>();
        traverse(root, new HashMap<>(), new HashMap<>(), result);
        return result;
    }

    public int traverse(TreeNode node, Map<String, Integer> nodeIds, Map<Integer, Integer> idCount, List<TreeNode> duplicates) {
        if (node == null) {
            return 0;
        }
        String nodeKey = String.format("%d,%d,%d",
                traverse(node.left, nodeIds, idCount, duplicates),
                node.val,
                traverse(node.right, nodeIds, idCount, duplicates));

        int id = nodeIds.computeIfAbsent(nodeKey, k -> nodeIds.size() + 1);
        if (idCount.compute(id, (k, v) -> v == null ? 1 : v + 1) == 2) {
            duplicates.add(node);
        }
        return id;
    }
}
