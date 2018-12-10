package dataStructure;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * 字典树 <br>
 *
 * @author smallfish<br>
 * @version 1.0<br>
 * @createDate 2018/12/04 22:14 <br>
 * @see dataStructure <br>
 */
public class DictionaryTree {
    @Data
    class TreeNode{
        //是否是前缀
        boolean isWord;
        //单词计数
        int count;
        //字符串
        String str;
        //孩子节点
        Map<String, TreeNode> childs;
        //父亲节点
        TreeNode parents;

        public TreeNode(){
            this.childs = new HashMap<>(26);
        }

        public TreeNode(boolean isWord, int count, String str){
            this();
            this.isWord = isWord;
            this.str = str;
            this.count = count;
        }

        public void addChildNode(String str,TreeNode treeNode){
            this.childs.put(str,treeNode);
            treeNode.parents = this;
        }
        public void removeChildNode(String str){
            this.childs.remove(str);
        }

    }


}
