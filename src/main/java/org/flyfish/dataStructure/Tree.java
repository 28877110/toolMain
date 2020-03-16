package org.flyfish.dataStructure;

/**
 * 简单的一些二叉树内容 <br>
 *
 * @author smallfish<br>
 * @version 1.0<br>
 * @createDate 2018/12/03 22:59 <br>
 * @see org.flyfish.dataStructure <br>
 */
public class Tree {
    //树的最大深度
    public int maxDeath(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }
        return Math.max(maxDeath(treeNode.leftNode), maxDeath(treeNode.rightNode)) + 1;
    }

    //判断树是否相同
    public boolean isEqual(TreeNode treeNode1, TreeNode treeNode2) {
        if (treeNode1 == null && treeNode2 == null) {
            return true;
        }
        if (treeNode1 == null || treeNode2 == null) {
            return false;
        }
        if (treeNode1.val != treeNode2.val) {
            return false;
        }
        return isEqual(treeNode1.leftNode, treeNode1.rightNode) && isEqual(treeNode2.leftNode, treeNode2.rightNode);
    }

    //判断2颗树是否是镜像树
    public boolean isMirror(TreeNode treeNode1, TreeNode treeNode2){
        if(treeNode1 ==null && treeNode2 == null ){
            return true;
        }
        if(treeNode1 == null || treeNode2 ==null){
            return  false;
        }
        if(treeNode1.val != treeNode2.val){
            return false;
        }
        return isMirror(treeNode1.leftNode , treeNode2.rightNode) && isMirror(treeNode2.leftNode,treeNode1.rightNode);
    }

    //翻转二叉树
    public TreeNode reversalTree(TreeNode treeNode){
        if(treeNode == null) {
            return null;
        }
        TreeNode leftNode = reversalTree(treeNode.leftNode);
        TreeNode rightNode = reversalTree(treeNode.rightNode);
        treeNode.rightNode = leftNode;
        treeNode.leftNode = rightNode;
        return treeNode;
    }



    class TreeNode {
        //值
        int val;
        //左节点
        TreeNode leftNode;
        //右节点
        TreeNode rightNode;
    }

}
